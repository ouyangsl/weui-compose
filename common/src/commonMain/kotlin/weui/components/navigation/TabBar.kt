package weui.components.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

/**
 * TabBar: 表头样式的导航组件
 */
@Composable
fun TabBar(
    selected: Int,
    tabs: List<String>,
    modifier: Modifier = Modifier,
    onTabSelected: (Int) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(1.dp),
        modifier = modifier
            .background(WeUI.colors.background)
            .padding(bottom = 1.dp)
    ) {
        for ((index, tab) in tabs.withIndex()) {
            TabItem(
                isSelected = selected == index,
                title = tab,
                modifier = Modifier.weight(1f)
            ) {
                onTabSelected(index)
            }
        }
    }
}

@Composable
private fun TabItem(
    isSelected: Boolean,
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) = Box(
    contentAlignment = Alignment.Center,
    modifier = modifier
        .clickable(onClick = onClick)
        .background(if (isSelected) WeUI.colors.background else WeUI.colors.surface)
        .height(50.dp)
) {
    BasicText(
        text = title,
        style = WeUI.typography.button
    )
}