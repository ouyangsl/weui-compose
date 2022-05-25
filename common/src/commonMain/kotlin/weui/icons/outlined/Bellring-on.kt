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

public val WeUI.Icons.Outlined.BellringOn: ImageVector
    get() {
        if (`_bellring-on` != null) {
            return `_bellring-on`!!
        }
        `_bellring-on` = Builder(name = "Bellring-on", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.973f, 0.332f)
                arcTo(6.003f, 6.003f, 0.0f, false, true, 18.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.47f, 0.54f, 2.939f, 1.62f, 4.408f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.812f, 20.0f)
                lineTo(5.187f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.806f, -1.592f)
                curveTo(5.46f, 16.938f, 6.0f, 15.469f, 6.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, true, 4.027f, -5.668f)
                arcTo(2.014f, 2.014f, 0.0f, false, true, 10.0f, 4.0f)
                close()
                moveTo(12.0f, 18.8f)
                horizontalLineToRelative(6.426f)
                curveTo(17.352f, 17.236f, 16.8f, 15.63f, 16.8f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.06f, -1.309f, -3.87f, -3.222f, -4.535f)
                lineToRelative(-0.956f, -0.332f)
                lineToRelative(0.167f, -0.999f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, -1.578f, 0.0f)
                lineToRelative(0.167f, 0.999f)
                lineToRelative(-0.956f, 0.332f)
                arcTo(4.802f, 4.802f, 0.0f, false, false, 7.2f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.63f, -0.552f, 3.236f, -1.626f, 4.8f)
                lineTo(12.0f, 18.8f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(11.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_bellring-on`!!
    }

private var `_bellring-on`: ImageVector? = null
