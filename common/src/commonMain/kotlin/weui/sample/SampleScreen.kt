package weui.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.sample.button.ButtonSampleScreen
import weui.sample.dialog.DialogSampleScreen
import weui.sample.progress.ProgressSampleScreen

/**
 * 根据不同的菜单项，显示不同的 Sample
 */
@Composable
fun SampleScreen(
    menu: Menu?,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.padding(16.dp)) {
        val sampleModifier = Modifier.fillMaxSize()

        when (menu) {
            Menu.Button -> ButtonSampleScreen(sampleModifier)
            Menu.Progress -> ProgressSampleScreen(sampleModifier)
            Menu.Dialog -> DialogSampleScreen(sampleModifier)
            null -> NullSampleScreen(sampleModifier)
            else -> NotAvailableSampleScreen(sampleModifier)
        }
    }
}

@Composable
private fun NullSampleScreen(
    modifier: Modifier = Modifier
) {

}

@Composable
private fun NotAvailableSampleScreen(
    modifier: Modifier = Modifier
) {

}