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

public val WeUI.Icons.Outlined.EyesOff: ImageVector
    get() {
        if (`_eyes-off` != null) {
            return `_eyes-off`!!
        }
        `_eyes-off` = Builder(name = "Eyes-off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.67f, 16.973f)
                lineToRelative(2.755f, 2.755f)
                lineToRelative(-0.849f, 0.848f)
                lineTo(3.85f, 3.85f)
                lineTo(4.697f, 3.0f)
                lineToRelative(2.855f, 2.855f)
                curveTo(8.932f, 5.303f, 10.432f, 5.0f, 12.0f, 5.0f)
                curveToRelative(4.808f, 0.0f, 8.972f, 2.848f, 11.0f, 7.0f)
                arcToRelative(12.65f, 12.65f, 0.0f, false, true, -4.33f, 4.973f)
                close()
                moveTo(8.486f, 6.79f)
                lineToRelative(1.664f, 1.664f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.398f, 5.398f)
                lineToRelative(2.255f, 2.255f)
                curveToRelative(1.574f, -1.0f, 2.904f, -2.403f, 3.845f, -4.106f)
                curveTo(19.686f, 8.45f, 16.034f, 6.2f, 12.0f, 6.2f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, false, -3.514f, 0.59f)
                close()
                moveTo(14.638f, 12.942f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -3.579f, -3.579f)
                lineToRelative(3.579f, 3.579f)
                close()
                moveTo(16.448f, 18.146f)
                curveToRelative(-1.38f, 0.552f, -2.88f, 0.855f, -4.448f, 0.855f)
                curveToRelative(-4.808f, 0.0f, -8.972f, -2.848f, -11.0f, -7.0f)
                arcToRelative(12.65f, 12.65f, 0.0f, false, true, 4.33f, -4.973f)
                lineToRelative(0.867f, 0.867f)
                arcTo(11.363f, 11.363f, 0.0f, false, false, 2.352f, 12.0f)
                curveToRelative(1.962f, 3.55f, 5.614f, 5.8f, 9.648f, 5.8f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, false, 3.514f, -0.59f)
                lineToRelative(0.934f, 0.935f)
                close()
                moveTo(8.453f, 10.15f)
                lineToRelative(0.909f, 0.91f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 3.579f, 3.579f)
                lineToRelative(0.91f, 0.908f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.398f, -5.398f)
                close()
            }
        }
        .build()
        return `_eyes-off`!!
    }

private var `_eyes-off`: ImageVector? = null
