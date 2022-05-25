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

public val WeUI.Icons.Filled.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.5f, 7.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.007f)
                verticalLineToRelative(12.001f)
                curveToRelative(0.0f, 1.1f, -0.895f, 1.992f, -1.994f, 1.992f)
                horizontalLineTo(5.994f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 4.0f, 20.008f)
                verticalLineToRelative(-12.0f)
                curveTo(4.0f, 7.45f, 4.445f, 7.0f, 5.0f, 7.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.5f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(15.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
