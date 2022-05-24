package weui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/**
 * 全局形状配置
 */
@Immutable
data class Shapes(
    // 默认按钮
    val buttonDefault: Shape = RoundedCornerShape(8.dp),
    // 行按钮
    val buttonCell: Shape = RectangleShape,
    // 中央弹窗
    val dialogCenter: Shape = RoundedCornerShape(8.dp),
    // 底部弹窗
    val dialogBottom: Shape = RoundedCornerShape(
        topStart = 8.dp,
        topEnd = 8.dp
    )
)

internal val LocalWeUIShapes = staticCompositionLocalOf { Shapes() }