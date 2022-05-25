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

public val WeUI.Icons.Outlined.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.25f, 11.25f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(7.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.75f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.75f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.75f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
