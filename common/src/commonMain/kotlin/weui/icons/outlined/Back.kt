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

public val WeUI.Icons.Outlined.Back: ImageVector
    get() {
        if (_back != null) {
            return _back!!
        }
        _back = Builder(name = "Back", defaultWidth = 12.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 19.438f)
                lineTo(8.955f, 20.5f)
                lineToRelative(-7.666f, -7.79f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, true, 0.0f, -1.42f)
                lineTo(8.955f, 3.5f)
                lineTo(10.0f, 4.563f)
                lineTo(2.682f, 12.0f)
                lineTo(10.0f, 19.438f)
                close()
            }
        }
        .build()
        return _back!!
    }

private var _back: ImageVector? = null
