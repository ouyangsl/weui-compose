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

public val WeUI.Icons.Outlined.Contacts: ImageVector
    get() {
        if (_contacts != null) {
            return _contacts!!
        }
        _contacts = Builder(name = "Contacts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.8f, 19.8f)
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
                horizontalLineToRelative(16.6f)
                close()
                moveTo(1.0f, 20.0f)
                verticalLineToRelative(-0.685f)
                curveToRelative(0.0f, -0.685f, 0.498f, -1.483f, 1.114f, -1.784f)
                lineToRelative(5.66f, -2.762f)
                curveToRelative(0.821f, -0.4f, 1.012f, -1.288f, 0.42f, -1.99f)
                lineToRelative(-0.362f, -0.429f)
                curveTo(7.096f, 11.478f, 6.5f, 9.85f, 6.5f, 8.71f)
                lineTo(6.5f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(1.71f)
                curveToRelative(0.0f, 1.14f, -0.6f, 2.773f, -1.332f, 3.642f)
                lineToRelative(-0.361f, 0.428f)
                curveToRelative(-0.59f, 0.699f, -0.406f, 1.588f, 0.419f, 1.99f)
                lineToRelative(5.66f, 2.762f)
                curveToRelative(0.615f, 0.3f, 1.114f, 1.093f, 1.114f, 1.783f)
                lineTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(2.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(20.0f, 14.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.2f)
                close()
                moveTo(18.0f, 11.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.2f)
                close()
                moveTo(16.0f, 8.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-7.0f)
                lineTo(16.0f, 8.5f)
                close()
            }
        }
        .build()
        return _contacts!!
    }

private var _contacts: ImageVector? = null
