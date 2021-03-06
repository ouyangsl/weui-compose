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
import weui.sample.SampleScreenMargin
import weui.theme.WeUI

@Composable
fun BadgeSampleScreen() {
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
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(SampleScreenMargin)
    ) {
        Button("εζ’ηΆζ") {
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
            text = "ζ°ζΆζ―ζη€Ίθ·ζθ¦δΏ‘ζ―εοΌη»δΈε¨εθ‘¨ε³δΎ§\r\nζͺθ―»ζ°ηΊ’ηΉθ·ε¨δΈ»ι’δΏ‘ζ―εοΌη»δΈε¨εθ‘¨ε·¦δΎ§",
            style = WeUI.typography.desc
        )

        Column {
            Panel(
                title = "εΎζη»εεθ‘¨",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth()
            )

            Panel(
                title = "ζ ι’δΈ",
                desc = "η±εη§η©θ΄¨η»ζηε·¨εηηΆε€©δ½οΌε«εζηγζηζδΈε?ηε½’ηΆοΌζθͺε·±ηθΏθ‘θ½¨ιγ",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state0,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "ζ ι’δΊ",
                desc = "η±εη§η©θ΄¨η»ζηε·¨εηηΆε€©δ½οΌε«εζηγζηζδΈε?ηε½’ηΆοΌζθͺε·±ηθΏθ‘θ½¨ιγ",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state1,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "ζ₯ηζ΄ε€",
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
                title = "ζε­η»εεθ‘¨",
                modifier = Modifier.fillMaxWidth()
            )

            Panel(
                title = "ζ ι’δΈ",
                desc = "η±εη§η©θ΄¨η»ζηε·¨εηηΆε€©δ½οΌε«εζηγζηζδΈε?ηε½’ηΆοΌζθͺε·±ηθΏθ‘θ½¨ιγ",
                badgeState = state0,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "ζ ι’δΊ",
                desc = "η±εη§η©θ΄¨η»ζηε·¨εηηΆε€©δ½οΌε«εζηγζηζδΈε?ηε½’ηΆοΌζθͺε·±ηθΏθ‘θ½¨ιγ",
                badgeState = state2,
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "ζ₯ηζ΄ε€",
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
                title = "ε°εΎζη»εεθ‘¨",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "ζ ι’δΈ",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state0,
                isDividerVisible = true,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "ζ ι’δΊ",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state3,
                isDividerVisible = true,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "ζ ι’δΈ",
                desc = "θ―¦ζδΏ‘ζ―",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state4,
                isDividerVisible = true,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }

            Panel(
                title = "ζ ι’ε",
                desc = "θ―¦ζδΏ‘ζ―",
                icon = rememberVectorPainter(WeUI.Icons.Filled.QrCode),
                badgeState = state5,
                isJumpVisible = true,
                modifier = Modifier.fillMaxWidth(),
            ) {

            }
        }

        Column {
            Panel(
                title = "ζε­εθ‘¨ιζ₯ζΊ",
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )

            Panel(
                title = "ζ ι’δΈ",
                desc = "η±εη§η©θ΄¨η»ζηε·¨εηηΆε€©δ½οΌε«εζηγζηζδΈε?ηε½’ηΆοΌζθͺε·±ηθΏθ‘θ½¨ιγ",
                badgeState = state0,
                footnote = PanelFootnote(
                    source = "ζε­ζ₯ζΊ",
                    time = "ζΆι΄",
                    remark = "εΆδ»δΏ‘ζ―"
                ),
                isSingleLine = false,
                isDividerVisible = true,
                modifier = Modifier.fillMaxWidth(),
            )
            Panel(
                title = "ζ ι’δΈ",
                desc = "η±εη§η©θ΄¨η»ζηε·¨εηηΆε€©δ½οΌε«εζηγζηζδΈε?ηε½’ηΆοΌζθͺε·±ηθΏθ‘θ½¨ιγ",
                badgeState = state5,
                footnote = PanelFootnote(
                    source = "ζε­ζ₯ζΊ",
                    time = "ζΆι΄",
                    remark = "εΆδ»δΏ‘ζ―"
                ),
                isSingleLine = false,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}