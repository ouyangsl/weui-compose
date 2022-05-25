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

public val WeUI.Icons.Outlined.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.8f, 8.2f)
                lineTo(16.0f, 8.2f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(3.001f)
                curveToRelative(0.55f, 0.0f, 0.999f, 0.446f, 0.999f, 0.996f)
                verticalLineToRelative(13.008f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, -0.996f, 0.996f)
                lineTo(4.996f, 22.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 4.0f, 21.004f)
                lineTo(4.0f, 7.996f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.999f, 7.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(1.2f)
                lineTo(5.2f, 8.2f)
                verticalLineToRelative(12.6f)
                horizontalLineToRelative(13.6f)
                lineTo(18.8f, 8.2f)
                close()
                moveTo(12.6f, 12.617f)
                lineToRelative(2.087f, -2.087f)
                lineToRelative(0.849f, 0.849f)
                lineToRelative(-2.829f, 2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(8.464f, 11.38f)
                lineToRelative(0.849f, -0.849f)
                lineToRelative(2.087f, 2.087f)
                lineTo(11.4f, 2.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(10.617f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
