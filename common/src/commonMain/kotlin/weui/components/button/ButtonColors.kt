package weui.components.button

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import weui.WeUITheme

/**
 * 按钮颜色
 */
@Stable
interface ButtonColors {
    @Composable
    fun backgroundColor(enabled: Boolean): State<Color>

    @Composable
    fun contentColor(enabled: Boolean): State<Color>
}

@Immutable
private data class ButtonColorsImpl(
    private val backgroundColor: Color,
    private val contentColor: Color,
    private val disabledBackgroundColor: Color,
    private val disabledContentColor: Color
) : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}

private val DisabledBackgroundColor = Color(0xFFF2F2F2)
private val DisabledContentColor = Color.Black.copy(alpha = 0.18f)

object PrimaryButtonColors : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.brand else DisabledBackgroundColor
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) Color.White else DisabledContentColor
        )
    }
}

/**
 * 强调按钮颜色
 */
//val PrimaryButtonColors: ButtonColors by lazy {
//    ButtonColorsImpl(
//        backgroundColor = WeUITheme.colors.brand,
//        contentColor = Color.White,
//        disabledBackgroundColor = Color(0xFFF2F2F2),
//        disabledContentColor = Color.Black.copy(alpha = 0.18f)
//    )
//}

/**
 * 弱化按钮颜色
 */
//val DefaultButtonColors: ButtonColors by lazy {
//    ButtonColorsImpl(
//        backgroundColor = Color(0xFFF2F2F2),
//        contentColor = WeUITheme.colors.brand,
//        disabledBackgroundColor = Color(0xFFF2F2F2),
//        disabledContentColor = Color.Black.copy(alpha = 0.18f)
//    )
//}
//
///**
// * 警示按钮颜色
// */
//val WarnButtonColors: ButtonColors by lazy {
//    ButtonColorsImpl(
//        backgroundColor = Color(0xFFF2F2F2),
//        contentColor = WeUITheme.colors.warn,
//        disabledBackgroundColor = Color(0xFFF2F2F2),
//        disabledContentColor = Color.Black.copy(alpha = 0.18f)
//    )
//}
//
///**
// * 强调行按钮颜色
// */
//val PrimaryCellButtonColors: ButtonColors by lazy {
//    ButtonColorsImpl(
//        backgroundColor = WeUITheme.colors.surface,
//        contentColor = WeUITheme.colors.link,
//        disabledBackgroundColor = Color(0xFFF2F2F2),
//        disabledContentColor = Color.Black.copy(alpha = 0.18f)
//    )
//}
//
///**
// * 弱化行按钮颜色
// */
//val DefaultCellButtonColors: ButtonColors by lazy {
//    ButtonColorsImpl(
//        backgroundColor = WeUITheme.colors.surface,
//        contentColor = Color.White,
//        disabledBackgroundColor = Color(0xFFF2F2F2),
//        disabledContentColor = Color.Black.copy(alpha = 0.18f)
//    )
//}