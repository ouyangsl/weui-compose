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

public val WeUI.Icons.Outlined.Mike: ImageVector
    get() {
        if (_mike != null) {
            return _mike!!
        }
        _mike = Builder(name = "Mike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.7f, 6.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.3f, 3.3f, 0.0f, true, false, 6.6f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -6.6f, 0.0f)
                close()
                moveTo(12.6f, 19.976f)
                lineTo(12.6f, 23.0f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-3.024f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 4.5f, 12.5f)
                lineTo(4.5f, 11.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.5f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 12.6f, 0.0f)
                lineTo(18.3f, 11.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -6.9f, 7.476f)
                close()
                moveTo(7.5f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _mike!!
    }

private var _mike: ImageVector? = null
