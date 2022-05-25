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

public val WeUI.Icons.Outlined.BellringOff: ImageVector
    get() {
        if (`_bellring-off` != null) {
            return `_bellring-off`!!
        }
        `_bellring-off` = Builder(name = "Bellring-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.805f, 17.108f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(-0.849f, 0.848f)
                lineTo(4.85f, 4.85f)
                lineTo(5.697f, 4.0f)
                lineTo(7.61f, 5.912f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, true, 2.418f, -1.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.945f, 0.0f)
                arcTo(6.003f, 6.003f, 0.0f, false, true, 18.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.036f, 0.268f, 2.072f, 0.805f, 3.108f)
                close()
                moveTo(8.457f, 6.76f)
                lineToRelative(8.444f, 8.443f)
                arcTo(7.253f, 7.253f, 0.0f, false, true, 16.8f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.06f, -1.309f, -3.87f, -3.222f, -4.535f)
                lineToRelative(-0.956f, -0.332f)
                lineToRelative(0.167f, -0.999f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, -1.578f, 0.0f)
                lineToRelative(0.167f, 0.999f)
                lineToRelative(-0.956f, 0.332f)
                arcTo(4.792f, 4.792f, 0.0f, false, false, 8.457f, 6.76f)
                close()
                moveTo(18.303f, 20.0f)
                horizontalLineTo(5.187f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.806f, -1.592f)
                curveTo(5.46f, 16.938f, 6.0f, 15.469f, 6.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.69f, 0.117f, -1.354f, 0.331f, -1.972f)
                lineToRelative(0.973f, 0.974f)
                arcTo(4.808f, 4.808f, 0.0f, false, false, 7.2f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.63f, -0.552f, 3.236f, -1.626f, 4.8f)
                horizontalLineToRelative(11.529f)
                lineToRelative(1.2f, 1.2f)
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
