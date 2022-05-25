package weui.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import weui.theme.WeUITheme
import weui.theme.WeUI

@Composable
fun App() {
    val platformName = getPlatformName()

//    var selected by remember { mutableStateOf<Menu?>(null) }
    var selected by remember { mutableStateOf<Menu?>(Menu.Icons) }

    WeUITheme {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.background(WeUI.colors.background)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState())
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
            ) {
                BasicText(
                    text = "WeUI",
                    style = TextStyle(
                        fontSize = 17.sp
                    ),
                )

                BasicText(
                    text = "Platform: $platformName",
                    style = TextStyle(
                        fontSize = 12.sp
                    ),
                    modifier = Modifier.padding(
                        vertical = 10.dp
                    )
                )

                MenuGroups {
                    selected = it
                }
            }

            SampleScreen(
                menu = selected,
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
            )
        }
    }
}