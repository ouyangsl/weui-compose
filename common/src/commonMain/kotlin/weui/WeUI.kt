package weui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

/**
 * 全局顶层容器
 */
@Composable
fun WeUI(
    colors: WeUIColors = WeUITheme.colors,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalWeUIColors provides colors,
        content = content
    )
}

object WeUI {
    object Colors
}