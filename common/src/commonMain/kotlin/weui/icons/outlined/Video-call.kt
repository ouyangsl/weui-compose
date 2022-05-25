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

public val WeUI.Icons.Outlined.VideoCall: ImageVector
    get() {
        if (`_video-call` != null) {
            return `_video-call`!!
        }
        `_video-call` = Builder(name = "Video-call", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.2f, 6.7f)
                verticalLineToRelative(10.6f)
                horizontalLineToRelative(12.6f)
                lineTo(15.8f, 6.7f)
                lineTo(3.2f, 6.7f)
                close()
                moveTo(3.0f, 5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 18.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(19.2f, 13.423f)
                lineToRelative(2.6f, 2.08f)
                lineTo(21.8f, 8.497f)
                lineToRelative(-2.6f, 2.08f)
                verticalLineToRelative(2.846f)
                close()
                moveTo(18.0f, 10.0f)
                lineToRelative(3.375f, -2.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 8.08f)
                verticalLineToRelative(7.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.625f, 0.78f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return `_video-call`!!
    }

private var `_video-call`: ImageVector? = null
