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

public val WeUI.Icons.Filled.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 18.5f)
                lineToRelative(-4.672f, 2.456f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.451f, -1.054f)
                lineToRelative(0.892f, -5.202f)
                lineToRelative(-3.78f, -3.685f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.555f, -1.706f)
                lineToRelative(5.223f, -0.759f)
                lineToRelative(2.336f, -4.733f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.794f, 0.0f)
                lineToRelative(2.336f, 4.733f)
                lineToRelative(5.223f, 0.76f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.555f, 1.705f)
                lineTo(17.23f, 14.7f)
                lineToRelative(0.892f, 5.202f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.45f, 1.054f)
                lineTo(12.0f, 18.5f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
