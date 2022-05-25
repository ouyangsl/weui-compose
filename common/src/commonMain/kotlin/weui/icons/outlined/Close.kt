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

public val WeUI.Icons.Outlined.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 10.943f)
                lineTo(5.807f, 4.75f)
                lineTo(4.75f, 5.807f)
                lineTo(10.943f, 12.0f)
                lineTo(4.75f, 18.193f)
                lineToRelative(1.057f, 1.057f)
                lineTo(12.0f, 13.057f)
                lineToRelative(6.193f, 6.193f)
                lineToRelative(1.057f, -1.057f)
                lineTo(13.057f, 12.0f)
                lineToRelative(6.193f, -6.193f)
                lineTo(18.193f, 4.75f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
