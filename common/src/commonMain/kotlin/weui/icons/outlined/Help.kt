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

public val WeUI.Icons.Outlined.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(name = "Help", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.0f, 9.707f)
                curveTo(9.077f, 8.2f, 10.081f, 7.0f, 12.042f, 7.0f)
                curveTo(13.8f, 7.0f, 15.0f, 8.088f, 15.0f, 9.526f)
                curveToRelative(0.0f, 1.095f, -0.565f, 1.87f, -1.458f, 2.407f)
                curveToRelative(-0.886f, 0.523f, -1.137f, 0.914f, -1.137f, 1.646f)
                verticalLineToRelative(0.454f)
                horizontalLineToRelative(-1.221f)
                verticalLineToRelative(-0.642f)
                curveToRelative(-0.007f, -0.921f, 0.44f, -1.55f, 1.395f, -2.121f)
                curveToRelative(0.81f, -0.496f, 1.123f, -0.935f, 1.123f, -1.682f)
                curveToRelative(0.0f, -0.865f, -0.67f, -1.5f, -1.709f, -1.5f)
                curveToRelative(-1.053f, 0.0f, -1.723f, 0.621f, -1.8f, 1.619f)
                lineTo(9.0f, 9.707f)
                close()
                moveTo(11.798f, 17.214f)
                arcToRelative(0.786f, 0.786f, 0.0f, false, true, -0.796f, -0.795f)
                curveToRelative(0.0f, -0.454f, 0.35f, -0.796f, 0.796f, -0.796f)
                curveToRelative(0.453f, 0.0f, 0.795f, 0.342f, 0.795f, 0.796f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.795f, 0.795f)
                close()
            }
        }
        .build()
        return _help!!
    }

private var _help: ImageVector? = null
