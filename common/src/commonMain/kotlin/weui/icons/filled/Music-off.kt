package weui.icons.filled

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

public val WeUI.Icons.Filled.MusicOff: ImageVector
    get() {
        if (`_music-off` != null) {
            return `_music-off`!!
        }
        `_music-off` = Builder(name = "Music-off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.33f, 6.21f)
                lineToRelative(8.326f, 8.325f)
                curveToRelative(0.213f, -0.186f, 0.344f, -0.46f, 0.344f, -0.757f)
                verticalLineToRelative(-9.47f)
                lineTo(9.33f, 6.21f)
                close()
                moveTo(19.5f, 16.378f)
                lineToRelative(2.592f, 2.592f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(4.06f, 3.061f)
                lineTo(5.12f, 2.0f)
                lineToRelative(2.837f, 2.836f)
                lineToRelative(10.935f, -2.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.607f, 0.488f)
                verticalLineToRelative(13.45f)
                close()
                moveTo(8.0f, 9.12f)
                lineTo(8.0f, 19.2f)
                curveToRelative(0.0f, 0.937f, -0.627f, 1.85f, -1.47f, 2.243f)
                curveToRelative(-0.157f, 0.073f, -1.148f, 0.295f, -1.277f, 0.32f)
                curveToRelative(-1.243f, 0.25f, -2.198f, -0.814f, -2.25f, -1.89f)
                curveToRelative(-0.053f, -1.077f, 0.653f, -1.974f, 1.472f, -2.139f)
                lineToRelative(1.265f, -0.317f)
                curveToRelative(0.447f, -0.112f, 0.76f, -0.514f, 0.76f, -0.975f)
                lineTo(6.5f, 7.621f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(17.744f, 18.864f)
                curveToRelative(-0.356f, 0.094f, -0.92f, 0.219f, -1.015f, 0.238f)
                curveToRelative(-1.253f, 0.25f, -2.217f, -0.815f, -2.27f, -1.891f)
                arcToRelative(2.227f, 2.227f, 0.0f, false, true, 0.335f, -1.296f)
                lineToRelative(2.95f, 2.95f)
                close()
            }
        }
        .build()
        return `_music-off`!!
    }

private var `_music-off`: ImageVector? = null
