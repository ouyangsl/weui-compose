package weui.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

public val WeUI.Icons.Outlined.MusicOff: ImageVector
    get() {
        if (`_music-off` != null) {
            return `_music-off`!!
        }
        `_music-off` = Builder(name = "Music-off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.532f, 4.835f)
                lineToRelative(11.345f, -2.492f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.72f, 0.46f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.01f, 0.13f)
                verticalLineToRelative(13.65f)
                arcToRelative(2.675f, 2.675f, 0.0f, false, true, -0.027f, 0.3f)
                lineToRelative(2.845f, 2.845f)
                lineToRelative(-0.849f, 0.848f)
                lineTo(4.85f, 3.85f)
                lineTo(5.697f, 3.0f)
                lineToRelative(1.835f, 1.835f)
                close()
                moveTo(17.389f, 14.692f)
                lineToRelative(0.278f, -0.059f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.73f, -0.89f)
                verticalLineToRelative(-9.91f)
                lineTo(8.667f, 5.97f)
                lineToRelative(8.722f, 8.722f)
                close()
                moveTo(6.407f, 7.104f)
                lineToRelative(1.2f, 1.2f)
                verticalLineToRelative(10.9f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, -1.52f, 2.36f)
                curveToRelative(-0.18f, 0.08f, -1.23f, 0.32f, -1.3f, 0.32f)
                arcToRelative(1.69f, 1.69f, 0.0f, false, true, -0.38f, 0.0f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 1.6f, -2.24f)
                lineToRelative(1.67f, -0.35f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.73f, -0.89f)
                verticalLineToRelative(-9.3f)
                close()
                moveTo(14.92f, 15.617f)
                lineToRelative(0.844f, 0.844f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.197f, 0.682f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.8f, 0.88f)
                horizontalLineToRelative(0.15f)
                curveToRelative(0.096f, -0.018f, 0.395f, -0.082f, 0.663f, -0.146f)
                lineToRelative(0.987f, 0.987f)
                arcToRelative(2.682f, 2.682f, 0.0f, false, true, -0.1f, 0.05f)
                curveToRelative(-0.43f, 0.131f, -0.868f, 0.242f, -1.31f, 0.33f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, -0.39f, 0.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, 0.553f, -1.627f)
                close()
                moveTo(6.407f, 18.303f)
                curveToRelative(-0.155f, 0.08f, -0.32f, 0.14f, -0.49f, 0.18f)
                lineToRelative(-1.72f, 0.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.59f, 1.0f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, 0.94f, 0.87f)
                curveToRelative(0.15f, -0.04f, 0.88f, -0.2f, 1.07f, -0.26f)
                curveToRelative(0.46f, -0.244f, 0.76f, -0.71f, 0.79f, -1.23f)
                verticalLineToRelative(-0.9f)
                close()
            }
        }
        .build()
        return `_music-off`!!
    }

private var `_music-off`: ImageVector? = null
