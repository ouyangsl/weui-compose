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

public val WeUI.Icons.Filled.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.524f, 4.938f)
                lineToRelative(10.092f, 6.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.704f)
                lineToRelative(-10.092f, 6.21f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 18.21f)
                verticalLineTo(5.79f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.524f, -0.852f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
