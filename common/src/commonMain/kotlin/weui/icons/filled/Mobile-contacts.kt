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

public val WeUI.Icons.Filled.MobileContacts: ImageVector
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
                moveTo(14.91f, 13.806f)
                curveToRelative(-0.093f, -0.03f, -0.132f, -0.015f, -0.217f, 0.03f)
                curveToRelative(-0.277f, 0.155f, -0.956f, 0.524f, -1.357f, 0.732f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, true, -0.331f, 0.085f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, true, -0.347f, -0.1f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, true, -1.55f, -1.178f)
                arcToRelative(7.718f, 7.718f, 0.0f, false, true, -1.172f, -1.548f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, true, -0.016f, -0.677f)
                curveToRelative(0.208f, -0.408f, 0.578f, -1.086f, 0.733f, -1.355f)
                curveToRelative(0.046f, -0.085f, 0.061f, -0.131f, 0.03f, -0.216f)
                lineToRelative(-0.655f, -1.74f)
                arcTo(0.561f, 0.561f, 0.0f, false, false, 9.52f, 7.5f)
                curveToRelative(-0.092f, 0.0f, -0.2f, 0.038f, -0.223f, 0.046f)
                arcTo(1.962f, 1.962f, 0.0f, false, false, 8.0f, 9.386f)
                curveToRelative(0.0f, 0.24f, 0.062f, 0.462f, 0.07f, 0.516f)
                arcToRelative(8.648f, 8.648f, 0.0f, false, false, 2.328f, 4.189f)
                arcToRelative(8.668f, 8.668f, 0.0f, false, false, 4.195f, 2.325f)
                arcToRelative(1.965f, 1.965f, 0.0f, false, false, 2.36f, -1.224f)
                curveToRelative(0.008f, -0.023f, 0.054f, -0.13f, 0.046f, -0.223f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.347f, -0.508f)
                lineToRelative(-1.743f, -0.655f)
                close()
            }
        }
        .build()
        return `_mobile-contacts`!!
    }

private var `_mobile-contacts`: ImageVector? = null
