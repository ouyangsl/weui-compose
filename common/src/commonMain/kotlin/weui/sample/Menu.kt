package weui.sample

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
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
import weui.theme.WeUI

/**
 * 菜单项
 */
enum class Menu(
    val title: String,
    val available: Boolean
) {
    // 表单
    Button(title = "按钮", available = true),
    Form(title = "表单页", available = false),
    List(title = "列表", available = false),
    Slide(title = "滑块", available = false),
//    Uploader(title = "上传组件", available = false),

    // 基础组件
    Article(title = "文章", available = true),
    Badge(title = "徽章", available = true),

    //    Flex(title = "Flex布局", available = false),
    Footer(title = "页脚", available = true),

    //    Gallery(title = "图册", available = false),
//    Grid(title = "九宫格", available = false),
    Icons(title = "图标", available = true),
    Loading(title = "加载中", available = true),
    LoadMore(title = "加载更多", available = true),
    Panel(title = "面板", available = true),
    Preview(title = "表单预览", available = false),
    Progress(title = "进度条", available = true),
    Steps(title = "步骤条", available = false),

    // 操作反馈
    ActionSheet(title = "弹出式菜单", available = false),
    Dialog(title = "对话框", available = true),
    HalfScreenDialog(title = "半屏组件", available = false),
    Msg(title = "提示页", available = false),
    Picker(title = "多列选择器", available = false),
    Toast(title = "弹出式提示", available = false),
    TopTips(title = "顶部提示条", available = true),

    // 导航相关
    TopBar(title = "顶部导航条", available = true),
    NavBar(title = "底部导航条", available = true),
    TabBar(title = "表头导航条", available = true),

    // 搜索相关
    SearchBar(title = "搜索栏", available = false),

    // 层级规范
    Layer(title = "层级规范", available = false)
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
//        Menu.Uploader
    ),
    "基础组件" to listOf(
        Menu.Article,
        Menu.Badge,
//        Menu.Flex,
        Menu.Footer,
//        Menu.Gallery,
//        Menu.Grid,
        Menu.Icons,
        Menu.Loading,
        Menu.LoadMore,
        Menu.Panel,
        Menu.Preview,
        Menu.Progress,
        Menu.Steps
    ),
    "操作反馈" to listOf(
        Menu.ActionSheet,
        Menu.Dialog,
        Menu.HalfScreenDialog,
        Menu.Msg,
        Menu.Picker,
        Menu.Toast,
        Menu.TopTips
    ),
    "导航相关" to listOf(
        Menu.TopBar,
        Menu.NavBar,
        Menu.TabBar
    ),
    "搜索相关" to listOf(
        Menu.SearchBar
    ),
    "层级规范" to listOf(
        Menu.Layer
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
        modifier = modifier
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
    val availableCount = menus.count { it.available }

    Column(
        modifier = modifier.background(WeUI.colors.surface)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .alpha(animatedAlpha.value)
                .fillMaxWidth()
                .clickable { onExpandChange(!expanded) }
                .padding(15.dp)
        ) {
            BasicText(
                text = title,
                style = TextStyle(
                    fontSize = 14.sp
                )
            )

            if (availableCount > 0) {
                Available(
                    text = "$availableCount/${menus.size}",
                    modifier = Modifier.padding(5.dp)
                )
            }
        }

        AnimatedVisibility(visible = expanded) {
            Column(
                verticalArrangement = Arrangement.spacedBy(1.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(WeUI.colors.divider)
            ) {
                for (menu in menus) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(WeUI.colors.surface)
                            .clickable { onMenuClick(menu) }
                            .padding(
                                horizontal = 10.dp,
                                vertical = 15.dp
                            )
                    ) {
                        BasicText(text = menu.name)

                        if (menu.available) {
                            Available(
                                text = "Available",
                                modifier = Modifier.padding(5.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * 功能可用性标签
 */
@Composable
private fun Available(
    text: String,
    modifier: Modifier = Modifier
) = BasicText(
    text = text,
    style = TextStyle(color = Color.White),
    modifier = modifier
        .background(
            color = WeUI.colors.success,
            shape = RoundedCornerShape(2.dp)
        )
        .padding(2.dp)
)