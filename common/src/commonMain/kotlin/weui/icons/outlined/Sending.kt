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

public val WeUI.Icons.Outlined.Sending: ImageVector
    get() {
        if (_sending != null) {
            return _sending!!
        }
        _sending = Builder(name = "Sending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.871f, 11.25f)
                lineTo(13.0f, 11.25f)
                verticalLineToRelative(1.5f)
                lineTo(7.871f, 12.75f)
                lineToRelative(2.432f, 2.432f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-3.182f, -3.181f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                lineToRelative(3.889f, -3.889f)
                lineToRelative(1.06f, 1.061f)
                lineToRelative(-2.432f, 2.432f)
                close()
                moveTo(14.5f, 11.25f)
                lineTo(16.0f, 11.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(17.5f, 11.25f)
                lineTo(19.0f, 11.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _sending!!
    }

private var _sending: ImageVector? = null
