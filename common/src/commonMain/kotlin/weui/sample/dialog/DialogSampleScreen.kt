package weui.sample.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.button.Button
import weui.components.dialog.TextDialog

@Composable
fun DialogSampleScreen(modifier: Modifier = Modifier) {
    var isShowStyle1 by remember { mutableStateOf(false) }
    var isShowStyle2 by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Button(text = "Dialog 样式一") {
            isShowStyle1 = true
        }

        Button(text = "Dialog 样式二") {
            isShowStyle2 = true
        }
    }

    if (isShowStyle1) {
        TextDialog(
            title = "弹窗标题",
            content = "弹窗内容，告知当前状态、信息和解决方法，描述文字尽量控制在三行内",
            defaultButton = "辅助操作",
            primaryButton = "主操作",
            onDefaultClick = { isShowStyle1 = false },
            onPrimaryClick = { isShowStyle1 = false }
        )
    }

    if (isShowStyle2) {
        TextDialog(
            title = "弹窗内容，告知当前状态、信息和解决方法，描述 文字尽量控制在三行内",
            button = "知道了"
        ) {
            isShowStyle2 = false
        }
    }
}