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

public val WeUI.Icons.Outlined.MobileContacts: ImageVector
    get() {
        if (`_mobile-contacts` != null) {
            return `_mobile-contacts`!!
        }
        `_mobile-contacts` = Builder(name = "Mobile-contacts", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(5.2f, 3.2f)
                verticalLineToRelative(17.6f)
                horizontalLineToRelative(13.6f)
                lineTo(18.8f, 3.2f)
                lineTo(5.2f, 3.2f)
                close()
                moveTo(14.91f, 13.306f)
                lineToRelative(1.742f, 0.655f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.347f, 0.508f)
                curveToRelative(0.008f, 0.092f, -0.038f, 0.2f, -0.046f, 0.223f)
                arcToRelative(1.965f, 1.965f, 0.0f, false, true, -2.36f, 1.224f)
                arcToRelative(8.668f, 8.668f, 0.0f, false, true, -4.195f, -2.325f)
                arcTo(8.648f, 8.648f, 0.0f, false, true, 8.07f, 9.402f)
                curveTo(8.062f, 9.348f, 8.0f, 9.125f, 8.0f, 8.886f)
                curveToRelative(0.0f, -0.847f, 0.54f, -1.563f, 1.296f, -1.84f)
                curveToRelative(0.023f, -0.008f, 0.13f, -0.046f, 0.223f, -0.046f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.51f, 0.339f)
                lineToRelative(0.655f, 1.74f)
                curveToRelative(0.03f, 0.085f, 0.015f, 0.13f, -0.031f, 0.216f)
                curveToRelative(-0.155f, 0.269f, -0.525f, 0.947f, -0.733f, 1.355f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, false, 0.015f, 0.678f)
                arcToRelative(7.718f, 7.718f, 0.0f, false, false, 1.173f, 1.547f)
                curveToRelative(0.455f, 0.462f, 0.987f, 0.847f, 1.55f, 1.178f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, 0.678f, 0.015f)
                arcToRelative(69.99f, 69.99f, 0.0f, false, false, 1.357f, -0.731f)
                curveToRelative(0.085f, -0.046f, 0.124f, -0.062f, 0.216f, -0.03f)
                close()
            }
        }
        .build()
        return `_mobile-contacts`!!
    }

private var `_mobile-contacts`: ImageVector? = null
