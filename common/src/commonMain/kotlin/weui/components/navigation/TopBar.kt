package weui.components.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

private val TopBarHeight = 44.dp

/**
 * TopBar: 顶部导航条
 *
 * @param start Start 方向内容
 * @param end End 方向内容
 * @param title 标题
 */
@Composable
fun TopBar(
    title: String,
    subtitle: String? = null,
    start: @Composable () -> Unit = {},
    end: @Composable () -> Unit = {},
    modifier: Modifier = Modifier
) = Box(
    modifier = modifier
        .background(WeUI.colors.divider)
        .padding(bottom = 1.dp)
        .background(WeUI.colors.surface)
        .height(TopBarHeight)
) {
    Box(modifier = Modifier.align(Alignment.CenterStart)) { start() }

    Column(
        verticalArrangement = Arrangement.aligned(Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.align(Alignment.Center)
    ) {
        BasicText(
            text = title,
            style = WeUI.typography.title
        )

        if (!subtitle.isNullOrBlank()) {
            BasicText(
                text = subtitle,
                style = WeUI.typography.subtitle
            )
        }
    }

    Box(modifier = Modifier.align(Alignment.CenterEnd)) { end() }
}

/**
 * 适用于 TopBar 上的图标
 *
 * @param icon 图标
 * @param modifier 修饰符
 * @param onClick 点击事件
 */
@Composable
fun TopBarIcon(
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) = Box(
    contentAlignment = Alignment.Center,
    modifier = modifier.size(TopBarHeight).clickable(onClick = onClick)
) {
    Image(
        painter = rememberVectorPainter(icon),
        contentDescription = null,
        modifier = Modifier.size(24.dp)
    )
}