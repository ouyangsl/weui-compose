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

public val WeUI.Icons.Filled.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.218f, 7.954f)
                lineTo(6.3f, 7.954f)
                lineTo(6.3f, 9.17f)
                horizontalLineToRelative(2.036f)
                lineTo(8.336f, 15.0f)
                horizontalLineToRelative(1.475f)
                lineTo(9.811f, 9.17f)
                horizontalLineToRelative(1.816f)
                lineToRelative(1.96f, 5.83f)
                horizontalLineToRelative(1.776f)
                lineToRelative(2.369f, -7.046f)
                horizontalLineToRelative(-1.607f)
                lineToRelative(-1.611f, 5.527f)
                horizontalLineToRelative(-0.034f)
                lineToRelative(-1.612f, -5.527f)
                horizontalLineToRelative(-1.65f)
                close()
                moveTo(2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(8.0f, 21.05f)
                curveToRelative(0.0f, -0.414f, 0.344f, -0.75f, 0.753f, -0.75f)
                horizontalLineToRelative(6.494f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.753f, 0.75f)
                verticalLineToRelative(0.75f)
                lineTo(8.0f, 21.8f)
                verticalLineToRelative(-0.75f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
