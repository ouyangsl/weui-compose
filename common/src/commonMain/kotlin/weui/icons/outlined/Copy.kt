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

public val WeUI.Icons.Outlined.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.4f, 3.2f)
                lineTo(6.2f, 3.2f)
                verticalLineToRelative(17.6f)
                horizontalLineToRelative(12.6f)
                lineTo(18.8f, 9.6f)
                lineTo(14.0f, 9.6f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 12.4f, 8.0f)
                lineTo(12.4f, 3.2f)
                close()
                moveTo(13.6f, 3.299f)
                lineTo(13.6f, 8.0f)
                curveToRelative(0.0f, 0.22f, 0.18f, 0.4f, 0.4f, 0.4f)
                horizontalLineToRelative(4.703f)
                lineTo(13.6f, 3.299f)
                close()
                moveTo(5.996f, 2.0f)
                horizontalLineToRelative(8.002f)
                lineTo(20.0f, 8.0f)
                verticalLineToRelative(13.001f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.996f, 0.999f)
                lineTo(5.996f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 21.001f)
                lineTo(5.0f, 3.0f)
                curveToRelative(0.0f, -0.554f, 0.446f, -1.0f, 0.996f, -1.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
