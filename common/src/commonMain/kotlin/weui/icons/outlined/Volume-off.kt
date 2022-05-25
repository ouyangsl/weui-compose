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

public val WeUI.Icons.Outlined.VolumeOff: ImageVector
    get() {
        if (`_volume-off` != null) {
            return `_volume-off`!!
        }
        `_volume-off` = Builder(name = "Volume-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.849f, 7.151f)
                lineToRelative(2.444f, -2.444f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 5.414f)
                verticalLineToRelative(5.889f)
                lineToRelative(2.864f, 2.863f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 16.5f, 12.0f)
                arcToRelative(3.983f, 3.983f, 0.0f, false, false, -1.172f, -2.828f)
                lineToRelative(0.849f, -0.849f)
                arcTo(5.184f, 5.184f, 0.0f, false, true, 17.7f, 12.0f)
                curveToRelative(0.0f, 1.13f, -0.36f, 2.177f, -0.973f, 3.03f)
                lineToRelative(1.143f, 1.143f)
                arcTo(6.769f, 6.769f, 0.0f, false, false, 19.3f, 12.0f)
                curveToRelative(0.0f, -1.83f, -0.724f, -3.54f, -1.992f, -4.808f)
                lineToRelative(0.849f, -0.849f)
                arcTo(7.975f, 7.975f, 0.0f, false, true, 20.5f, 12.0f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, true, -1.776f, 5.027f)
                lineToRelative(2.701f, 2.7f)
                lineToRelative(-0.849f, 0.85f)
                lineTo(3.85f, 3.848f)
                lineTo(4.697f, 3.0f)
                lineTo(8.85f, 7.151f)
                close()
                moveTo(12.0f, 10.303f)
                verticalLineTo(5.414f)
                lineTo(9.556f, 7.86f)
                lineTo(12.0f, 10.303f)
                close()
                moveTo(7.803f, 9.5f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.914f)
                lineTo(12.0f, 18.586f)
                verticalLineToRelative(-4.889f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.707f, 0.707f)
                lineTo(7.5f, 15.5f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.803f)
                lineToRelative(1.0f, 1.0f)
                close()
            }
        }
        .build()
        return `_volume-off`!!
    }

private var `_volume-off`: ImageVector? = null
