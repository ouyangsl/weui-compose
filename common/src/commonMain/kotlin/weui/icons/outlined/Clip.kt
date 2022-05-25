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

public val WeUI.Icons.Outlined.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.2f, 7.2f)
                verticalLineToRelative(9.6f)
                horizontalLineToRelative(9.6f)
                verticalLineTo(7.2f)
                horizontalLineTo(7.2f)
                close()
                moveTo(6.0f, 7.2f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.8f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(7.2f)
                close()
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
