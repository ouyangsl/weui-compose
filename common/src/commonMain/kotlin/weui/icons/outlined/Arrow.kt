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

public val WeUI.Icons.Outlined.Arrow: ImageVector
    get() {
        if (_arrow != null) {
            return _arrow!!
        }
        _arrow = Builder(name = "Arrow", defaultWidth = 12.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 12.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.452f, 6.58f)
                lineToRelative(1.061f, -1.06f)
                lineTo(9.292f, 11.297f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.0f, 1.413f)
                lineTo(3.513f, 18.49f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(5.424f, -5.425f)
                lineToRelative(-5.425f, -5.425f)
                close()
            }
        }
        .build()
        return _arrow!!
    }

private var _arrow: ImageVector? = null
