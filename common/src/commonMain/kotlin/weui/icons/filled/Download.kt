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

public val WeUI.Icons.Filled.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.25f, 12.04f)
                lineToRelative(-1.72f, -1.72f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(2.828f, 2.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -0.001f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(-1.06f, -1.061f)
                lineToRelative(-1.73f, 1.73f)
                lineTo(12.75f, 7.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.04f)
                close()
                moveTo(11.25f, 7.0f)
                lineTo(11.25f, 2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.251f)
                curveToRelative(0.55f, 0.0f, 0.999f, 0.446f, 0.999f, 0.996f)
                verticalLineToRelative(13.008f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, -0.996f, 0.996f)
                lineTo(4.996f, 22.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 4.0f, 21.004f)
                lineTo(4.0f, 7.996f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.999f, 7.0f)
                horizontalLineToRelative(6.251f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
