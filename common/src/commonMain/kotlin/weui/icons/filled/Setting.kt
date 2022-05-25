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

public val WeUI.Icons.Filled.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.208f, 4.83f)
                curveToRelative(0.453f, 0.14f, 0.888f, 0.32f, 1.3f, 0.54f)
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
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
