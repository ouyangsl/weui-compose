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

public val WeUI.Icons.Outlined.Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = Builder(name = "Email", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.2f, 5.2f)
                lineToRelative(7.56f, 5.67f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.48f, 0.0f)
                lineTo(19.8f, 5.2f)
                lineTo(4.2f, 5.2f)
                close()
                moveTo(20.8f, 5.95f)
                lineToRelative(-7.84f, 5.88f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.92f, 0.0f)
                lineTo(3.2f, 5.95f)
                lineTo(3.2f, 18.8f)
                horizontalLineToRelative(17.6f)
                lineTo(20.8f, 5.95f)
                close()
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
            }
        }
        .build()
        return _email!!
    }

private var _email: ImageVector? = null
