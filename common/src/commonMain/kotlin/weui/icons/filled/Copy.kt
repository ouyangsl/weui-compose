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

public val WeUI.Icons.Filled.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.6f, 3.299f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, 0.22f, 0.18f, 0.4f, 0.4f, 0.4f)
                horizontalLineToRelative(4.703f)
                lineTo(13.6f, 3.299f)
                close()
                moveTo(5.996f, 2.0f)
                horizontalLineToRelative(8.002f)
                lineTo(20.0f, 8.0f)
                verticalLineToRelative(13.001f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.996f, 0.999f)
                horizontalLineTo(5.996f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 21.001f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.554f, 0.446f, -1.0f, 0.996f, -1.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
