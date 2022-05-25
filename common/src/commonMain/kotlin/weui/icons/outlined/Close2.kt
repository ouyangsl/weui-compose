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

public val WeUI.Icons.Outlined.Close2: ImageVector
    get() {
        if (_close2 != null) {
            return _close2!!
        }
        _close2 = Builder(name = "Close2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.849f, 12.0f)
                lineToRelative(3.11f, 3.111f)
                lineToRelative(-0.848f, 0.849f)
                lineTo(12.0f, 12.849f)
                lineToRelative(-3.111f, 3.11f)
                lineToRelative(-0.849f, -0.848f)
                lineTo(11.151f, 12.0f)
                lineToRelative(-3.11f, -3.111f)
                lineToRelative(0.848f, -0.849f)
                lineTo(12.0f, 11.151f)
                lineToRelative(3.111f, -3.11f)
                lineToRelative(0.849f, 0.848f)
                lineTo(12.849f, 12.0f)
                close()
            }
        }
        .build()
        return _close2!!
    }

private var _close2: ImageVector? = null
