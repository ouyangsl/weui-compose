package weui.components.dialog

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider

/**
 * 包含标题及内容的文本弹窗
 *
 * @param title 标题
 * @param content 内容
 * @param defaultButton 次要按钮文本
 * @param primaryButton 主要按钮文本
 * @param onDefaultClick 次要按钮点击回调
 * @param onPrimaryClick 主要按钮点击回调
 */
@Composable
actual fun TextDialog(
    title: String,
    content: String,
    defaultButton: String,
    primaryButton: String,
    onDefaultClick: () -> Unit,
    onPrimaryClick: () -> Unit
) {
    BasicPopup {
        TextDialogContent(
            title = title,
            content = content,
            defaultButton = defaultButton,
            primaryButton = primaryButton,
            onDefaultClick = onDefaultClick,
            onPrimaryClick = onPrimaryClick
        )
    }
}

/**
 * 仅包含标题的文本弹窗
 *
 * @param title 标题
 * @param button 按钮文本
 * @param onClick 按钮点击回调
 */
@Composable
actual fun TextDialog(title: String, button: String, onClick: () -> Unit) {
    BasicPopup {
        TextDialogContent(
            title = title, button = button, onClick = onClick
        )
    }
}

@Composable
private fun BasicPopup(
    content: @Composable BoxScope.() -> Unit
) = Popup(popupPositionProvider = object : PopupPositionProvider {
    override fun calculatePosition(
        anchorBounds: IntRect, windowSize: IntSize, layoutDirection: LayoutDirection, popupContentSize: IntSize
    ): IntOffset {
        return IntOffset(0, 0)
    }
}) {
    MaskBox(modifier = Modifier.fillMaxSize(), content = content)
}