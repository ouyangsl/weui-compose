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

public val WeUI.Icons.Outlined.Previous2: ImageVector
    get() {
        if (_previous2 != null) {
            return _previous2!!
        }
        _previous2 = Builder(name = "Previous2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.269f, 11.2f)
                lineToRelative(1.408f, 1.408f)
                lineToRelative(-0.849f, 0.849f)
                lineToRelative(-1.98f, -1.98f)
                lineToRelative(-0.494f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                lineTo(9.828f, 7.8f)
                lineToRelative(0.849f, 0.849f)
                lineTo(9.325f, 10.0f)
                lineTo(14.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.0f, -3.6f)
                lineTo(9.269f, 11.2f)
                close()
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
            }
        }
        .build()
        return _previous2!!
    }

private var _previous2: ImageVector? = null
