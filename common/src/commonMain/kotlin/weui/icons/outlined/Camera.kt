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

public val WeUI.Icons.Outlined.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.358f, 5.2f)
                lineTo(9.642f, 5.2f)
                lineToRelative(-2.0f, 3.0f)
                lineTo(3.2f, 8.2f)
                verticalLineToRelative(10.6f)
                horizontalLineToRelative(17.6f)
                lineTo(20.8f, 8.2f)
                horizontalLineToRelative(-4.442f)
                lineToRelative(-2.0f, -3.0f)
                close()
                moveTo(14.732f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.416f, 0.223f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.852f, -2.777f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.268f, 4.0f)
                horizontalLineToRelative(5.464f)
                close()
                moveTo(12.0f, 15.8f)
                arcToRelative(2.8f, 2.8f, 0.0f, true, false, 0.0f, -5.6f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.0f, 5.6f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
