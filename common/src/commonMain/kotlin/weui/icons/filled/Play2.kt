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

public val WeUI.Icons.Filled.Play2: ImageVector
    get() {
        if (_play2 != null) {
            return _play2!!
        }
        _play2 = Builder(name = "Play2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.765f, 8.38f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.765f, 0.424f)
                verticalLineToRelative(6.392f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.765f, 0.424f)
                lineToRelative(5.113f, -3.196f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.848f)
                lineTo(10.765f, 8.38f)
                close()
            }
        }
        .build()
        return _play2!!
    }

private var _play2: ImageVector? = null
