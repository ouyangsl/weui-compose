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

public val WeUI.Icons.Filled.TransferText: ImageVector
    get() {
        if (`_transfer-text` != null) {
            return `_transfer-text`!!
        }
        `_transfer-text` = Builder(name = "Transfer-text", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.198f, 8.848f)
                verticalLineToRelative(1.144f)
                lineTo(8.87f, 9.992f)
                curveToRelative(0.462f, 1.595f, 1.287f, 2.992f, 2.475f, 4.202f)
                curveToRelative(-1.144f, 0.968f, -2.596f, 1.672f, -4.345f, 2.123f)
                lineToRelative(0.616f, 1.012f)
                curveToRelative(1.793f, -0.506f, 3.311f, -1.309f, 4.543f, -2.398f)
                curveToRelative(1.166f, 0.968f, 2.629f, 1.782f, 4.389f, 2.442f)
                lineToRelative(0.638f, -0.979f)
                curveToRelative(-1.672f, -0.616f, -3.08f, -1.364f, -4.213f, -2.266f)
                curveToRelative(1.012f, -1.111f, 1.782f, -2.486f, 2.31f, -4.136f)
                horizontalLineToRelative(1.661f)
                lineTo(16.944f, 8.848f)
                horizontalLineToRelative(-4.158f)
                arcTo(9.752f, 9.752f, 0.0f, false, false, 11.697f, 7.0f)
                lineToRelative(-1.155f, 0.418f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, true, 1.012f, 1.43f)
                lineTo(7.198f, 8.848f)
                close()
                moveTo(9.97f, 9.992f)
                horizontalLineToRelative(4.125f)
                curveToRelative(-0.429f, 1.331f, -1.078f, 2.475f, -1.936f, 3.421f)
                arcTo(8.73f, 8.73f, 0.0f, false, true, 9.97f, 9.992f)
                close()
            }
        }
        .build()
        return `_transfer-text`!!
    }

private var `_transfer-text`: ImageVector? = null
