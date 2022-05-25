package weui.components.loading

import androidx.compose.foundation.Image
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import kotlinx.coroutines.delay
import weui.icons.default.Loading
import weui.theme.WeUI

@Composable
fun Loading(
    modifier: Modifier = Modifier
) {
    var rotation by remember { mutableStateOf(0f) }

    LaunchedEffect(Unit) {
        while (true) {
            rotation = (rotation + (360f / 12f)) % 360f
            delay(100)
        }
    }

    Image(
        painter = rememberVectorPainter(WeUI.Icons.Default.Loading),
        contentDescription = null,
        modifier = modifier.graphicsLayer { rotationZ = rotation }
    )
}