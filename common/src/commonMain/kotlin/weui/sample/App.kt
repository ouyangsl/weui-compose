package weui.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.WeUI
import weui.WeUITheme
import weui.sample.button.ButtonSampleScreen

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()

    WeUI {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.background(WeUITheme.colors.background)
        ) {
            MenuGroups(
                modifier = Modifier.weight(1f).fillMaxHeight(),
                onMenuClick = {}
            )

            Box(modifier = Modifier.weight(3f).fillMaxHeight()) {
                ButtonSampleScreen()
            }
        }
    }
}