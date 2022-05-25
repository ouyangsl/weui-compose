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

public val WeUI.Icons.Outlined.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(20.8f, 14.409f)
                lineTo(20.8f, 5.2f)
                lineTo(3.2f, 5.2f)
                verticalLineToRelative(8.892f)
                lineToRelative(5.0f, -4.043f)
                curveToRelative(0.462f, -0.374f, 1.205f, -0.356f, 1.65f, 0.036f)
                lineToRelative(4.477f, 3.933f)
                lineToRelative(2.282f, -1.94f)
                curveToRelative(0.462f, -0.394f, 1.198f, -0.386f, 1.646f, 0.017f)
                lineTo(20.8f, 14.41f)
                close()
                moveTo(20.8f, 15.994f)
                lineToRelative(-3.374f, -3.036f)
                lineToRelative(-2.188f, 1.86f)
                lineTo(16.582f, 16.0f)
                horizontalLineToRelative(-1.77f)
                lineToRelative(-5.806f, -5.06f)
                lineTo(3.2f, 15.636f)
                lineTo(3.2f, 18.8f)
                horizontalLineToRelative(17.6f)
                verticalLineToRelative(-2.806f)
                close()
                moveTo(2.992f, 4.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.537f, 0.0f, 0.992f, 0.481f, 0.992f, 1.075f)
                verticalLineToRelative(13.85f)
                curveToRelative(0.0f, 0.596f, -0.444f, 1.075f, -0.992f, 1.075f)
                lineTo(2.992f, 20.0f)
                curveTo(2.455f, 20.0f, 2.0f, 19.519f, 2.0f, 18.925f)
                lineTo(2.0f, 5.075f)
                curveTo(2.0f, 4.479f, 2.444f, 4.0f, 2.992f, 4.0f)
                close()
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
