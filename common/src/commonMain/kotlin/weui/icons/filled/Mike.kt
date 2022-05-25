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

public val WeUI.Icons.Filled.Mike: ImageVector
    get() {
        if (_mike != null) {
            return _mike!!
        }
        _mike = Builder(name = "Mike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.75f, 18.96f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.04f)
                arcTo(7.001f, 7.001f, 0.0f, false, true, 5.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, true, -6.25f, 6.96f)
                close()
                moveTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _mike!!
    }

private var _mike: ImageVector? = null
