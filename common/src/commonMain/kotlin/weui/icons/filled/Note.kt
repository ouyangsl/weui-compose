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

public val WeUI.Icons.Filled.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.5f, 18.946f)
                curveToRelative(-0.16f, 0.041f, -0.327f, 0.063f, -0.5f, 0.063f)
                lineTo(5.5f, 19.009f)
                lineTo(5.5f, 20.5f)
                lineTo(18.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.054f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(7.0f, 3.5f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-14.0f)
                lineTo(7.0f, 3.5f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null
