package weui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * 全局主题、颜色等属性配置
 */
object WeUI {
    /**
     * 图标
     */
    object Icons

    val colors: WeUIColors
        @Composable
        @ReadOnlyComposable
        get() = LocalWeUIColors.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalWeUITypography.current

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalWeUIShapes.current
}

@Composable
fun WeUITheme(
    colors: WeUIColors = WeUI.colors,
    typography: Typography = WeUI.typography,
    shapes: Shapes = WeUI.shapes,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalWeUIColors provides colors,
        LocalWeUITypography provides typography,
        LocalWeUIShapes provides shapes,
        content = content
    )
}