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

public val WeUI.Icons.Outlined.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.2f, 3.2f)
                verticalLineToRelative(14.61f)
                lineTo(18.0f, 17.81f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.8f, -0.8f)
                lineTo(18.8f, 4.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.8f, -0.8f)
                lineTo(8.2f, 3.2f)
                close()
                moveTo(7.0f, 3.2f)
                lineTo(5.2f, 3.2f)
                verticalLineToRelative(14.61f)
                lineTo(7.0f, 17.81f)
                lineTo(7.0f, 3.2f)
                close()
                moveTo(18.8f, 18.843f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, -0.8f, 0.166f)
                lineTo(5.2f, 19.009f)
                lineTo(5.2f, 20.8f)
                lineTo(18.0f, 20.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.8f, -0.8f)
                verticalLineToRelative(-1.157f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 2.0f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null
