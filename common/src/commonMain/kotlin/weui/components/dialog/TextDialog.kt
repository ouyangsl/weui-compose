package weui.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.*
import weui.components.button.Button
import weui.components.button.ButtonStyle
import weui.components.button.ButtonType
import weui.theme.WeUI

/**
 * 包含标题及内容的文本弹窗
 *
 * @param title 标题
 * @param content 内容
 * @param defaultButton 次要按钮文本
 * @param primaryButton 主要按钮文本
 * @param onDefaultClick 次要按钮点击回调
 * @param onPrimaryClick 主要按钮点击回调
 */
@Composable
expect fun TextDialog(
    title: String,
    content: String,
    defaultButton: String,
    primaryButton: String,
    onDefaultClick: () -> Unit,
    onPrimaryClick: () -> Unit,
)

/**
 * 仅包含标题的文本弹窗
 *
 * @param title 标题
 * @param button 按钮文本
 * @param onClick 按钮点击回调
 */
@Composable
expect fun TextDialog(
    title: String,
    button: String,
    onClick: () -> Unit
)

/**
 * 遮罩容器
 *
 * @param modifier 修饰符
 * @param content 内容
 */
@Composable
fun MaskBox(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) = Box(
    contentAlignment = Alignment.Center,
    modifier = modifier.background(WeUI.colors.mask),
    content = content
)

/**
 * 基础弹窗容器
 *
 * @param modifier 修饰符
 * @param content 内容
 */
@Composable
private fun BasicDialogContent(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) = Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = modifier.clip(WeUI.shapes.dialogCenter).width(320.dp).background(WeUI.colors.surface),
    content = content
)

/**
 * 包含标题及内容的文本弹窗
 *
 * @param title 标题
 * @param content 内容
 * @param defaultButton 次要按钮文本
 * @param primaryButton 主要按钮文本
 * @param onDefaultClick 次要按钮点击回调
 * @param onPrimaryClick 主要按钮点击回调
 */
@Composable
fun TextDialogContent(
    title: String,
    content: String,
    defaultButton: String,
    primaryButton: String,
    onDefaultClick: () -> Unit,
    onPrimaryClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    BasicDialogContent(
        modifier = modifier
    ) {
        Title(
            text = title,
            modifier = Modifier.padding(
                start = 15.dp,
                top = 18.dp,
                end = 15.dp
            )
        )

        BasicText(
            text = content,
            style = WeUI.typography.body,
            modifier = Modifier.padding(
                horizontal = 15.dp,
                vertical = 18.dp
            )
        )

        Box(
            modifier = Modifier.fillMaxWidth().height(1.dp).background(WeUI.colors.divider)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.background(WeUI.colors.divider)
        ) {
            Button(
                text = defaultButton,
                type = ButtonType.Cell,
                style = ButtonStyle.Default,
                modifier = Modifier.weight(1f),
                onClick = onDefaultClick
            )

            Button(
                text = primaryButton,
                type = ButtonType.Cell,
                style = ButtonStyle.Primary,
                modifier = Modifier.weight(1f),
                onClick = onPrimaryClick
            )
        }
    }
}

/**
 * 仅包含标题的文本弹窗
 *
 * @param title 标题
 * @param button 按钮文本
 * @param onClick 按钮点击回调
 */
@Composable
fun TextDialogContent(
    title: String,
    button: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    BasicDialogContent(
        modifier = modifier
    ) {
        Title(
            text = title,
            modifier = Modifier.padding(
                horizontal = 15.dp,
                vertical = 18.dp
            )
        )

        Box(
            modifier = Modifier.fillMaxWidth().height(1.dp).background(WeUI.colors.divider)
        )

        Button(
            text = button,
            type = ButtonType.Cell,
            style = ButtonStyle.Primary,
            modifier = Modifier.fillMaxWidth(),
            onClick = onClick
        )
    }
}

@Composable
private fun Title(
    text: String,
    modifier: Modifier = Modifier
) = BasicText(
    text = text,
    style = WeUI.typography.title,
    modifier = modifier
)