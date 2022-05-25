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

public val WeUI.Icons.Filled.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.546f, 5.132f)
                lineTo(8.828f, 3.414f)
                lineTo(10.243f, 2.0f)
                lineToRelative(3.889f, 3.89f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.706f)
                lineToRelative(-3.89f, 3.89f)
                lineTo(8.829f, 9.07f)
                lineToRelative(1.946f, -1.946f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 5.468f, 1.632f)
                lineToRelative(1.415f, -1.414f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -7.11f, -2.211f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
