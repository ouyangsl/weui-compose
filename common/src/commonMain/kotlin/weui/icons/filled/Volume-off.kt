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

public val WeUI.Icons.Filled.VolumeOff: ImageVector
    get() {
        if (`_volume-off` != null) {
            return `_volume-off`!!
        }
        `_volume-off` = Builder(name = "Volume-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.06f, 6.94f)
                lineTo(11.3f, 4.7f)
                curveToRelative(0.4f, -0.4f, 1.0f, -0.4f, 1.4f, 0.0f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.7f)
                verticalLineToRelative(5.479f)
                lineToRelative(2.879f, 2.878f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 16.3f, 12.0f)
                curveToRelative(0.0f, -1.0f, -0.4f, -2.0f, -1.1f, -2.7f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(1.1f, -1.1f)
                lineToRelative(0.1f, 0.1f)
                curveToRelative(1.0f, 1.0f, 1.6f, 2.4f, 1.6f, 3.8f)
                arcToRelative(5.399f, 5.399f, 0.0f, false, true, -0.876f, 2.902f)
                lineToRelative(0.918f, 0.919f)
                curveTo(18.73f, 14.703f, 19.1f, 13.413f, 19.1f, 12.0f)
                curveToRelative(0.0f, -1.8f, -0.7f, -3.4f, -1.9f, -4.7f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(1.1f, -1.1f)
                lineToRelative(0.1f, 0.1f)
                curveToRelative(1.5f, 1.5f, 2.4f, 3.6f, 2.4f, 5.8f)
                curveToRelative(0.0f, 1.82f, -0.548f, 3.503f, -1.643f, 4.936f)
                lineToRelative(3.035f, 3.035f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(4.06f, 4.061f)
                lineTo(5.12f, 3.0f)
                lineToRelative(3.94f, 3.94f)
                close()
                moveTo(13.0f, 15.12f)
                verticalLineToRelative(3.48f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.3f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                lineToRelative(-3.8f, -3.8f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.6f, 0.0f, -1.0f, -0.4f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.379f)
                lineTo(13.0f, 15.121f)
                close()
            }
        }
        .build()
        return `_volume-off`!!
    }

private var `_volume-off`: ImageVector? = null
