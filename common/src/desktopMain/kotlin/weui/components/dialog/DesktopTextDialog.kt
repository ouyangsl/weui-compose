package weui.components.dialog

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Popup

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
    Popup(popupPositionProvider = EmptyPopupPositionProvider) {
        MaskBox(modifier = Modifier.fillMaxSize()) {
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
}

/**
 * 仅包含标题的文本弹窗
 *
 * @param title 标题
 * @param button 按钮文本
 * @param onClick 按钮点击回调
 */
@Composable
actual fun TextDialog(
    title: String,
    button: String,
    onClick: () -> Unit
) {
    Popup(popupPositionProvider = EmptyPopupPositionProvider) {
        MaskBox(modifier = Modifier.fillMaxSize()) {
            TextDialogContent(
                title = title,
                button = button,
                onClick = onClick
            )
        }
    }
}