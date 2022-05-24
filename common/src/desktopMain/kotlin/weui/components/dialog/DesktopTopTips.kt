package weui.components.dialog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider

/**
 * 顶部提示条
 *
 * @param text 提示文本
 */
@Composable
actual fun TopTips(text: String) {
    Popup(popupPositionProvider = object : PopupPositionProvider {
        override fun calculatePosition(
            anchorBounds: IntRect,
            windowSize: IntSize,
            layoutDirection: LayoutDirection,
            popupContentSize: IntSize
        ): IntOffset {
            return IntOffset(
                windowSize.width / 2 - popupContentSize.width / 2,
                0
            )
        }
    }) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.padding(10.dp)
        ) {
            TopTipsContent(
                text = text,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}