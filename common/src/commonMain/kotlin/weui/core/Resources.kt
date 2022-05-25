package weui.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

@Composable
expect fun imageResource(res: String): Painter

@Composable
fun String.imagePainter(): Painter = imageResource(this)