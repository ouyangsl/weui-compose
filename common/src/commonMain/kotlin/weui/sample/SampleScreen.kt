package weui.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import weui.core.LocalWindowSizeClasses
import weui.core.WindowSizeClasses
import weui.icons.filled.Back
import weui.sample.article.ArticleSampleScreen
import weui.sample.badge.BadgeSampleScreen
import weui.sample.button.ButtonSampleScreen
import weui.sample.dialog.DialogSampleScreen
import weui.sample.dialog.TopTipsSampleScreen
import weui.sample.footer.FooterSampleScreen
import weui.sample.icons.IconsSampleScreen
import weui.sample.loading.LoadMoreSampleScreen
import weui.sample.loading.LoadingSampleScreen
import weui.sample.navigation.NavBarSampleScreen
import weui.sample.navigation.TabBarSampleScreen
import weui.sample.navigation.TopBarSampleScreen
import weui.sample.panel.PanelSampleScreen
import weui.sample.progress.ProgressSampleScreen
import weui.theme.WeUI

/**
 * 根据不同的菜单项，显示不同的 Sample
 */
@Composable
fun SampleScreen(
    menu: Menu?,
    modifier: Modifier = Modifier,
    onClickBack: () -> Unit = {}
) {
    val mode = LocalWindowSizeClasses.current

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        if (mode == WindowSizeClasses.Compact) {
            Image(
                painter = rememberVectorPainter(WeUI.Icons.Filled.Back),
                contentDescription = null,
                modifier = Modifier.size(24.dp).clickable(
                    onClick = onClickBack
                )
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier.fillMaxWidth().weight(1f)
        ) {
            when (menu) {
                Menu.Button -> ButtonSampleScreen()
                Menu.Article -> ArticleSampleScreen()
                Menu.Badge -> BadgeSampleScreen()
                Menu.Footer -> FooterSampleScreen()
                Menu.Icons -> IconsSampleScreen()
                Menu.Loading -> LoadingSampleScreen()
                Menu.LoadMore -> LoadMoreSampleScreen()
                Menu.Panel -> PanelSampleScreen()
                Menu.Progress -> ProgressSampleScreen()
                Menu.Dialog -> DialogSampleScreen()
                Menu.TopTips -> TopTipsSampleScreen()
                Menu.TopBar -> TopBarSampleScreen()
                Menu.NavBar -> NavBarSampleScreen()
                Menu.TabBar -> TabBarSampleScreen()
                null -> NullSampleScreen()
                else -> NotAvailableSampleScreen()
            }
        }
    }
}

@Composable
private fun NullSampleScreen() {

}

@Composable
private fun NotAvailableSampleScreen() {

}