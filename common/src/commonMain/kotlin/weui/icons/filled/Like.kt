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

public val WeUI.Icons.Filled.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.536f, 5.778f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.07f, 0.0f)
                curveToRelative(0.183f, 0.183f, 0.42f, 0.41f, 0.708f, 0.682f)
                curveToRelative(0.288f, -0.272f, 0.524f, -0.499f, 0.707f, -0.682f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.125f, 7.016f)
                lineTo(13.02f, 19.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(4.48f, 12.795f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.055f, -7.017f)
                close()
            }
        }
        .build()
        return _like!!
    }

private var _like: ImageVector? = null
