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

public val WeUI.Icons.Outlined.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 19.8f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3.303f)
                lineTo(12.0f, 4.697f)
                lineTo(3.897f, 12.8f)
                lineTo(7.2f, 12.8f)
                verticalLineToRelative(7.0f)
                lineTo(11.0f, 19.8f)
                lineTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.8f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                lineTo(3.414f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, -1.707f)
                lineToRelative(8.586f, -8.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(8.586f, 8.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.586f, 14.0f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
