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

public val WeUI.Icons.Filled.GroupDetail: ImageVector
    get() {
        if (`_group-detail` != null) {
            return `_group-detail`!!
        }
        `_group-detail` = Builder(name = "Group-detail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.111f, 4.002f)
                curveToRelative(1.809f, 0.058f, 3.257f, 1.529f, 3.257f, 3.332f)
                verticalLineToRelative(1.424f)
                curveToRelative(0.0f, 0.95f, -0.504f, 2.311f, -1.121f, 3.035f)
                lineToRelative(-0.305f, 0.357f)
                curveToRelative(-0.496f, 0.582f, -0.341f, 1.324f, 0.353f, 1.659f)
                lineToRelative(4.767f, 2.3f)
                curveToRelative(0.518f, 0.25f, 0.938f, 0.912f, 0.938f, 1.487f)
                verticalLineToRelative(0.572f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -0.843f, 0.832f)
                horizontalLineToRelative(-0.674f)
                curveToRelative(-0.122f, -1.16f, -0.902f, -2.31f, -1.94f, -2.817f)
                lineToRelative(-5.416f, -2.642f)
                lineToRelative(0.188f, -0.222f)
                curveTo(15.276f, 12.179f, 16.0f, 10.202f, 16.0f, 8.71f)
                lineTo(16.0f, 7.0f)
                arcToRelative(5.473f, 5.473f, 0.0f, false, false, -0.889f, -2.998f)
                close()
                moveTo(7.831f, 12.35f)
                curveTo(7.097f, 11.478f, 6.5f, 9.85f, 6.5f, 8.71f)
                lineTo(6.5f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(1.71f)
                curveToRelative(0.0f, 1.14f, -0.6f, 2.773f, -1.332f, 3.642f)
                lineToRelative(-0.361f, 0.428f)
                curveToRelative(-0.59f, 0.699f, -0.406f, 1.588f, 0.419f, 1.99f)
                lineToRelative(5.66f, 2.762f)
                curveToRelative(0.615f, 0.3f, 1.114f, 1.093f, 1.114f, 1.783f)
                verticalLineToRelative(0.687f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.001f, 0.998f)
                lineTo(2.0f, 21.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, -1.0f, -0.998f)
                verticalLineToRelative(-0.687f)
                curveToRelative(0.0f, -0.685f, 0.498f, -1.483f, 1.114f, -1.784f)
                lineToRelative(5.66f, -2.762f)
                curveToRelative(0.821f, -0.4f, 1.012f, -1.288f, 0.42f, -1.99f)
                lineToRelative(-0.362f, -0.429f)
                close()
            }
        }
        .build()
        return `_group-detail`!!
    }

private var `_group-detail`: ImageVector? = null
