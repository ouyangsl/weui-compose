package weui.sample.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import weui.components.badge.BadgedBox
import weui.components.badge.rememberBadgeState
import weui.components.navigation.NavBar
import weui.components.navigation.NavItem
import weui.icons.filled.Contacts
import weui.icons.filled.Discover
import weui.icons.filled.Me
import weui.theme.WeUI

@Composable
fun NavBarSampleScreen(
    modifier: Modifier = Modifier
) {
    var selected by remember { mutableStateOf(0) }
    val titles = listOf(
        "通讯录", "发现", "我"
    )
    val icons = listOf(
        WeUI.Icons.Filled.Contacts,
        WeUI.Icons.Filled.Discover,
        WeUI.Icons.Filled.Me
    )

    val badgeState by rememberBadgeState(visible = true, text = "New")

    Column(modifier = modifier) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth().weight(1f)
        ) {
            BasicText(
                text = titles[selected],
                style = WeUI.typography.headline
            )
        }

        NavBar {
            for (index in titles.indices) {
                val isSelected = selected == index

                NavItem(
                    selected = isSelected,
                    icon = {
                        if (index == titles.lastIndex) {
                            BadgedBox(badgeState) {
                                Icon(isSelected, icons[index])
                            }
                        } else {
                            Icon(isSelected, icons[index])
                        }
                    },
                    title = { Title(isSelected, titles[index]) },
                    onClick = { selected = index }
                )
            }
        }
    }
}

@Composable
private fun Icon(
    selected: Boolean,
    vector: ImageVector
) = Image(
    painter = rememberVectorPainter(vector),
    colorFilter = ColorFilter.tint(
        if (selected) WeUI.colors.brand else WeUI.colors.divider
    ),
    contentDescription = null,
    modifier = Modifier.size(24.dp)
)

@Composable
private fun Title(
    selected: Boolean,
    text: String
) = BasicText(
    text = text,
    style = if (selected) {
        TextStyle(
            color = WeUI.colors.brand,
            fontSize = 12.sp
        )
    } else {
        TextStyle(
            color = WeUI.typography.desc.color,
            fontSize = 12.sp
        )
    }
)