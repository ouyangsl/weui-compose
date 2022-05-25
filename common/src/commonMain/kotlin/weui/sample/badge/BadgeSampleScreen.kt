package weui.sample.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import weui.components.badge.Badge
import weui.components.badge.BadgedBox
import weui.components.badge.rememberBadgeState
import weui.components.button.Button
import weui.components.panel.Panel
import weui.components.panel.PanelFootnote
import weui.icons.filled.QrCode
import weui.theme.WeUI

@Composable
fun BadgeSampleScreen(
    modifier: Modifier = Modifier
) {
    var state0 by rememberBadgeState(text = "")
    var state1 by rememberBadgeState(text = "1")
    var state2 by rememberBadgeState(text = "8")
    var state3 by rememberBadgeState(text = "88")
    var state4 by rememberBadgeState(text = "99+")
    var state5 by rememberBadgeState(text = "New")

    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 50.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        Button("切换状态") {
            state0 = state0.copy(visible = !state0.visible)
            state1 = state1.copy(visible = !state1.visible)
            state2 = state2.copy(visible = !state2.visible)
            state3 = state3.copy(visible = !state3.visible)
            state4 = state4.copy(visible = !state4.visible)
            state5 = state5.copy(visible = !state5.visible)
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Badge(state0)
            Badge(state1)
            Badge(state2)
            Badge(state3)
            Badge(state4)
            Badge(state5)
            BadgedBox(state5) {
                Box(modifier = Modifier.size(50.dp).background(WeUI.colors.mask))
            }
        }

        BasicText(
            text = "新消息提示跟摘要信息后，统一在列表右侧\r\n未读数红点跟在主题信息后，统一在列表左侧",
            style = WeUI.typography.desc
        )

        Column {
            Panel(
                title = "图文组合列表",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth()
            )

            Panel(
                title = "标题一",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state0,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "标题二",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state1,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "查看更多",
                titleStyle = WeUI.typography.title.copy(
                    color = WeUI.colors.link
                ),
                isJumpVisible = true,
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
                badgeState = state0,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "标题二",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                badgeState = state2,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "查看更多",
                titleStyle = WeUI.typography.title.copy(
                    color = WeUI.colors.link
                ),
                isJumpVisible = true,
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
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state0,
                isDividerVisible = true,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "标题二",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state3,
                isDividerVisible = true,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "标题三",
                desc = "详情信息",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state4,
                isDividerVisible = true,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "标题四",
                desc = "详情信息",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state5,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
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
                badgeState = state0,
                footnote = PanelFootnote(
                    source = "文字来源",
                    time = "时间",
                    remark = "其他信息"
                ),
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )
            Panel(
                title = "标题一",
                desc = "由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。",
                badgeState = state5,
                footnote = PanelFootnote(
                    source = "文字来源",
                    time = "时间",
                    remark = "其他信息"
                ),
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}