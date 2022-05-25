package weui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

/**
 * 按钮类型
 */
enum class ButtonType {
    Default,  // 普通按钮
    Cell      // 行按钮
}

/**
 * 按钮样式
 */
enum class ButtonStyle {
    Primary, // 主要操作
    Default, // 次要操作
    Warn     // 警示操作
}

private val ButtonType.fontWeight: FontWeight
    get() = when (this) {
        ButtonType.Default -> FontWeight.Bold
        ButtonType.Cell -> FontWeight.Medium
    }

/**
 * 按钮
 */
@Composable
fun Button(
    text: String,
    modifier: Modifier = Modifier,
    type: ButtonType = ButtonType.Default,
    style: ButtonStyle = ButtonStyle.Default,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    val colors = when (type) {
        ButtonType.Default -> {
            when (style) {
                ButtonStyle.Primary -> PrimaryButtonColors
                ButtonStyle.Default -> DefaultButtonColors
                ButtonStyle.Warn -> WarnButtonColors
            }
        }
        ButtonType.Cell -> when (style) {
            ButtonStyle.Primary -> PrimaryCellButtonColors
            ButtonStyle.Default -> DefaultCellButtonColors
            ButtonStyle.Warn -> WarnCellButtonColors
        }
    }

    val backgroundColor = colors.backgroundColor(enabled).value
    val shape = when (type) {
        ButtonType.Default -> WeUI.shapes.buttonDefault
        ButtonType.Cell -> WeUI.shapes.buttonCell
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(shape)
            .clickable(
                enabled = enabled,
                onClick = onClick
            )
            .background(backgroundColor)
            .defaultMinSize(184.dp, 48.dp)
            .padding(
                horizontal = 12.dp,
                vertical = 4.dp
            )
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {

            BasicText(
                text = text,
                style = WeUI.typography.button.copy(
                    color = colors.contentColor(enabled).value,
                    fontWeight = type.fontWeight
                )
            )
        }
    }
}