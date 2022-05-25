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

public val WeUI.Icons.Filled.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.418f, 1.0f, 0.933f)
                verticalLineToRelative(12.134f)
                curveToRelative(0.0f, 0.515f, -0.448f, 0.933f, -1.0f, 0.933f)
                lineTo(7.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.418f, -1.0f, -0.933f)
                lineTo(6.0f, 5.933f)
                curveTo(6.0f, 5.418f, 6.448f, 5.0f, 7.0f, 5.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.418f, 1.0f, 0.933f)
                verticalLineToRelative(12.134f)
                curveToRelative(0.0f, 0.515f, -0.448f, 0.933f, -1.0f, 0.933f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.418f, -1.0f, -0.933f)
                lineTo(14.0f, 5.933f)
                curveToRelative(0.0f, -0.515f, 0.448f, -0.933f, 1.0f, -0.933f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
