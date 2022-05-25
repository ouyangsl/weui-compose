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

public val WeUI.Icons.Filled.Done: ImageVector
    get() {
        if (_done != null) {
            return _done!!
        }
        _done = Builder(name = "Done", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.657f, 18.435f)
                lineTo(3.0f, 12.778f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.95f, 4.95f)
                lineTo(20.678f, 5.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-12.02f, 12.021f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.415f, 0.0f)
                close()
            }
        }
        .build()
        return _done!!
    }

private var _done: ImageVector? = null
