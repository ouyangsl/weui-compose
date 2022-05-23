package weui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

/**
 * 全局主题、颜色等属性配置
 */
object WeUITheme {
    val colors: WeUIColors
        @Composable
        @ReadOnlyComposable
        get() = LocalWeUIColors.current
}