package weui.icons.default

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

public val WeUI.Icons.Default.Warn: ImageVector
    get() {
        if (_warn != null) {
            return _warn!!
        }
        _warn = Builder(name = "Warn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(11.237f, 6.136f)
                lineToRelative(0.11f, 7.596f)
                horizontalLineToRelative(1.305f)
                lineToRelative(0.11f, -7.596f)
                horizontalLineToRelative(-1.525f)
                close()
                moveTo(11.996f, 17.103f)
                curveToRelative(0.512f, 0.0f, 0.902f, -0.383f, 0.902f, -0.882f)
                curveToRelative(0.0f, -0.5f, -0.39f, -0.882f, -0.902f, -0.882f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, false, -0.896f, 0.882f)
                curveToRelative(0.0f, 0.499f, 0.396f, 0.882f, 0.896f, 0.882f)
                close()
            }
        }
        .build()
        return _warn!!
    }

private var _warn: ImageVector? = null
