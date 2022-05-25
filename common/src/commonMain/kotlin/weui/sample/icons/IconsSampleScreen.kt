package weui.sample.icons

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import weui.components.navigation.TabBar
import weui.icons.default.*
import weui.icons.filled.*
import weui.icons.outlined.*
import weui.theme.WeUI

val FilledIcons = listOf(
    WeUI.Icons.Filled.AddFriends,
    WeUI.Icons.Filled.Add,
    WeUI.Icons.Filled.Add2,
    WeUI.Icons.Filled.Album,
    WeUI.Icons.Filled.Arrow,
    WeUI.Icons.Filled.At,
    WeUI.Icons.Filled.Back,
    WeUI.Icons.Filled.Back2,
    WeUI.Icons.Filled.BellringOff,
    WeUI.Icons.Filled.BellringOn,
    WeUI.Icons.Filled.Camera,
    WeUI.Icons.Filled.Cellphone,
    WeUI.Icons.Filled.Clip,
    WeUI.Icons.Filled.Close,
    WeUI.Icons.Filled.Close2,
    WeUI.Icons.Filled.Comment,
    WeUI.Icons.Filled.Contacts,
    WeUI.Icons.Filled.Copy,
    WeUI.Icons.Filled.DeleteOn,
    WeUI.Icons.Filled.Delete,
    WeUI.Icons.Filled.Discover,
    WeUI.Icons.Filled.Display,
    WeUI.Icons.Filled.Done,
    WeUI.Icons.Filled.Done2,
    WeUI.Icons.Filled.Download,
    WeUI.Icons.Filled.Email,
    WeUI.Icons.Filled.Error,
    WeUI.Icons.Filled.EyesOff,
    WeUI.Icons.Filled.EyesOn,
    WeUI.Icons.Filled.Folder,
    WeUI.Icons.Filled.GroupDetail,
    WeUI.Icons.Filled.Help,
    WeUI.Icons.Filled.Home,
    WeUI.Icons.Filled.Imac,
    WeUI.Icons.Filled.Info,
    WeUI.Icons.Filled.Keyboard,
    WeUI.Icons.Filled.Like,
    WeUI.Icons.Filled.Link,
    WeUI.Icons.Filled.Location,
    WeUI.Icons.Filled.Lock,
    WeUI.Icons.Filled.MaxWindow,
    WeUI.Icons.Filled.Me,
    WeUI.Icons.Filled.Mike,
    WeUI.Icons.Filled.Mike2,
    WeUI.Icons.Filled.MobileContacts,
    WeUI.Icons.Filled.More,
    WeUI.Icons.Filled.More2,
    WeUI.Icons.Filled.Mosaic,
    WeUI.Icons.Filled.MusicOff,
    WeUI.Icons.Filled.Music,
    WeUI.Icons.Filled.Note,
    WeUI.Icons.Filled.Pad,
    WeUI.Icons.Filled.Pause,
    WeUI.Icons.Filled.Pencil,
    WeUI.Icons.Filled.PhotoWall,
    WeUI.Icons.Filled.Play,
    WeUI.Icons.Filled.Play2,
    WeUI.Icons.Filled.Previous,
    WeUI.Icons.Filled.Previous2,
    WeUI.Icons.Filled.QrCode,
    WeUI.Icons.Filled.Refresh,
    WeUI.Icons.Filled.ReportProblem,
    WeUI.Icons.Filled.Search,
    WeUI.Icons.Filled.Sending,
    WeUI.Icons.Filled.Setting,
    WeUI.Icons.Filled.Share,
    WeUI.Icons.Filled.Shop,
    WeUI.Icons.Filled.Star,
    WeUI.Icons.Filled.Sticker,
    WeUI.Icons.Filled.Tag,
    WeUI.Icons.Filled.Text,
    WeUI.Icons.Filled.Time,
    WeUI.Icons.Filled.TransferText,
    WeUI.Icons.Filled.Transfer,
    WeUI.Icons.Filled.Transfer2,
    WeUI.Icons.Filled.Tv,
    WeUI.Icons.Filled.VideoCall,
    WeUI.Icons.Filled.Voice,
    WeUI.Icons.Filled.VolumeDown,
    WeUI.Icons.Filled.VolumeOff,
    WeUI.Icons.Filled.VolumeUp,
)

