package weui.components.badge

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import weui.theme.WeUI

/**
 * 徽章状态
 *
 * @property visible 是否显示
 * @property text 徽章文本
 */
data class BadgeState(
    val visible: Boolean,
    val text: String?
) {
    /**
     * 是否为没有图标和文本的纯提示
     */
    val isPureTips: Boolean = text.isNullOrBlank()
}

/**
 * 徽章状态
 *
 * @property visible 是否显示
 * @property text 徽章文本
 */
@Composable
fun rememberBadgeState(
    visible: Boolean = false,
    text: String? = null
) = remember { mutableStateOf(BadgeState(visible, text)) }

@Composable
fun Badge(
    state: BadgeState,
    modifier: Modifier = Modifier
) {
    val minSize = if (state.isPureTips) 8.dp else 15.dp
    val scale = animateFloatAsState(if (state.visible) 1f else 0f)

    if (state.visible) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .scale(scale.value)
                .defaultMinSize(minSize, minSize)
                .background(WeUI.colors.error, CircleShape)
                .then(modifier)
        ) {
            if (!state.text.isNullOrBlank()) {
                BasicText(
                    text = state.text,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.padding(
                        horizontal = 5.dp
                    )
                )
            }
        }
    }
}

/**
 * [Badge] 容器，会将 [badgeState] 所代表的徽章放置到 [content] 的右上角
 *
 * @param badgeState 徽章状态
 * @param modifier 修饰符
 * @param content 内容
 */
@Composable
fun BadgedBox(
    badgeState: BadgeState,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) = Layout(
    content = {
        Box(
            modifier = Modifier.layoutId("anchor"),
            contentAlignment = Alignment.Center,
            content = content
        )

        Box(
            modifier = Modifier.layoutId("badge"),
            content = { Badge(badgeState) }
        )
    },
    modifier = modifier
) { measurables, constraints ->
    val anchor = measurables.first { it.layoutId == "anchor" }.measure(constraints)
    val badge = measurables.first { it.layoutId == "badge" }.measure(constraints)

    layout(
        anchor.width,
        anchor.height
    ) {
        anchor.placeRelative(0, 0)
        badge.placeRelative(
            anchor.width - badge.width / 2,
            -badge.height / 2
        )
    }
}