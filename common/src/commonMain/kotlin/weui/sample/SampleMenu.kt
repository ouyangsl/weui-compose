package weui.sample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import weui.core.LocalWindowSizeClasses
import weui.core.WindowSizeClasses

@Composable
fun SampleMenu(
    modifier: Modifier = Modifier,
    onMenuClick: (Menu) -> Unit
) {
    val platformName = getPlatformName()

    val padding = when (LocalWindowSizeClasses.current) {
        WindowSizeClasses.Compact -> 16.dp
        else -> 10.dp
    }

    Column(
        modifier = modifier.verticalScroll(rememberScrollState()).padding(padding)
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

        MenuGroups(onMenuClick = onMenuClick)
    }
}