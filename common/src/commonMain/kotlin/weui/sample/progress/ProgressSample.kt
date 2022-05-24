package weui.sample.progress

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.button.Button
import weui.components.progress.Progress

@Composable
fun ProgressSampleScreen(
    modifier: Modifier = Modifier
) {
    var progress by remember { mutableStateOf(0.3f) }

    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        BasicText(text = "Progress: $progress")

        Progress(
            progress = progress,
            modifier = Modifier.fillMaxWidth()
        )

        Progress(
            progress = progress,
            modifier = Modifier.fillMaxWidth()
        )

        Progress(
            progress = progress,
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(text = "重置") {
                progress = 0f
            }

            Button(text = "+10%") {
                if (progress < 1f) {
                    progress += 0.1f
                } else {
                    progress = 0f
                }
            }

            Button(text = "完成") {
                progress = 1f
            }
        }
    }
}