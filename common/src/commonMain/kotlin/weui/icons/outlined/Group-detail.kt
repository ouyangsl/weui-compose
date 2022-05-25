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

public val WeUI.Icons.Outlined.GroupDetail: ImageVector
    get() {
        if (`_group-detail` != null) {
            return `_group-detail`!!
        }
        `_group-detail` = Builder(name = "Group-detail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.2f, 19.8f)
                horizontalLineToRelative(16.6f)
                verticalLineToRelative(-0.485f)
                curveToRelative(0.0f, -0.229f, -0.235f, -0.605f, -0.44f, -0.705f)
                lineToRelative(-5.66f, -2.76f)
                curveToRelative(-1.527f, -0.745f, -1.904f, -2.546f, -0.81f, -3.843f)
                lineToRelative(0.36f, -0.428f)
                curveToRelative(0.552f, -0.654f, 1.05f, -2.014f, 1.05f, -2.868f)
                lineTo(13.3f, 7.0f)
                curveToRelative(0.0f, -1.545f, -1.254f, -2.8f, -2.8f, -2.8f)
                arcTo(2.803f, 2.803f, 0.0f, false, false, 7.7f, 7.0f)
                verticalLineToRelative(1.71f)
                curveToRelative(0.0f, 0.856f, 0.496f, 2.21f, 1.05f, 2.866f)
                lineToRelative(0.36f, 0.429f)
                curveToRelative(1.097f, 1.299f, 0.715f, 3.099f, -0.81f, 3.843f)
                lineTo(2.64f, 18.61f)
                curveToRelative(-0.203f, 0.099f, -0.44f, 0.479f, -0.44f, 0.705f)
                verticalLineToRelative(0.485f)
                close()
                moveTo(13.496f, 4.35f)
                arcTo(3.38f, 3.38f, 0.0f, false, true, 15.0f, 4.0f)
                curveToRelative(1.86f, 0.0f, 3.368f, 1.494f, 3.368f, 3.334f)
                verticalLineToRelative(1.424f)
                curveToRelative(0.0f, 0.95f, -0.504f, 2.311f, -1.121f, 3.035f)
                lineToRelative(-0.305f, 0.357f)
                curveToRelative(-0.496f, 0.582f, -0.341f, 1.324f, 0.353f, 1.659f)
                lineToRelative(4.767f, 2.3f)
                curveToRelative(0.518f, 0.25f, 0.938f, 0.912f, 0.938f, 1.487f)
                verticalLineToRelative(0.572f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -0.843f, 0.832f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(0.022f, 0.106f, 0.033f, 0.212f, 0.033f, 0.315f)
                verticalLineToRelative(0.687f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.001f, 0.998f)
                lineTo(2.0f, 21.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, -1.0f, -0.998f)
                verticalLineToRelative(-0.687f)
                curveToRelative(0.0f, -0.685f, 0.498f, -1.483f, 1.114f, -1.784f)
                lineToRelative(5.66f, -2.762f)
                curveToRelative(0.821f, -0.4f, 1.012f, -1.288f, 0.42f, -1.99f)
                lineToRelative(-0.362f, -0.429f)
                curveTo(7.096f, 11.478f, 6.5f, 9.85f, 6.5f, 8.71f)
                lineTo(6.5f, 7.0f)
                curveToRelative(0.0f, -2.21f, 1.795f, -4.0f, 4.0f, -4.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, true, 2.996f, 1.35f)
                close()
                moveTo(14.153f, 5.37f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 14.5f, 7.0f)
                verticalLineToRelative(1.71f)
                curveToRelative(0.0f, 1.14f, -0.6f, 2.773f, -1.332f, 3.642f)
                lineToRelative(-0.361f, 0.428f)
                curveToRelative(-0.59f, 0.699f, -0.406f, 1.588f, 0.419f, 1.99f)
                lineToRelative(5.66f, 2.762f)
                curveToRelative(0.137f, 0.067f, 0.27f, 0.158f, 0.39f, 0.268f)
                lineTo(21.8f, 17.8f)
                verticalLineToRelative(-0.204f)
                curveToRelative(0.0f, -0.111f, -0.154f, -0.354f, -0.26f, -0.406f)
                lineToRelative(-4.766f, -2.3f)
                curveToRelative(-1.401f, -0.677f, -1.752f, -2.336f, -0.745f, -3.518f)
                lineToRelative(0.305f, -0.358f)
                curveToRelative(0.433f, -0.508f, 0.834f, -1.593f, 0.834f, -2.256f)
                lineTo(17.168f, 7.334f)
                curveTo(17.168f, 6.159f, 16.2f, 5.2f, 15.0f, 5.2f)
                curveToRelative(-0.3f, 0.0f, -0.587f, 0.06f, -0.847f, 0.17f)
                close()
            }
        }
        .build()
        return `_group-detail`!!
    }

private var `_group-detail`: ImageVector? = null
