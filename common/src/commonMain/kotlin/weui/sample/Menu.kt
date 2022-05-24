package weui.sample

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import weui.WeUITheme

/**
 * 菜单项
 */
enum class Menu(
    val available: Boolean
) {
    // 表单
    Button(available = true),
    Form(available = false),
    List(available = false),
    Slide(available = false),
    Uploader(available = false),

    // 基础组件
    Article(available = false),
    Badge(available = false),
    Flex(available = false),
    Footer(available = false),
    Gallery(available = false),
    Grid(available = false),
    Icons(available = false),
    Loading(available = false),
    LoadMore(available = false),
    Panel(available = false),
    Preview(available = false),
    Progress(available = false),
    Steps(available = false),
}

/**
 * 菜单组集合
 */
private val MenuGroups = mapOf(
    "表单" to listOf(
        Menu.Button,
        Menu.Form,
        Menu.List,
        Menu.Slide,
        Menu.Uploader
    ),
    "基础组件" to listOf(
        Menu.Article,
        Menu.Badge,
        Menu.Flex,
        Menu.Footer,
        Menu.Gallery,
        Menu.Grid,
        Menu.Icons,
        Menu.Loading,
        Menu.LoadMore,
        Menu.Panel,
        Menu.Preview,
        Menu.Progress,
        Menu.Steps
    )
)

/**
 * 全部菜单
 */
@Composable
fun MenuGroups(
    modifier: Modifier = Modifier,
    onMenuClick: (Menu) -> Unit
) {
    var selected by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        for (group in MenuGroups) {
            MenuGroup(
                title = group.key,
                menus = group.value,
                modifier = Modifier.fillMaxWidth(),
                expanded = group.key == selected,
                onExpandChange = {
                    selected = if (it) group.key else ""
                },
                onMenuClick = onMenuClick
            )
        }
    }
}

/**
 * 菜单组
 */
@Composable
private fun MenuGroup(
    title: String,
    menus: List<Menu>,
    modifier: Modifier = Modifier,
    expanded: Boolean = false,
    onExpandChange: (Boolean) -> Unit,
    onMenuClick: (Menu) -> Unit
) {
    val alpha = derivedStateOf { if (expanded) 0.4f else 1f }
    val animatedAlpha = animateFloatAsState(
        targetValue = alpha.value
    )

    Column(
        modifier = modifier.background(WeUITheme.colors.surface)
    ) {
        BasicText(
            text = title,
            modifier = Modifier
                .alpha(animatedAlpha.value)
                .fillMaxWidth()
                .clickable { onExpandChange(!expanded) }
                .padding(15.dp),
            style = TextStyle(
                fontSize = 14.sp
            )
        )

        AnimatedVisibility(visible = expanded) {
            Column(
                verticalArrangement = Arrangement.spacedBy(1.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(WeUITheme.colors.background)
            ) {
                for (menu in menus) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(WeUITheme.colors.surface)
                            .clickable { onMenuClick(menu) }
                            .padding(
                                horizontal = 10.dp,
                                vertical = 15.dp
                            )
                    ) {
                        BasicText(text = menu.name)

                        if (menu.available) {
                            BasicText(
                                text = "Available",
                                style = TextStyle(color = Color.White),
                                modifier = Modifier
                                    .padding(5.dp)
                                    .background(
                                        color = WeUITheme.colors.success,
                                        shape = RoundedCornerShape(2.dp)
                                    )
                                    .padding(2.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}