package weui.sample.article

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import kotlinx.coroutines.delay
import weui.components.article.*
import weui.components.dialog.TopTips

private const val LinkTag = "tag"

@Composable
fun ArticleSampleScreen() {
    val article = buildAnnotatedString {
        headline("文章页大标题\n")
        title("标题\n")
        subtitle("副标题\n")
        body(
            """
                Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                sed do eiusmod tempor incididunt ut labore et dolore magna
                aliqua. Ut enim ad minim veniam, cillum dolore eu fugiat 
                nulla pariatur. Excepteur sint occaecat cupidatat non proident, 
                sunt in culpa qui officia deserunt mollit anim id est laborum.
                
            """.trimIndent()
        )
        desc("Ipsum cum soluta laudantium aperiam rem? Accusamus nostrum itaque sint?\n")
        caption("Elit quo illum ut voluptate possimus. Maxime\n")
        link("链接\n", LinkTag, "www.www.www")
    }

    var isShowTips by remember { mutableStateOf(false) }
    var tips by remember { mutableStateOf("") }

    LaunchedEffect(isShowTips) {
        if (isShowTips) {
            delay(1000)
            isShowTips = false
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        ClickableText(
            text = article,
            modifier = Modifier.fillMaxWidth()
        ) { offset ->
            article.getStringAnnotations(
                tag = LinkTag, start = offset, end = offset
            ).firstOrNull()?.let {
                tips = it.toString()
                isShowTips = true
            }
        }
    }

    if (isShowTips) {
        TopTips(text = tips)
    }
}