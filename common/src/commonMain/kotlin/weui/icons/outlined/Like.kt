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

public val WeUI.Icons.Outlined.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(19.285f, 12.645f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -5.416f, -5.332f)
                curveToRelative(-0.192f, 0.192f, -0.436f, 0.427f, -0.732f, 0.707f)
                lineToRelative(-0.823f, 0.775f)
                lineToRelative(-0.823f, -0.775f)
                curveToRelative(-0.297f, -0.28f, -0.54f, -0.515f, -0.733f, -0.707f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -5.374f, 0.0f)
                curveToRelative(-1.468f, 1.469f, -1.485f, 3.844f, -0.054f, 5.32f)
                lineToRelative(6.984f, 6.984f)
                lineToRelative(6.97f, -6.972f)
                close()
                moveTo(4.535f, 6.465f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.072f, 0.0f)
                curveToRelative(0.182f, 0.182f, 0.418f, 0.41f, 0.707f, 0.682f)
                curveToRelative(0.288f, -0.272f, 0.524f, -0.5f, 0.707f, -0.683f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.125f, 7.017f)
                lineToRelative(-7.125f, 7.126f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(4.48f, 13.48f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.055f, -7.017f)
                close()
            }
        }
        .build()
        return _like!!
    }

private var _like: ImageVector? = null
