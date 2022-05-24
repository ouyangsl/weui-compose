package weui.components.progress

import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import weui.WeUITheme

/**
 * 进度条
 */
/**
 * 进度条
 *
 * @param progress 进度值：0.0 - 1.0
 * @param modifier 修饰符
 * @param lineWidth 进度条线宽
 * @param backgroundColor 背景绘制色
 * @param foregroundColor 前景绘制色
 */
@Composable
fun Progress(
    progress: Float,
    modifier: Modifier = Modifier,
    lineWidth: Dp = 3.dp,
    backgroundColor: Color = WeUITheme.colors.divider,
    foregroundColor: Color = WeUITheme.colors.success
) {
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = SpringSpec(
            dampingRatio = 1f,
            stiffness = 50f,
            visibilityThreshold = 1 / 1000f
        )
    )

    Canvas(modifier = modifier.height(lineWidth)) {
        val offsetY = size.height / 2

        drawLine(
            backgroundColor,
            Offset(0f, offsetY),
            Offset(size.width, offsetY),
            size.height
        )

        drawLine(
            foregroundColor,
            Offset(0f, offsetY),
            Offset(size.width * animatedProgress.value, offsetY),
            size.height
        )
    }
}