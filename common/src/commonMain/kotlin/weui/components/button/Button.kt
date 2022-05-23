package weui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * 按钮
 */
@Composable
fun Button(
    text: String,
    modifier: Modifier = Modifier,
    colors: ButtonColors = PrimaryButtonColors,
    enabled: Boolean = true
) {
    val backgroundColor = colors.backgroundColor(enabled).value

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.background(backgroundColor)
    ) {
        BasicText(text = text)
    }
}