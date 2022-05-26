package weui.sample

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.core.LocalWindowSizeClasses
import weui.core.WindowSizeClasses
import weui.theme.WeUITheme
import weui.theme.WeUI

@Composable
fun App() {
//    var selected by remember { mutableStateOf<Menu?>(null) }
    var selected by remember { mutableStateOf<Menu?>(Menu.TopBar) }

    WeUITheme {
        when (LocalWindowSizeClasses.current) {
            WindowSizeClasses.Compact -> {
                Box {
                    SampleMenu(modifier = Modifier.fillMaxSize()) {
                        selected = it
                    }

                    AnimatedVisibility(
                        visible = selected != null,
                        enter = fadeIn() + expandIn(expandFrom = Alignment.TopStart),
                        exit = shrinkOut(shrinkTowards = Alignment.TopCenter) + fadeOut(),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        SampleScreen(
                            menu = selected,
                            modifier = Modifier.fillMaxSize().background(WeUI.colors.background)
                        ) {
                            selected = null
                        }
                    }
                }
            }
            else -> {
                Row(modifier = Modifier.background(WeUI.colors.background)) {
                    SampleMenu(
                        modifier = Modifier.width(200.dp).fillMaxHeight()
                    ) {
                        selected = it
                    }

                    SampleScreen(
                        menu = selected,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                    )
                }
            }
        }
    }
}