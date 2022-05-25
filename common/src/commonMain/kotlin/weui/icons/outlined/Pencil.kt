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

public val WeUI.Icons.Outlined.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.0f, 3.0f)
                verticalLineToRelative(1.2f)
                lineTo(4.2f, 4.2f)
                verticalLineToRelative(15.6f)
                horizontalLineToRelative(15.6f)
                lineTo(19.8f, 10.0f)
                lineTo(21.0f, 10.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(19.86f, 2.746f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, 0.706f, 0.0f)
                lineToRelative(0.706f, 0.705f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, 0.0f, 0.706f)
                lineToRelative(-9.51f, 9.51f)
                lineToRelative(-2.317f, 1.295f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.406f, -0.41f)
                lineToRelative(1.312f, -2.296f)
                lineToRelative(9.51f, -9.51f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
