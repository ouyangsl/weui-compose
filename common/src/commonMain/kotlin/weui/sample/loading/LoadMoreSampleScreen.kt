package weui.sample.loading

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.loading.LoadMore
import weui.sample.SampleScreenMargin

@Composable
fun LoadMoreSampleScreen() {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 50.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(SampleScreenMargin)
    ) {
        LoadMore(
            isLoading = true,
            text = "正在加载"
        )
        LoadMore(
            isLoading = false,
            text = "暂无数据"
        )
        LoadMore(
            isLoading = false,
            text = null
        )
    }
}