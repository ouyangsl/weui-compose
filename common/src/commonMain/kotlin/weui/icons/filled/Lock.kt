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

public val WeUI.Icons.Filled.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.5f, 9.0f)
                lineTo(7.5f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                lineTo(16.5f, 9.0f)
                lineTo(19.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.999f)
                lineTo(20.0f, 21.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.999f)
                lineTo(4.0f, 10.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 6.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(11.4f, 15.875f)
                lineTo(11.4f, 18.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(-2.125f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.2f, 0.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
