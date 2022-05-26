package weui.sample.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import weui.components.dialog.TopTips
import weui.components.navigation.TopBar
import weui.components.navigation.TopBarIcon
import weui.icons.outlined.Back
import weui.icons.outlined.Home
import weui.icons.outlined.More
import weui.theme.WeUI

@Composable
fun TopBarSampleScreen() {
    var isShowTips by remember { mutableStateOf(false) }
    var tips by remember { mutableStateOf("") }

    val onClick = {
        tips = "OnClick"
        isShowTips = true
    }

    LaunchedEffect(isShowTips) {
        if (isShowTips) {
            delay(1000)
            isShowTips = false
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(50.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(
            title = "标题",
            start = {
                TopBarIcon(
                    icon = WeUI.Icons.Outlined.Back,
                    onClick = onClick
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        TopBar(
            title = "标题",
            start = {
                TopBarIcon(
                    icon = WeUI.Icons.Outlined.Back,
                    onClick = onClick
                )
            },
            end = {
                TopBarIcon(
                    icon = WeUI.Icons.Outlined.More,
                    onClick = onClick
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        TopBar(
            title = "标题",
            start = {
                TopBarIcon(
                    icon = WeUI.Icons.Outlined.Back,
                    onClick = onClick
                )
            },
            end = {
                Row {
                    TopBarIcon(
                        icon = WeUI.Icons.Outlined.Home,
                        onClick = onClick
                    )
                    TopBarIcon(
                        icon = WeUI.Icons.Outlined.More,
                        onClick = onClick
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
    }

    if (isShowTips) {
        TopTips(text = tips)
    }
}