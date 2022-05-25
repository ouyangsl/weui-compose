package weui.sample.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.navigation.TabBar
import weui.theme.WeUI

@Composable
fun TabBarSampleScreen(
    modifier: Modifier = Modifier
) {
    var selected by remember { mutableStateOf(0) }
    val tabs = listOf(
        "选项一", "选项二", "选项三"
    )

    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 50.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        TabBar(
            selected = selected,
            tabs = tabs,
            modifier = Modifier.fillMaxWidth()
        ) {
            selected = it
        }

        BasicText(
            text = tabs[selected],
            style = WeUI.typography.headline
        )
    }
}