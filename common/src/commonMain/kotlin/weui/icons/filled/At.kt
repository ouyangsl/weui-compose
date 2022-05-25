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

public val WeUI.Icons.Filled.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.465f, 9.145f)
                curveToRelative(-1.242f, 0.0f, -1.98f, 1.02f, -1.98f, 2.73f)
                curveToRelative(0.0f, 1.7f, 0.738f, 2.73f, 1.968f, 2.73f)
                curveToRelative(1.266f, 0.0f, 2.05f, -1.043f, 2.05f, -2.73f)
                curveToRelative(0.0f, -1.688f, -0.784f, -2.73f, -2.038f, -2.73f)
                close()
                moveTo(11.852f, 2.02f)
                curveToRelative(5.554f, 0.0f, 9.457f, 3.492f, 9.457f, 8.707f)
                curveToRelative(0.0f, 3.691f, -1.747f, 6.07f, -4.606f, 6.07f)
                curveToRelative(-1.453f, 0.0f, -2.566f, -0.703f, -2.824f, -1.84f)
                horizontalLineToRelative(-0.164f)
                curveToRelative(-0.48f, 1.172f, -1.465f, 1.805f, -2.824f, 1.805f)
                curveToRelative(-2.438f, 0.0f, -4.067f, -1.98f, -4.067f, -4.957f)
                curveToRelative(0.0f, -2.848f, 1.606f, -4.793f, 3.95f, -4.793f)
                curveToRelative(1.265f, 0.0f, 2.32f, 0.633f, 2.777f, 1.664f)
                horizontalLineToRelative(0.164f)
                lineTo(13.715f, 7.27f)
                horizontalLineToRelative(2.379f)
                verticalLineToRelative(6.27f)
                curveToRelative(0.0f, 0.808f, 0.375f, 1.323f, 1.113f, 1.323f)
                curveToRelative(1.148f, 0.0f, 1.945f, -1.465f, 1.945f, -3.96f)
                curveToRelative(0.0f, -4.266f, -2.941f, -7.02f, -7.382f, -7.02f)
                curveToRelative(-4.512f, 0.0f, -7.676f, 3.258f, -7.676f, 7.969f)
                curveToRelative(0.0f, 4.933f, 3.293f, 7.816f, 8.12f, 7.816f)
                curveToRelative(1.255f, 0.0f, 2.532f, -0.164f, 3.2f, -0.41f)
                verticalLineToRelative(1.875f)
                curveToRelative(-0.914f, 0.27f, -2.11f, 0.433f, -3.375f, 0.433f)
                curveToRelative(-5.93f, 0.0f, -10.101f, -3.714f, -10.101f, -9.773f)
                curveToRelative(0.0f, -5.813f, 4.066f, -9.773f, 9.914f, -9.773f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
