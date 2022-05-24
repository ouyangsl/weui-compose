package weui.sample.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import weui.components.button.Button
import weui.components.dialog.TopTips

@Composable
fun TopTipsSampleScreen(modifier: Modifier = Modifier) {
    var isShow by remember { mutableStateOf(false) }
    var isAutoDismiss by remember { mutableStateOf(false) }

    LaunchedEffect(isAutoDismiss) {
        if (isAutoDismiss) {
            delay(1000)

            isShow = false
            isAutoDismiss = false
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Button(text = "显示提示条") {
            isShow = true
        }

        Button(text = "隐藏提示条") {
            isShow = false
        }

        Button(text = "显示提示条（自动关闭）") {
            isShow = true
            isAutoDismiss = true
        }
    }

    if (isShow) {
        TopTips(text = "错误提示")
    }
}