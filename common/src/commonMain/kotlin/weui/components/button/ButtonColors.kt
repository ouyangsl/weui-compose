package weui.components.button

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import weui.WeUITheme

/**
 * 按钮颜色
 */
@Stable
interface ButtonColors {
    /**
     * 背景颜色
     *
     * @param enabled 按钮是否可用
     */
    @Composable
    fun backgroundColor(enabled: Boolean): State<Color>

    /**
     * 内容颜色
     *
     * @param enabled 按钮是否可用
     */
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

/**
 * 强调按钮颜色
 */
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
 * 弱化按钮颜色
 */
object DefaultButtonColors : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) Color(0xFFF2F2F2) else DisabledBackgroundColor
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.brand else DisabledContentColor
        )
    }
}

/**
 * 警示按钮颜色
 */
object WarnButtonColors : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) Color(0xFFF2F2F2) else DisabledBackgroundColor
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.error else DisabledContentColor
        )
    }
}

/**
 * 强调行按钮颜色
 */
object PrimaryCellButtonColors : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.surface else DisabledBackgroundColor
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.link else DisabledContentColor
        )
    }
}

/**
 * 普通行按钮颜色
 */
object DefaultCellButtonColors : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.surface else DisabledBackgroundColor
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) Color.Black else DisabledContentColor
        )
    }
}

/**
 * 警示行按钮颜色
 */
object WarnCellButtonColors : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) Color.White else DisabledBackgroundColor
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) WeUITheme.colors.error else DisabledContentColor
        )
    }
}