val OutlinedIcons = listOf(
    WeUI.Icons.Outlined.AddFriends,
    WeUI.Icons.Outlined.Add,
    WeUI.Icons.Outlined.Add2,
    WeUI.Icons.Outlined.Album,
    WeUI.Icons.Outlined.Arrow,
    WeUI.Icons.Outlined.At,
    WeUI.Icons.Outlined.Back,
    WeUI.Icons.Outlined.Back2,
    WeUI.Icons.Outlined.BellringOff,
    WeUI.Icons.Outlined.BellringOn,
    WeUI.Icons.Outlined.Camera,
    WeUI.Icons.Outlined.Cellphone,
    WeUI.Icons.Outlined.Clip,
    WeUI.Icons.Outlined.Close,
    WeUI.Icons.Outlined.Close2,
    WeUI.Icons.Outlined.Comment,
    WeUI.Icons.Outlined.Contacts,
    WeUI.Icons.Outlined.Copy,
    WeUI.Icons.Outlined.DeleteOn,
    WeUI.Icons.Outlined.Delete,
    WeUI.Icons.Outlined.Discover,
    WeUI.Icons.Outlined.Display,
    WeUI.Icons.Outlined.Done,
    WeUI.Icons.Outlined.Done2,
    WeUI.Icons.Outlined.Download,
    WeUI.Icons.Outlined.Email,
    WeUI.Icons.Outlined.Error,
    WeUI.Icons.Outlined.EyesOff,
    WeUI.Icons.Outlined.EyesOn,
    WeUI.Icons.Outlined.Folder,
    WeUI.Icons.Outlined.GroupDetail,
    WeUI.Icons.Outlined.Help,
    WeUI.Icons.Outlined.Home,
    WeUI.Icons.Outlined.Imac,
    WeUI.Icons.Outlined.Info,
    WeUI.Icons.Outlined.Keyboard,
    WeUI.Icons.Outlined.Like,
    WeUI.Icons.Outlined.Link,
    WeUI.Icons.Outlined.Location,
    WeUI.Icons.Outlined.Lock,
    WeUI.Icons.Outlined.MaxWindow,
    WeUI.Icons.Outlined.Me,
    WeUI.Icons.Outlined.Mike,
    WeUI.Icons.Outlined.Mike2,
    WeUI.Icons.Outlined.MobileContacts,
    WeUI.Icons.Outlined.More,
    WeUI.Icons.Outlined.More2,
    WeUI.Icons.Outlined.Mosaic,
    WeUI.Icons.Outlined.MusicOff,
    WeUI.Icons.Outlined.Music,
    WeUI.Icons.Outlined.Note,
    WeUI.Icons.Outlined.Pad,
    WeUI.Icons.Outlined.Pause,
    WeUI.Icons.Outlined.Pencil,
    WeUI.Icons.Outlined.PhotoWall,
    WeUI.Icons.Outlined.Play,
    WeUI.Icons.Outlined.Play2,
    WeUI.Icons.Outlined.Previous,
    WeUI.Icons.Outlined.Previous2,
    WeUI.Icons.Outlined.QrCode,
    WeUI.Icons.Outlined.Refresh,
    WeUI.Icons.Outlined.ReportProblem,
    WeUI.Icons.Outlined.Search,
    WeUI.Icons.Outlined.Sending,
    WeUI.Icons.Outlined.Setting,
    WeUI.Icons.Outlined.Share,
    WeUI.Icons.Outlined.Shop,
    WeUI.Icons.Outlined.Star,
    WeUI.Icons.Outlined.Sticker,
    WeUI.Icons.Outlined.Tag,
    WeUI.Icons.Outlined.Text,
    WeUI.Icons.Outlined.Time,
    WeUI.Icons.Outlined.TransferText,
    WeUI.Icons.Outlined.Transfer,
    WeUI.Icons.Outlined.Transfer2,
    WeUI.Icons.Outlined.Tv,
    WeUI.Icons.Outlined.VideoCall,
    WeUI.Icons.Outlined.Voice,
    WeUI.Icons.Outlined.VolumeDown,
    WeUI.Icons.Outlined.VolumeOff,
    WeUI.Icons.Outlined.VolumeUp,
)

@Composable
fun IconsSampleScreen() {
    var selected by remember { mutableStateOf(0) }
    val tabs = listOf(
        "Default", "Filled", "Outlined"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        TabBar(
            selected = selected, tabs = tabs, modifier = Modifier.fillMaxWidth()
        ) {
            selected = it
        }

        Box(modifier = Modifier.fillMaxWidth().weight(1f).padding(10.dp)) {
            when (selected) {
                0 -> DefaultScreen()
                1 -> FilledScreen()
                2 -> OutlinedScreen()
                else -> {}
            }
        }
    }
}

@Composable
private fun DefaultIconInfo(
    icon: ImageVector,
    tint: Color,
    name: String,
    desc: String,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(10.dp)
    ) {
        Image(
            painter = rememberVectorPainter(icon),
            contentDescription = null,
            colorFilter = ColorFilter.tint(tint),
            modifier = Modifier.size(48.dp)
        )

        Column {
            BasicText(text = name, style = WeUI.typography.title)
            BasicText(text = desc, style = WeUI.typography.desc)
        }
    }
}

@Composable
private fun Icon(
    icon: ImageVector,
    name: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.padding(5.dp)
    ) {
        Image(
            painter = rememberVectorPainter(icon), contentDescription = null, modifier = Modifier.size(24.dp)
        )

        BasicText(
            text = name
        )
    }
}

@Composable
private fun DefaultScreen() = Column(
    modifier = Modifier.fillMaxSize()
) {
    DefaultIconInfo(
        icon = WeUI.Icons.Default.Success,
        tint = WeUI.colors.success,
        name = "成功",
        desc = "用于表示操作顺利达成",
        modifier = Modifier.fillMaxWidth()
    )

    DefaultIconInfo(
        icon = WeUI.Icons.Default.Tip,
        tint = WeUI.colors.tip,
        name = "提示",
        desc = "用于表示信息提示；也常用于缺乏条件的操作拦截，提示用户所需信息",
        modifier = Modifier.fillMaxWidth()
    )

    DefaultIconInfo(
        icon = WeUI.Icons.Default.Warn,
        tint = WeUI.colors.warn,
        name = "普通警告",
        desc = "用于表示操作后将引起一定后果的情况",
        modifier = Modifier.fillMaxWidth()
    )

    DefaultIconInfo(
        icon = WeUI.Icons.Default.Warn,
        tint = WeUI.colors.error,
        name = "强烈警告",
        desc = "用于表示操作后将引起严重的不可挽回的后果的情况",
        modifier = Modifier.fillMaxWidth()
    )

    DefaultIconInfo(
        icon = WeUI.Icons.Default.Wait,
        tint = WeUI.colors.wait,
        name = "等待",
        desc = "用于表示等待",
        modifier = Modifier.fillMaxWidth()
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun FilledScreen() {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 80.dp)
    ) {
        items(FilledIcons) {
            Icon(icon = it, name = it.name)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun OutlinedScreen() {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 80.dp)
    ) {
        items(OutlinedIcons) {
            Icon(icon = it, name = it.name)
        }
    }
}