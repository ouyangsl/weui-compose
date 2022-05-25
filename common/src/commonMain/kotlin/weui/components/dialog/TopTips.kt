package weui.components.dialog

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import weui.core.CompactMaxWidth
import weui.theme.WeUI

/**
 * 顶部提示条
 *
 * @param text 提示文本
 */
@Composable
expect fun TopTips(text: String)

@Composable
fun TopTipsContent(
    text: String,
    modifier: Modifier = Modifier
) {
    var alpha by remember { mutableStateOf(0f) }
    val alphaAnimate = animateFloatAsState(alpha)

    DisposableEffect(Unit) {
        alpha = 1f

        onDispose {
            alpha = 0f
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .alpha(alphaAnimate.value)
            .sizeIn(maxWidth = CompactMaxWidth)
            .then(modifier)
            .clip(RoundedCornerShape(5.dp))
            .background(WeUI.colors.error)
            .padding(
                horizontal = 15.dp,
                vertical = 10.dp
            )
    ) {
        BasicText(
            text = text,
            style = WeUI.typography.title.copy(
                color = Color.White
            )
        )
    }
}