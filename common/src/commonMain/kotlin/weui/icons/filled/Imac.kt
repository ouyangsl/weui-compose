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

public val WeUI.Icons.Filled.Imac: ImageVector
    get() {
        if (_imac != null) {
            return _imac!!
        }
        _imac = Builder(name = "Imac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.155f, 19.0f)
                lineToRelative(0.622f, 1.84f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.474f, 0.66f)
                lineTo(8.697f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.474f, -0.66f)
                lineTo(8.845f, 19.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-5.845f)
                close()
                moveTo(20.5f, 16.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(17.0f)
                lineTo(20.5f, 16.0f)
                close()
            }
        }
        .build()
        return _imac!!
    }

private var _imac: ImageVector? = null
