package weui.sample.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import weui.components.badge.BadgeState
import weui.components.navigation.NavBar
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
    val badgeStates = listOf(
        mutableStateOf(BadgeState(visible = true, text = "")),
        mutableStateOf(BadgeState(visible = true, text = "2")),
        mutableStateOf(BadgeState(visible = true, text = "New"))
    )

    val states = mutableStateListOf(
        BadgeState(visible = true, text = ""),
        BadgeState(visible = true, text = "2"),
        BadgeState(visible = true, text = "New")
    )

    LaunchedEffect(selected) {
        badgeStates[selected].value = badgeStates[selected].value.copy(visible = false)
    }

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

        NavBar(
            selected = selected,
            count = titles.size,
            badgeStates = { badgeStates[it].value },
            titles = { isSelected, index ->
                BasicText(
                    text = titles[index],
                    style = if (isSelected) {
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
            },
            icons = { isSelected, index ->
                Image(
                    painter = rememberVectorPainter(icons[index]),
                    colorFilter = ColorFilter.tint(
                        if (isSelected) WeUI.colors.brand else WeUI.colors.divider
                    ),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            },
            onItemSelected = { selected = it }
        )
    }
}