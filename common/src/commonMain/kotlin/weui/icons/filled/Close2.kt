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

public val WeUI.Icons.Filled.Close2: ImageVector
    get() {
        if (_close2 != null) {
            return _close2!!
        }
        _close2 = Builder(name = "Close2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.06f, 12.0f)
                lineToRelative(3.006f, -3.005f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(12.0f, 10.938f)
                lineTo(8.995f, 7.934f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(10.938f, 12.0f)
                lineToRelative(-3.005f, 3.005f)
                lineToRelative(1.06f, 1.06f)
                lineTo(12.0f, 13.062f)
                lineToRelative(3.005f, 3.005f)
                lineToRelative(1.06f, -1.06f)
                lineTo(13.062f, 12.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _close2!!
    }

private var _close2: ImageVector? = null
