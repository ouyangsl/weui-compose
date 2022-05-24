package weui.sample.panel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.panel.Panel
import weui.components.panel.PanelFootnote
import weui.theme.WeUITheme

@Composable
fun PanelSampleScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 15.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        // TODO: 2022/5/24 图片未处理
        Column {
            Panel(
                title = "图文组合列表",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth()
            )

            Panel(
                title = "标题一",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "标题二",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "查看更多",
                titleStyle = WeUITheme.typography.title.copy(
                    color = WeUITheme.colors.link
                ),
                modifier = Modifier.fillMaxWidth()
            ) {

            }
        }

        Column {
            Panel(
                title = "文字组合列表",
                modifier = Modifier.fillMaxWidth()
            )

            Panel(
                title = "标题一",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "标题二",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "查看更多",
                titleStyle = WeUITheme.typography.title.copy(
                    color = WeUITheme.colors.link
                ),
                modifier = Modifier.fillMaxWidth()
            ) {

            }
        }

        Column {
            Panel(
                title = "小图文组合列表",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "标题一",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "标题二",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "查看更多",
                titleStyle = WeUITheme.typography.title.copy(
                    color = WeUITheme.colors.link
                ),
                modifier = Modifier.fillMaxWidth()
            ) {

            }
        }

        Column {
            Panel(
                title = "文字列表附来源",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "标题一",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                footnote = PanelFootnote(
                    source = "文字来源",
                    time = "时间",
                    remark = "其他信息"
                ),
                isSingleLine = false,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}