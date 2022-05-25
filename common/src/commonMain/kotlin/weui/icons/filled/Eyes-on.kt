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

public val WeUI.Icons.Filled.EyesOn: ImageVector
    get() {
        if (`_eyes-on` != null) {
            return `_eyes-on`!!
        }
        `_eyes-on` = Builder(name = "Eyes-on", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.0f, 12.0f)
                curveToRelative(2.028f, -4.152f, 6.192f, -7.0f, 11.0f, -7.0f)
                reflectiveCurveToRelative(8.972f, 2.848f, 11.0f, 7.0f)
                curveToRelative(-2.028f, 4.152f, -6.192f, 7.0f, -11.0f, 7.0f)
                reflectiveCurveToRelative(-8.972f, -2.848f, -11.0f, -7.0f)
                close()
                moveTo(12.0f, 15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_eyes-on`!!
    }

private var `_eyes-on`: ImageVector? = null
