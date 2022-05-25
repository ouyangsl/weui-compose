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

public val WeUI.Icons.Filled.DeleteOn: ImageVector
    get() {
        if (`_delete-on` != null) {
            return `_delete-on`!!
        }
        `_delete-on` = Builder(name = "Delete-on", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.774f, 5.0f)
                lineTo(3.758f, 3.94f)
                lineToRelative(0.174f, -0.986f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.58f, -0.405f)
                lineTo(18.411f, 5.0f)
                horizontalLineToRelative(0.088f)
                horizontalLineToRelative(-0.087f)
                lineToRelative(1.855f, 0.327f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.406f, 0.58f)
                lineToRelative(-0.174f, 0.984f)
                lineToRelative(-2.09f, -0.368f)
                lineToRelative(-0.8f, 13.594f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.615f, 22.0f)
                lineTo(8.386f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.997f, -1.883f)
                lineTo(5.59f, 6.5f)
                horizontalLineToRelative(12.69f)
                lineTo(9.774f, 5.0f)
                lineTo(5.5f, 5.0f)
                horizontalLineToRelative(4.274f)
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
                moveTo(10.854f, 1.129f)
                lineToRelative(3.94f, 0.694f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.405f, 0.58f)
                lineToRelative(-0.174f, 0.984f)
                lineToRelative(-4.924f, -0.868f)
                lineToRelative(0.174f, -0.985f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.58f, -0.405f)
                close()
            }
        }
        .build()
        return `_delete-on`!!
    }

private var `_delete-on`: ImageVector? = null
