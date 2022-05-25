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

public val WeUI.Icons.Outlined.Error: ImageVector
    get() {
        if (_error != null) {
            return _error!!
        }
        _error = Builder(name = "Error", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.34f, 6.431f)
                horizontalLineToRelative(1.32f)
                lineToRelative(-0.089f, 7.06f)
                lineTo(11.43f, 13.491f)
                lineToRelative(-0.088f, -7.06f)
                close()
                moveTo(12.0f, 17.073f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, true, -0.835f, -0.835f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.835f, -0.835f)
                curveToRelative(0.476f, 0.0f, 0.835f, 0.36f, 0.835f, 0.835f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.835f, 0.835f)
                close()
            }
        }
        .build()
        return _error!!
    }

private var _error: ImageVector? = null
