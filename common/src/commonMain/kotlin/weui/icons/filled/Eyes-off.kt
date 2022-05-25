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

public val WeUI.Icons.Filled.EyesOff: ImageVector
    get() {
        if (`_eyes-off` != null) {
            return `_eyes-off`!!
        }
        `_eyes-off` = Builder(name = "Eyes-off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.922f, 16.8f)
                lineToRelative(3.17f, 3.17f)
                lineToRelative(-1.06f, 1.061f)
                lineTo(4.06f, 4.061f)
                lineTo(5.12f, 3.0f)
                lineToRelative(2.74f, 2.738f)
                arcTo(11.935f, 11.935f, 0.0f, false, true, 12.0f, 5.0f)
                curveToRelative(4.808f, 0.0f, 8.972f, 2.848f, 11.0f, 7.0f)
                arcToRelative(12.664f, 12.664f, 0.0f, false, true, -4.078f, 4.8f)
                close()
                moveTo(10.824f, 8.703f)
                lineToRelative(4.473f, 4.473f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.474f, -4.474f)
                close()
                moveTo(16.141f, 18.263f)
                arcTo(11.935f, 11.935f, 0.0f, false, true, 12.0f, 19.0f)
                curveToRelative(-4.808f, 0.0f, -8.972f, -2.848f, -11.0f, -7.0f)
                arcToRelative(12.664f, 12.664f, 0.0f, false, true, 4.078f, -4.8f)
                lineToRelative(3.625f, 3.624f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.474f, 4.474f)
                lineToRelative(2.964f, 2.964f)
                close()
            }
        }
        .build()
        return `_eyes-off`!!
    }

private var `_eyes-off`: ImageVector? = null
