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

public val WeUI.Icons.Outlined.Voice: ImageVector
    get() {
        if (_voice != null) {
            return _voice!!
        }
        _voice = Builder(name = "Voice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 20.8f)
                arcToRelative(8.8f, 8.8f, 0.0f, true, false, 0.0f, -17.6f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, 0.0f, 17.6f)
                close()
                moveTo(12.308f, 16.808f)
                arcTo(6.774f, 6.774f, 0.0f, false, false, 14.3f, 12.0f)
                curveToRelative(0.0f, -1.83f, -0.724f, -3.54f, -1.992f, -4.808f)
                lineToRelative(0.849f, -0.849f)
                arcTo(7.975f, 7.975f, 0.0f, false, true, 15.5f, 12.0f)
                curveToRelative(0.0f, 2.21f, -0.895f, 4.21f, -2.343f, 5.657f)
                lineToRelative(-0.849f, -0.849f)
                close()
                moveTo(10.328f, 14.828f)
                arcTo(3.983f, 3.983f, 0.0f, false, false, 11.5f, 12.0f)
                arcToRelative(3.983f, 3.983f, 0.0f, false, false, -1.172f, -2.828f)
                lineToRelative(0.849f, -0.849f)
                arcTo(5.184f, 5.184f, 0.0f, false, true, 12.7f, 12.0f)
                arcToRelative(5.184f, 5.184f, 0.0f, false, true, -1.523f, 3.677f)
                lineToRelative(-0.849f, -0.849f)
                close()
                moveTo(9.198f, 13.698f)
                lineTo(7.5f, 12.0f)
                lineToRelative(1.697f, -1.697f)
                curveToRelative(0.434f, 0.434f, 0.703f, 1.034f, 0.703f, 1.697f)
                reflectiveCurveToRelative(-0.269f, 1.263f, -0.703f, 1.697f)
                close()
            }
        }
        .build()
        return _voice!!
    }

private var _voice: ImageVector? = null
