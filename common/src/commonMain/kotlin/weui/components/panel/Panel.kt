package weui.components.panel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import weui.icons.outlined.Arrow
import weui.theme.WeUI

/**
 * 面板
 */

/**
 * 面板内容边距
 */
private val PanelMargin = 15.dp

@Composable
private fun Desc(
    text: String,
    modifier: Modifier = Modifier
) = BasicText(
    text = text,
    style = WeUI.typography.desc,
    maxLines = 1,
    overflow = TextOverflow.Ellipsis,
    modifier = modifier
)

/**
 * 面板脚注
 *
 * @param source 文字来源
 * @param time 时间
 * @param remark 其他信息
 */
data class PanelFootnote(
    val source: String,
    val time: String,
    val remark: String
)

/**
 * 面板
 *
 * @param title 标题
 * @param titleStyle 标题文字样式
 * @param modifier 修饰符
 * @param desc 描述
 * @param footnote 脚注信息
 * @param icon 图片
 * @param isSingleLine 是否单行显示
 * @param isDividerVisible 是否显示底部分割线
 * @param isJumpVisible 是否在右侧显示跳转箭头
 * @param enabled 是否启用点击事件
 * @param onClick 点击事件回调
 */
@Composable
fun Panel(
    title: String,
    titleStyle: TextStyle = WeUI.typography.title,
    modifier: Modifier = Modifier,
    desc: String? = null,
    footnote: PanelFootnote? = null,
    icon: Painter? = null,
    isSingleLine: Boolean = true,
    isDividerVisible: Boolean = false,
    isJumpVisible: Boolean = false,
    enabled: Boolean = true,
    onClick: (() -> Unit)? = null,
) {
    val iconSize = if (isSingleLine) 24.dp else 48.dp

    Box(
        modifier = Modifier
            .background(WeUI.colors.surface)
            .then(modifier)
            .clickable(
                enabled = onClick != null && enabled,
                onClick = { onClick?.invoke() }
            )
    ) {
        Column(
            modifier = Modifier.padding(PanelMargin)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                if (icon != null) {
                    Image(
                        painter = icon,
                        contentDescription = null,
                        modifier = Modifier.size(iconSize)
                    )
                }

                if (isSingleLine) {
                    BasicText(
                        text = title,
                        style = titleStyle
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    if (!desc.isNullOrBlank()) {
                        Desc(text = desc)
                    }
                } else {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        BasicText(
                            text = title,
                            style = titleStyle
                        )

                        if (!desc.isNullOrBlank()) {
                            Desc(text = desc)
                        }
                    }
                }

                if (isJumpVisible) {
                    Image(
                        painter = rememberVectorPainter(WeUI.Icons.Outlined.Arrow),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            if (footnote != null) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    if (footnote.source.isNotBlank()) {
                        Desc(text = footnote.source)
                    }

                    if (footnote.time.isNotBlank()) {
                        Desc(text = footnote.time)
                    }

                    if (
                        footnote.remark.isNotBlank() && (footnote.source.isNotBlank() || footnote.time.isNotBlank())
                    ) {
                        Box(modifier = Modifier.size(1.dp, 15.dp).background(WeUI.colors.divider))
                    }

                    if (footnote.remark.isNotBlank()) {
                        Desc(text = footnote.remark)
                    }
                }
            }
        }

        if (isDividerVisible) {
            Box(
                modifier = Modifier
                    .padding(start = PanelMargin)
                    .background(WeUI.colors.divider)
                    .fillMaxWidth()
                    .height(1.dp)
                    .align(Alignment.BottomEnd)
            )
        }
    }
}