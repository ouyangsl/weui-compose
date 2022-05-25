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

public val WeUI.Icons.Filled.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 10.586f)
                lineToRelative(5.657f, -5.657f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 12.0f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.0f, 13.414f)
                lineToRelative(-5.657f, 5.657f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 12.0f)
                lineTo(4.929f, 6.343f)
                lineTo(6.343f, 4.93f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
