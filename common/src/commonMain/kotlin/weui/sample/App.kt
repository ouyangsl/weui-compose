package weui.sample

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import weui.WeUI
import weui.WeUITheme
import weui.sample.button.ButtonSampleScreen

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()

    WeUI {
        ButtonSampleScreen(
            modifier = Modifier.background(WeUITheme.colors.background)
        )
    }
}