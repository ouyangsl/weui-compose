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

public val WeUI.Icons.Outlined.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.774f, 6.4f)
                lineToRelative(0.812f, 13.648f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.798f, 0.752f)
                horizontalLineToRelative(7.232f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.798f, -0.752f)
                lineTo(17.226f, 6.4f)
                lineTo(6.774f, 6.4f)
                close()
                moveTo(18.429f, 6.4f)
                lineToRelative(-0.817f, 13.719f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.616f, 22.0f)
                lineTo(8.384f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.996f, -1.881f)
                lineTo(5.571f, 6.4f)
                lineTo(3.5f, 6.4f)
                verticalLineToRelative(-0.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.7f)
                horizontalLineToRelative(-2.071f)
                close()
                moveTo(14.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.7f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.7f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(9.5f, 9.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(0.5f, 9.0f)
                lineTo(10.0f, 18.0f)
                lineToRelative(-0.5f, -9.0f)
                close()
                moveTo(13.3f, 9.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-0.5f, 9.0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(0.5f, -9.0f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
