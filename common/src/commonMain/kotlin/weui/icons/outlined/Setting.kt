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

public val WeUI.Icons.Outlined.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.563f, 3.2f)
                horizontalLineToRelative(-1.126f)
                lineToRelative(-0.645f, 2.578f)
                lineToRelative(-0.647f, 0.2f)
                arcToRelative(6.253f, 6.253f, 0.0f, false, false, -1.091f, 0.452f)
                lineToRelative(-0.599f, 0.317f)
                lineToRelative(-2.28f, -1.368f)
                lineToRelative(-0.796f, 0.797f)
                lineToRelative(1.368f, 2.28f)
                lineToRelative(-0.317f, 0.598f)
                arcToRelative(6.253f, 6.253f, 0.0f, false, false, -0.453f, 1.091f)
                lineToRelative(-0.199f, 0.647f)
                lineToRelative(-2.578f, 0.645f)
                verticalLineToRelative(1.126f)
                lineToRelative(2.578f, 0.645f)
                lineToRelative(0.2f, 0.647f)
                curveToRelative(0.115f, 0.378f, 0.267f, 0.743f, 0.452f, 1.091f)
                lineToRelative(0.317f, 0.599f)
                lineToRelative(-1.368f, 2.28f)
                lineToRelative(0.797f, 0.796f)
                lineToRelative(2.28f, -1.368f)
                lineToRelative(0.598f, 0.317f)
                curveToRelative(0.348f, 0.185f, 0.713f, 0.337f, 1.091f, 0.453f)
                lineToRelative(0.647f, 0.199f)
                lineToRelative(0.645f, 2.578f)
                horizontalLineToRelative(1.126f)
                lineToRelative(0.645f, -2.578f)
                lineToRelative(0.647f, -0.2f)
                arcToRelative(6.253f, 6.253f, 0.0f, false, false, 1.091f, -0.452f)
                lineToRelative(0.599f, -0.317f)
                lineToRelative(2.28f, 1.368f)
                lineToRelative(0.796f, -0.797f)
                lineToRelative(-1.368f, -2.28f)
                lineToRelative(0.317f, -0.598f)
                curveToRelative(0.185f, -0.348f, 0.337f, -0.713f, 0.453f, -1.091f)
                lineToRelative(0.199f, -0.647f)
                lineToRelative(2.578f, -0.645f)
                verticalLineToRelative(-1.126f)
                lineToRelative(-2.578f, -0.645f)
                lineToRelative(-0.2f, -0.647f)
                arcToRelative(6.253f, 6.253f, 0.0f, false, false, -0.452f, -1.091f)
                lineToRelative(-0.317f, -0.599f)
                lineToRelative(1.368f, -2.28f)
                lineToRelative(-0.797f, -0.796f)
                lineToRelative(-2.28f, 1.368f)
                lineToRelative(-0.598f, -0.317f)
                arcToRelative(6.253f, 6.253f, 0.0f, false, false, -1.091f, -0.453f)
                lineToRelative(-0.647f, -0.199f)
                lineToRelative(-0.645f, -2.578f)
                close()
                moveTo(15.508f, 5.37f)
                lineToRelative(1.833f, -1.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.221f, 0.15f)
                lineToRelative(1.018f, 1.018f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.15f, 1.221f)
                lineToRelative(-1.1f, 1.833f)
                curveToRelative(0.22f, 0.412f, 0.4f, 0.847f, 0.54f, 1.3f)
                lineToRelative(2.073f, 0.519f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.757f, 0.97f)
                verticalLineToRelative(1.438f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.757f, 0.97f)
                lineToRelative(-2.073f, 0.519f)
                curveToRelative(-0.14f, 0.453f, -0.32f, 0.888f, -0.54f, 1.3f)
                lineToRelative(1.1f, 1.833f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.15f, 1.221f)
                lineToRelative(-1.018f, 1.018f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.221f, 0.15f)
                lineToRelative(-1.833f, -1.1f)
                curveToRelative(-0.412f, 0.22f, -0.847f, 0.4f, -1.3f, 0.54f)
                lineToRelative(-0.519f, 2.073f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, 0.757f)
                horizontalLineToRelative(-1.438f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, -0.757f)
                lineToRelative(-0.519f, -2.073f)
                arcToRelative(7.453f, 7.453f, 0.0f, false, true, -1.3f, -0.54f)
                lineToRelative(-1.833f, 1.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.221f, -0.15f)
                lineTo(4.42f, 18.562f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.15f, -1.221f)
                lineToRelative(1.1f, -1.833f)
                arcToRelative(7.453f, 7.453f, 0.0f, false, true, -0.54f, -1.3f)
                lineToRelative(-2.073f, -0.519f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 12.72f)
                verticalLineToRelative(-1.438f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.757f, -0.97f)
                lineToRelative(2.073f, -0.519f)
                curveToRelative(0.14f, -0.453f, 0.32f, -0.888f, 0.54f, -1.3f)
                lineTo(4.27f, 6.66f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.15f, -1.221f)
                lineTo(5.438f, 4.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.221f, -0.15f)
                lineToRelative(1.833f, 1.1f)
                curveToRelative(0.412f, -0.22f, 0.847f, -0.4f, 1.3f, -0.54f)
                lineToRelative(0.519f, -2.073f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.28f, 2.0f)
                horizontalLineToRelative(1.438f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.97f, 0.757f)
                lineToRelative(0.519f, 2.073f)
                curveToRelative(0.453f, 0.14f, 0.888f, 0.32f, 1.3f, 0.54f)
                close()
                moveTo(12.0f, 14.8f)
                arcToRelative(2.8f, 2.8f, 0.0f, true, false, 0.0f, -5.6f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.0f, 5.6f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
