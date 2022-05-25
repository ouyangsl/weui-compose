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

public val WeUI.Icons.Filled.BellringOn: ImageVector
    get() {
        if (`_bellring-on` != null) {
            return `_bellring-on`!!
        }
        `_bellring-on` = Builder(name = "Bellring-on", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.0f, 20.0f)
                horizontalLineTo(5.187f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.806f, -1.592f)
                curveTo(5.46f, 16.938f, 6.0f, 15.469f, 6.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, true, 4.027f, -5.668f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.945f, 0.0f)
                arcTo(6.003f, 6.003f, 0.0f, false, true, 18.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.47f, 0.54f, 2.939f, 1.62f, 4.408f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.812f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_bellring-on`!!
    }

private var `_bellring-on`: ImageVector? = null
