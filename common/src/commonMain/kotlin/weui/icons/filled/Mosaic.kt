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

public val WeUI.Icons.Filled.Mosaic: ImageVector
    get() {
        if (_mosaic != null) {
            return _mosaic!!
        }
        _mosaic = Builder(name = "Mosaic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(10.8f, 15.6f)
                lineTo(10.8f, 18.0f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(6.0f, 15.6f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                lineTo(6.0f, 15.6f)
                close()
                moveTo(15.6f, 15.6f)
                lineTo(15.6f, 18.0f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(15.6f, 6.0f)
                verticalLineToRelative(2.4f)
                lineTo(18.0f, 8.4f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(6.0f, 10.8f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                lineTo(6.0f, 10.8f)
                close()
                moveTo(6.0f, 6.0f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                lineTo(8.4f, 6.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(8.4f, 13.2f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                lineTo(8.4f, 13.2f)
                close()
                moveTo(8.4f, 8.4f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                lineTo(10.8f, 8.4f)
                lineTo(8.4f, 8.4f)
                close()
                moveTo(13.2f, 13.2f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(13.2f, 8.4f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                lineTo(15.6f, 8.4f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(10.8f, 6.0f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                lineTo(13.2f, 6.0f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(10.8f, 10.8f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(15.6f, 10.8f)
                verticalLineToRelative(2.4f)
                lineTo(18.0f, 13.2f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
            }
        }
        .build()
        return _mosaic!!
    }

private var _mosaic: ImageVector? = null
