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

public val WeUI.Icons.Outlined.TransferText: ImageVector
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
                moveTo(4.2f, 4.2f)
                verticalLineToRelative(15.6f)
                horizontalLineToRelative(15.6f)
                lineTo(19.8f, 4.2f)
                lineTo(4.2f, 4.2f)
                close()
                moveTo(7.57f, 8.86f)
                horizontalLineToRelative(3.96f)
                curveToRelative(-0.25f, -0.46f, -0.56f, -0.89f, -0.92f, -1.3f)
                lineToRelative(1.05f, -0.38f)
                curveToRelative(0.36f, 0.47f, 0.69f, 1.03f, 0.99f, 1.68f)
                horizontalLineToRelative(3.78f)
                lineTo(16.43f, 9.9f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.48f, 1.5f, -1.18f, 2.75f, -2.1f, 3.76f)
                curveToRelative(1.03f, 0.82f, 2.31f, 1.5f, 3.83f, 2.06f)
                lineToRelative(-0.58f, 0.89f)
                curveToRelative(-1.6f, -0.6f, -2.93f, -1.34f, -3.99f, -2.22f)
                curveToRelative(-1.12f, 0.99f, -2.5f, 1.72f, -4.13f, 2.18f)
                lineToRelative(-0.56f, -0.92f)
                curveToRelative(1.59f, -0.41f, 2.91f, -1.05f, 3.95f, -1.93f)
                arcTo(8.918f, 8.918f, 0.0f, false, true, 9.09f, 9.9f)
                lineTo(7.57f, 9.9f)
                lineTo(7.57f, 8.86f)
                close()
                moveTo(10.09f, 9.9f)
                arcToRelative(7.936f, 7.936f, 0.0f, false, false, 1.99f, 3.11f)
                curveToRelative(0.78f, -0.86f, 1.37f, -1.9f, 1.76f, -3.11f)
                horizontalLineToRelative(-3.75f)
                close()
            }
        }
        .build()
        return `_transfer-text`!!
    }

private var `_transfer-text`: ImageVector? = null
