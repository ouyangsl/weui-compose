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

public val WeUI.Icons.Filled.Transfer2: ImageVector
    get() {
        if (_transfer2 != null) {
            return _transfer2!!
        }
        _transfer2 = Builder(name = "Transfer2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.015f, 14.554f)
                lineToRelative(-1.114f, 2.376f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.596f, 0.494f)
                lineToRelative(4.8f, -3.469f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.292f, -0.905f)
                horizontalLineTo(13.72f)
                lineToRelative(-0.002f, 0.004f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6.015f)
                close()
                moveTo(11.21f, 9.446f)
                lineToRelative(1.114f, -2.376f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.597f, -0.494f)
                lineToRelative(-4.8f, 3.469f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.293f, 0.905f)
                horizontalLineToRelative(3.285f)
                lineToRelative(0.001f, -0.004f)
                horizontalLineToRelative(6.714f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-6.01f)
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
        return _transfer2!!
    }

private var _transfer2: ImageVector? = null
