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

public val WeUI.Icons.Filled.Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = Builder(name = "Email", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(19.031f, 5.914f)
                lineToRelative(-6.875f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.312f, 0.0f)
                lineToRelative(-6.875f, -5.5f)
                lineToRelative(-0.938f, 1.172f)
                lineToRelative(6.876f, 5.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 2.186f, 0.0f)
                lineToRelative(6.876f, -5.5f)
                lineToRelative(-0.938f, -1.172f)
                close()
            }
        }
        .build()
        return _email!!
    }

private var _email: ImageVector? = null
