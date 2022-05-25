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

public val WeUI.Icons.Filled.Mike2: ImageVector
    get() {
        if (_mike2 != null) {
            return _mike2!!
        }
        _mike2 = Builder(name = "Mike2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.6f, 16.46f)
                arcToRelative(4.502f, 4.502f, 0.0f, false, false, 3.9f, -4.462f)
                lineTo(16.5f, 10.5f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(1.498f)
                arcToRelative(3.3f, 3.3f, 0.0f, true, true, -6.6f, 0.0f)
                lineTo(8.7f, 10.5f)
                lineTo(7.5f, 10.5f)
                verticalLineToRelative(1.498f)
                arcToRelative(4.502f, 4.502f, 0.0f, false, false, 3.9f, 4.462f)
                lineTo(11.4f, 18.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(-1.54f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 6.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                lineTo(14.0f, 8.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _mike2!!
    }

private var _mike2: ImageVector? = null
