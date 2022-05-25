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

public val WeUI.Icons.Outlined.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.657f, 12.0f)
                lineToRelative(-0.849f, -0.849f)
                lineToRelative(2.122f, -2.12f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -3.96f, -3.96f)
                lineToRelative(-3.89f, 3.888f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.0f, 3.96f)
                lineToRelative(-0.848f, 0.849f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.657f)
                lineToRelative(3.89f, -3.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.656f, 5.658f)
                lineTo(17.657f, 12.0f)
                close()
                moveTo(6.343f, 12.0f)
                lineToRelative(0.849f, 0.849f)
                lineToRelative(-2.122f, 2.12f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 3.96f, 3.96f)
                lineToRelative(3.89f, -3.888f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.0f, -3.96f)
                lineToRelative(0.848f, -0.849f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.657f)
                lineToRelative(-3.89f, 3.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.656f, -5.658f)
                lineTo(6.343f, 12.0f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
