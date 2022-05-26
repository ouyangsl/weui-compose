package weui.components.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

@Composable
fun LoadMore(
    isLoading: Boolean,
    text: String? = null,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Divider(
            visitable = !isLoading,
            modifier = Modifier.weight(1f)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 5.dp)
        ) {
            if (isLoading) {
                Loading(modifier = modifier.size(12.dp))

                if (!text.isNullOrBlank()) {
                    BasicText(
                        text = text,
                        style = WeUI.typography.caption.copy(
                            color = WeUI.typography.content.color
                        )
                    )
                }
            } else {
                if (text.isNullOrBlank()) {
                    Box(modifier.clip(CircleShape).size(5.dp).background(WeUI.colors.divider))
                } else {
                    BasicText(
                        text = text,
                        style = WeUI.typography.caption
                    )
                }
            }
        }

        Divider(
            visitable = !isLoading,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun Divider(
    visitable: Boolean,
    modifier: Modifier = Modifier
) {
    val color = if (visitable) {
        WeUI.colors.divider
    } else {
        Color.Transparent
    }

    Box(modifier.height(1.dp).background(color))
}