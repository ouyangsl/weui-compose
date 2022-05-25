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

public val WeUI.Icons.Outlined.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.27f, 8.188f)
                curveToRelative(-1.7f, 0.0f, -2.801f, 1.44f, -2.801f, 3.656f)
                curveToRelative(0.0f, 2.203f, 1.09f, 3.633f, 2.789f, 3.633f)
                curveToRelative(1.734f, 0.0f, 2.847f, -1.454f, 2.847f, -3.692f)
                curveToRelative(0.0f, -2.203f, -1.09f, -3.598f, -2.835f, -3.598f)
                close()
                moveTo(11.645f, 2.0f)
                curveToRelative(5.135f, 0.0f, 9.375f, 3.527f, 9.375f, 8.719f)
                curveToRelative(0.0f, 3.726f, -1.547f, 6.117f, -4.125f, 6.117f)
                curveToRelative(-1.395f, 0.0f, -2.497f, -0.844f, -2.672f, -2.156f)
                horizontalLineToRelative(-0.082f)
                curveToRelative(-0.528f, 1.336f, -1.618f, 2.074f, -3.07f, 2.074f)
                curveToRelative(-2.415f, 0.0f, -4.055f, -1.992f, -4.055f, -4.945f)
                curveToRelative(0.0f, -2.883f, 1.664f, -4.875f, 4.054f, -4.875f)
                curveToRelative(1.36f, 0.0f, 2.543f, 0.738f, 2.977f, 1.886f)
                horizontalLineToRelative(0.082f)
                verticalLineTo(7.168f)
                horizontalLineToRelative(1.36f)
                verticalLineToRelative(6.703f)
                curveToRelative(0.0f, 1.066f, 0.562f, 1.77f, 1.628f, 1.77f)
                curveToRelative(1.559f, 0.0f, 2.625f, -1.793f, 2.625f, -4.946f)
                curveToRelative(0.0f, -4.476f, -3.504f, -7.52f, -8.097f, -7.52f)
                curveToRelative(-4.594f, 0.0f, -8.356f, 3.35f, -8.356f, 8.598f)
                curveToRelative(0.0f, 4.875f, 4.014f, 8.59f, 8.484f, 8.59f)
                curveToRelative(1.582f, 0.0f, 3.094f, -0.199f, 3.891f, -0.515f)
                verticalLineToRelative(1.16f)
                curveToRelative(-0.95f, 0.328f, -2.332f, 0.515f, -3.902f, 0.515f)
                curveTo(6.198f, 21.523f, 2.0f, 17.326f, 2.0f, 11.727f)
                arcTo(9.662f, 9.662f, 0.0f, false, true, 11.645f, 2.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
