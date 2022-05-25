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

public val WeUI.Icons.Outlined.VolumeDown: ImageVector
    get() {
        if (`_volume-down` != null) {
            return `_volume-down`!!
        }
        `_volume-down` = Builder(name = "Volume-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 5.414f)
                lineTo(7.914f, 9.5f)
                lineTo(3.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.914f)
                lineTo(12.0f, 18.586f)
                lineTo(12.0f, 5.414f)
                close()
                moveTo(7.5f, 8.5f)
                lineToRelative(3.793f, -3.793f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 5.414f)
                verticalLineToRelative(13.172f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.707f, 0.707f)
                lineTo(7.5f, 15.5f)
                lineTo(3.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(15.328f, 14.828f)
                arcTo(3.983f, 3.983f, 0.0f, false, false, 16.5f, 12.0f)
                arcToRelative(3.983f, 3.983f, 0.0f, false, false, -1.172f, -2.828f)
                lineToRelative(0.849f, -0.849f)
                arcTo(5.184f, 5.184f, 0.0f, false, true, 17.7f, 12.0f)
                arcToRelative(5.184f, 5.184f, 0.0f, false, true, -1.523f, 3.677f)
                lineToRelative(-0.849f, -0.849f)
                close()
            }
        }
        .build()
        return `_volume-down`!!
    }

private var `_volume-down`: ImageVector? = null
