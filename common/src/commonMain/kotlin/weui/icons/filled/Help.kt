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

public val WeUI.Icons.Filled.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(name = "Help", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(9.0f, 9.782f)
                horizontalLineToRelative(1.606f)
                curveToRelative(0.055f, -0.847f, 0.623f, -1.387f, 1.504f, -1.387f)
                curveToRelative(0.862f, 0.0f, 1.436f, 0.526f, 1.436f, 1.25f)
                curveToRelative(0.0f, 0.677f, -0.287f, 1.046f, -1.135f, 1.56f)
                curveToRelative(-0.943f, 0.553f, -1.34f, 1.168f, -1.278f, 2.18f)
                lineToRelative(0.007f, 0.485f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-0.396f)
                curveToRelative(0.0f, -0.684f, 0.253f, -1.04f, 1.148f, -1.559f)
                curveToRelative(0.93f, -0.554f, 1.45f, -1.285f, 1.45f, -2.331f)
                curveTo(15.323f, 8.08f, 14.071f, 7.0f, 12.198f, 7.0f)
                curveTo(10.17f, 7.0f, 9.055f, 8.176f, 9.0f, 9.782f)
                close()
                moveTo(11.953f, 17.083f)
                curveToRelative(0.554f, 0.0f, 0.991f, -0.43f, 0.991f, -0.97f)
                reflectiveCurveToRelative(-0.437f, -0.965f, -0.99f, -0.965f)
                curveToRelative(-0.555f, 0.0f, -0.999f, 0.424f, -0.999f, 0.964f)
                reflectiveCurveToRelative(0.444f, 0.971f, 0.998f, 0.971f)
                close()
            }
        }
        .build()
        return _help!!
    }

private var _help: ImageVector? = null
