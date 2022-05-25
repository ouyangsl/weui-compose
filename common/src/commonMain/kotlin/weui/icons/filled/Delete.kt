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

public val WeUI.Icons.Filled.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.412f, 6.5f)
                lineToRelative(-0.801f, 13.617f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.614f, 22.0f)
                lineTo(8.386f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.997f, -1.883f)
                lineTo(5.59f, 6.5f)
                lineTo(3.5f, 6.5f)
                verticalLineToRelative(-1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.088f)
                close()
                moveTo(10.0f, 2.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(9.0f, 9.0f)
                lineToRelative(0.5f, 9.0f)
                lineTo(11.0f, 18.0f)
                lineToRelative(-0.4f, -9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(13.5f, 9.0f)
                lineToRelative(-0.5f, 9.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.5f, -9.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
