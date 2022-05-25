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

public val WeUI.Icons.Filled.VolumeDown: ImageVector
    get() {
        if (`_volume-down` != null) {
            return `_volume-down`!!
        }
        `_volume-down` = Builder(name = "Volume-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.3f, 4.7f)
                curveToRelative(0.4f, -0.4f, 1.0f, -0.4f, 1.4f, 0.0f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.7f)
                verticalLineToRelative(13.2f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.3f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                lineToRelative(-3.8f, -3.8f)
                lineTo(3.0f, 15.5f)
                curveToRelative(-0.6f, 0.0f, -1.0f, -0.4f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.5f)
                lineToRelative(3.8f, -3.8f)
                close()
                moveTo(16.2f, 15.9f)
                lineToRelative(-1.1f, -1.1f)
                lineToRelative(0.1f, -0.1f)
                curveToRelative(0.7f, -0.7f, 1.1f, -1.7f, 1.1f, -2.7f)
                curveToRelative(0.0f, -1.0f, -0.4f, -2.0f, -1.1f, -2.7f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(1.1f, -1.1f)
                lineToRelative(0.1f, 0.1f)
                curveToRelative(1.0f, 1.0f, 1.6f, 2.4f, 1.6f, 3.8f)
                reflectiveCurveToRelative(-0.6f, 2.8f, -1.6f, 3.8f)
                lineToRelative(-0.1f, 0.1f)
                close()
            }
        }
        .build()
        return `_volume-down`!!
    }

private var `_volume-down`: ImageVector? = null
