package weui.sample.footer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import weui.components.dialog.TopTips
import weui.components.footer.Footer

@Composable
fun FooterSampleScreen(
    modifier: Modifier = Modifier
) {
    var isShowTips by remember { mutableStateOf(false) }
    var tips by remember { mutableStateOf("") }

    val desc = "Copyright © 20XX-20XX XXXX.XX"
    val links = listOf(
        "底部链接" to "www.www.www",
        "底部链接" to "www.www.www",
        "底部链接" to "www.www.www"
    )

    LaunchedEffect(isShowTips) {
        if (isShowTips) {
            delay(1000)

            isShowTips = false
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 50.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Footer(desc = desc)

        Footer(
            desc = desc,
            links = links.take(1),
            onLinkClick = {
                tips = it.toString()
                isShowTips = true
            }
        )

        Footer(
            desc = desc,
            links = links,
            onLinkClick = {
                tips = it.toString()
                isShowTips = true
            }
        )
    }

    if (isShowTips) {
        TopTips(text = tips)
    }
}