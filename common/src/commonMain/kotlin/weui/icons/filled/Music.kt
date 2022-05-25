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

public val WeUI.Icons.Filled.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.0f, 4.309f)
                lineTo(8.0f, 6.5f)
                verticalLineToRelative(12.7f)
                curveToRelative(0.0f, 0.937f, -0.627f, 1.85f, -1.47f, 2.243f)
                curveToRelative(-0.157f, 0.073f, -1.148f, 0.295f, -1.277f, 0.32f)
                curveToRelative(-1.243f, 0.25f, -2.198f, -0.814f, -2.25f, -1.89f)
                curveToRelative(-0.053f, -1.077f, 0.653f, -1.974f, 1.472f, -2.139f)
                lineToRelative(1.265f, -0.317f)
                curveToRelative(0.447f, -0.112f, 0.76f, -0.514f, 0.76f, -0.975f)
                verticalLineTo(5.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.786f, -0.976f)
                lineToRelative(11.607f, -2.542f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.607f, 0.488f)
                verticalLineToRelative(13.61f)
                curveToRelative(0.0f, 0.937f, -0.633f, 1.85f, -1.483f, 2.243f)
                curveToRelative(-0.158f, 0.073f, -1.158f, 0.295f, -1.288f, 0.32f)
                curveToRelative(-1.253f, 0.25f, -2.217f, -0.814f, -2.27f, -1.89f)
                curveToRelative(-0.053f, -1.077f, 0.66f, -1.974f, 1.485f, -2.139f)
                lineToRelative(1.292f, -0.32f)
                curveToRelative(0.449f, -0.11f, 0.764f, -0.513f, 0.764f, -0.975f)
                verticalLineToRelative(-9.47f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
