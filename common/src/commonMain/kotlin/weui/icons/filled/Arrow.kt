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

public val WeUI.Icons.Filled.Arrow: ImageVector
    get() {
        if (_arrow != null) {
            return _arrow!!
        }
        _arrow = Builder(name = "Arrow", defaultWidth = 12.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.157f, 12.711f)
                lineTo(4.5f, 18.368f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(4.5f, 5.64f)
                lineToRelative(5.657f, 5.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _arrow!!
    }

private var _arrow: ImageVector? = null
