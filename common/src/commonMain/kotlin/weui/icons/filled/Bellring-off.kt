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

public val WeUI.Icons.Filled.BellringOff: ImageVector
    get() {
        if (`_bellring-off` != null) {
            return `_bellring-off`!!
        }
        `_bellring-off` = Builder(name = "Bellring-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.453f, 16.332f)
                lineToRelative(3.639f, 3.639f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(4.06f, 4.061f)
                lineTo(5.12f, 3.0f)
                lineToRelative(2.697f, 2.697f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.21f, -1.365f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.945f, 0.0f)
                arcTo(6.003f, 6.003f, 0.0f, false, true, 18.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.777f, 0.151f, 1.555f, 0.453f, 2.332f)
                close()
                moveTo(17.88f, 20.0f)
                horizontalLineTo(5.187f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.806f, -1.592f)
                curveTo(5.46f, 16.938f, 6.0f, 15.469f, 6.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.572f, 0.08f, -1.125f, 0.23f, -1.65f)
                lineTo(17.878f, 20.0f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_bellring-off`!!
    }

private var `_bellring-off`: ImageVector? = null
