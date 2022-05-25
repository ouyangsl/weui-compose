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

public val WeUI.Icons.Outlined.MaxWindow: ImageVector
    get() {
        if (`_max-window` != null) {
            return `_max-window`!!
        }
        `_max-window` = Builder(name = "Max-window", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(21.0f, 16.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(3.8f)
                lineTo(19.8f, 16.0f)
                lineTo(21.0f, 16.0f)
                close()
                moveTo(8.0f, 3.0f)
                verticalLineToRelative(1.2f)
                lineTo(4.2f, 4.2f)
                lineTo(4.2f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(19.797f, 5.046f)
                lineToRelative(-5.472f, 5.472f)
                lineToRelative(-0.849f, -0.849f)
                lineToRelative(5.472f, -5.472f)
                horizontalLineToRelative(-2.951f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.2f)
                lineTo(19.797f, 5.046f)
                close()
                moveTo(4.203f, 18.954f)
                lineToRelative(5.472f, -5.472f)
                lineToRelative(0.849f, 0.849f)
                lineToRelative(-5.472f, 5.472f)
                horizontalLineToRelative(2.951f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(2.951f)
                close()
            }
        }
        .build()
        return `_max-window`!!
    }

private var `_max-window`: ImageVector? = null
