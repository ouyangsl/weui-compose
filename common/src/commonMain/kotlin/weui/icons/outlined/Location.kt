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

public val WeUI.Icons.Outlined.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.065f, 21.243f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.006f, -0.005f)
                lineToRelative(0.006f, 0.005f)
                close()
                moveTo(12.247f, 20.969f)
                arcToRelative(29.224f, 29.224f, 0.0f, false, false, 3.183f, -3.392f)
                curveToRelative(2.04f, -2.563f, 3.281f, -5.09f, 3.365f, -7.337f)
                arcToRelative(6.8f, 6.8f, 0.0f, true, false, -13.591f, 0.0f)
                curveToRelative(0.085f, 2.247f, 1.327f, 4.774f, 3.366f, 7.337f)
                arcToRelative(29.224f, 29.224f, 0.0f, false, false, 3.183f, 3.392f)
                curveToRelative(0.11f, 0.1f, 0.194f, 0.172f, 0.247f, 0.218f)
                curveToRelative(0.053f, -0.046f, 0.137f, -0.119f, 0.247f, -0.218f)
                close()
                moveTo(11.262f, 22.134f)
                reflectiveCurveTo(4.0f, 16.018f, 4.0f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 6.018f, -7.262f, 12.134f, -7.262f, 12.134f)
                curveToRelative(-0.404f, 0.372f, -1.069f, 0.368f, -1.476f, 0.0f)
                close()
                moveTo(12.0f, 12.8f)
                arcToRelative(2.8f, 2.8f, 0.0f, true, false, 0.0f, -5.6f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.0f, 5.6f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
