package weui.components.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.theme.WeUITheme

/**
 * 页脚
 */
@Composable
fun Footer(
    desc: String,
    modifier: Modifier = Modifier,
    links: List<Pair<String, String>> = listOf(),
    onLinkClick: ((Pair<String, String>) -> Unit)? = null
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier
    ) {
        if (links.isNotEmpty()) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(1.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                for ((index, link) in links.withIndex()) {
                    BasicText(
                        text = link.first,
                        style = WeUITheme.typography.desc.copy(
                            color = WeUITheme.colors.link
                        ),
                        modifier = Modifier.clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = onLinkClick != null,
                            onClick = { onLinkClick?.invoke(link) }
                        ).padding(horizontal = 5.dp)
                    )

                    if (index < links.lastIndex) {
                        Box(modifier = Modifier.size(1.dp, 10.dp).background(WeUITheme.colors.divider))
                    }
                }
            }
        }

        BasicText(
            text = desc, style = WeUITheme.typography.desc
        )
    }
}