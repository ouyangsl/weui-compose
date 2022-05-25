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

public val WeUI.Icons.Filled.Add2: ImageVector
    get() {
        if (_add2 != null) {
            return _add2!!
        }
        _add2 = Builder(name = "Add2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.25f, 11.25f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.25f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.25f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-4.25f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.25f)
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
        return _add2!!
    }

private var _add2: ImageVector? = null
