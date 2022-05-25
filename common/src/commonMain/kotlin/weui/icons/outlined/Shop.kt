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

public val WeUI.Icons.Outlined.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 7.0f)
                lineTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.007f)
                verticalLineToRelative(12.001f)
                curveToRelative(0.0f, 1.1f, -0.895f, 1.992f, -1.994f, 1.992f)
                lineTo(5.994f, 22.0f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 4.0f, 20.008f)
                verticalLineToRelative(-12.0f)
                curveTo(4.0f, 7.45f, 4.445f, 7.0f, 5.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.2f, 7.0f)
                horizontalLineToRelative(5.6f)
                lineTo(14.8f, 6.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -5.6f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 8.2f)
                lineTo(5.2f, 8.2f)
                verticalLineToRelative(11.808f)
                curveToRelative(0.0f, 0.436f, 0.356f, 0.792f, 0.794f, 0.792f)
                horizontalLineToRelative(12.012f)
                arcToRelative(0.794f, 0.794f, 0.0f, false, false, 0.794f, -0.792f)
                lineTo(18.8f, 8.2f)
                lineTo(16.0f, 8.2f)
                lineTo(16.0f, 11.0f)
                horizontalLineToRelative(-1.2f)
                lineTo(14.8f, 8.2f)
                lineTo(9.2f, 8.2f)
                lineTo(9.2f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 8.2f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
