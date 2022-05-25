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

public val WeUI.Icons.Outlined.Transfer2: ImageVector
    get() {
        if (_transfer2 != null) {
            return _transfer2!!
        }
        _transfer2 = Builder(name = "Transfer2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 20.8f)
                arcToRelative(8.8f, 8.8f, 0.0f, true, false, 0.0f, -17.6f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, 0.0f, 17.6f)
                close()
                moveTo(9.79f, 9.924f)
                lineTo(17.0f, 9.924f)
                verticalLineToRelative(1.2f)
                lineTo(7.546f, 11.124f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.321f, -0.884f)
                lineToRelative(3.161f, -2.647f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.591f, 0.527f)
                lineTo(9.79f, 9.924f)
                close()
                moveTo(14.256f, 14.08f)
                horizontalLineToRelative(-7.21f)
                verticalLineToRelative(-1.2f)
                lineTo(16.5f, 12.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.321f, 0.883f)
                lineTo(13.66f, 16.41f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.591f, -0.526f)
                lineToRelative(1.187f, -1.804f)
                close()
            }
        }
        .build()
        return _transfer2!!
    }

private var _transfer2: ImageVector? = null
