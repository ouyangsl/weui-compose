package weui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val DefaultButtonShape = RoundedCornerShape(8.dp)
private val CellButtonShape = RectangleShape

/**
 * 按钮类型
 */
enum class ButtonType {
    Default,  // 普通按钮
    Cell      // 行按钮
}

private val ButtonType.shape: Shape
    get() = when (this) {
        ButtonType.Default -> DefaultButtonShape
        ButtonType.Cell -> CellButtonShape
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
    colors: ButtonColors = PrimaryButtonColors,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    val backgroundColor = colors.backgroundColor(enabled).value

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(type.shape)
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
                style = TextStyle(
                    color = colors.contentColor(enabled).value,
                    fontSize = 17.sp,
                    fontWeight = type.fontWeight
                )
            )
        }
    }
}