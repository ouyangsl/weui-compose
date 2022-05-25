package weui.components.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.badge.BadgeState
import weui.components.badge.BadgedBox
import weui.theme.WeUI

/**
 * NavBar: 底部导航条
 */
@Composable
fun NavBar(
    selected: Int,
    count: Int,
    badgeStates: (index: Int) -> BadgeState,
    titles: @Composable (isSelected: Boolean, index: Int) -> Unit,
    icons: @Composable (isSelected: Boolean, index: Int) -> Unit,
    modifier: Modifier = Modifier,
    onItemSelected: (Int) -> Unit
) {
    Row(
        modifier = modifier
            .background(WeUI.colors.divider)
            .padding(top = 1.dp)
            .background(WeUI.colors.surface)
    ) {
        for (index in 0 until count) {

            val isSelected = index == selected

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .height(60.dp)
                    .clickable(onClick = { onItemSelected(index) })
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    BadgedBox(
                        badgeStates(index)
                    ) {
                        icons(isSelected, index)
                    }

                    titles(isSelected, index)
                }
            }
        }
    }
}