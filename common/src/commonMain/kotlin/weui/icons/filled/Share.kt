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

public val WeUI.Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.75f, 4.366f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(6.251f)
                curveToRelative(0.55f, 0.0f, 0.999f, 0.446f, 0.999f, 0.996f)
                verticalLineToRelative(13.008f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, -0.996f, 0.996f)
                horizontalLineTo(4.996f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 4.0f, 21.004f)
                verticalLineTo(7.996f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.999f, 7.0f)
                horizontalLineToRelative(6.251f)
                verticalLineTo(4.376f)
                lineToRelative(-1.72f, 1.72f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(2.828f, -2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-1.73f, -1.73f)
                close()
                moveTo(11.25f, 7.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
