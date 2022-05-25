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

public val WeUI.Icons.Filled.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.657f, 12.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.122f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.828f, -2.828f)
                lineToRelative(-4.243f, 4.243f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.828f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.657f)
                lineToRelative(4.242f, -4.242f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.657f, 5.657f)
                lineTo(17.657f, 12.0f)
                close()
                moveTo(6.343f, 12.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.122f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.828f, 2.828f)
                lineToRelative(4.243f, -4.243f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.657f)
                lineTo(9.88f, 19.778f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.657f, -5.657f)
                lineTo(6.343f, 12.0f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
