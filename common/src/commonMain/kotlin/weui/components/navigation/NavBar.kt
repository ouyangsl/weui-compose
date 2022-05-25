package weui.components.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

/**
 * NavBar: 底部导航条
 */
@Composable
fun NavBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) = Row(
    modifier = modifier
        .background(WeUI.colors.divider)
        .padding(top = 1.dp)
        .background(WeUI.colors.surface)
        .height(60.dp)
        .selectableGroup(),
    content = content
)

@Composable
fun RowScope.NavItem(
    selected: Boolean,
    icon: @Composable () -> Unit,
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.weight(1f)
            .fillMaxHeight()
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled
            )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(3.dp)
        ) {
            icon()

            title()
        }
    }
}