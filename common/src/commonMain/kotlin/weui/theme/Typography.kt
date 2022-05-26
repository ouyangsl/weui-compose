package weui.theme

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

/**
 * 全局文字样式
 */
@Immutable
data class Typography(
    val headline: TextStyle,
    val title: TextStyle,
    val subtitle: TextStyle,
    val body: TextStyle,
    val content: TextStyle,
    val button: TextStyle,
    val link: TextStyle,
    val desc: TextStyle,
    val caption: TextStyle
)

private val DefaultLightTypography = Typography(
    headline = TextStyle(
        color = Color.Black.copy(alpha = 0.9f),
        fontSize = 22.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 30.8.sp,
        textAlign = TextAlign.Center
    ),
    title = TextStyle(
        color = Color.Black.copy(alpha = 0.9f),
        fontSize = 17.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 23.8.sp
    ),
    subtitle = TextStyle(
        color = Color.Black.copy(alpha = 0.5f),
        fontSize = 12.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 23.8.sp
    ),
    body = TextStyle(
        color = Color.Black.copy(alpha = 0.5f),
        fontSize = 17.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 23.8.sp
    ),
    content = TextStyle(
        color = Color.Black.copy(alpha = 0.9f),
        fontSize = 22.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 27.2.sp
    ),
    button = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.W500,
    ),
    link = TextStyle(
        color = Color(0xFF576B95),
        fontSize = 17.sp,
        fontWeight = FontWeight.W500,
    ),
    desc = TextStyle(
        color = Color.Black.copy(alpha = 0.3f),
        fontSize = 14.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 19.6.sp
    ),
    caption = TextStyle(
        color = Color.Black.copy(alpha = 0.3f),
        fontSize = 12.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 16.8.sp
    )
)

internal val LocalWeUITypography = staticCompositionLocalOf { DefaultLightTypography }