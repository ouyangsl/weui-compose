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

public val WeUI.Icons.Outlined.Add2: ImageVector
    get() {
        if (_add2 != null) {
            return _add2!!
        }
        _add2 = Builder(name = "Add2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.4f, 11.4f)
                lineTo(11.4f, 7.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(4.4f)
                lineTo(17.0f, 11.4f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-4.4f)
                lineTo(12.6f, 17.0f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-4.4f)
                lineTo(7.0f, 12.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(4.4f)
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
        return _add2!!
    }

private var _add2: ImageVector? = null
