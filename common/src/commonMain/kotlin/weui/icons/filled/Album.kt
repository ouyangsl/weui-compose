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

public val WeUI.Icons.Filled.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(20.5f, 14.136f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(8.35f)
                lineToRelative(4.7f, -3.8f)
                curveToRelative(0.462f, -0.375f, 1.205f, -0.357f, 1.65f, 0.035f)
                lineToRelative(4.477f, 3.933f)
                lineToRelative(2.282f, -1.94f)
                curveToRelative(0.462f, -0.394f, 1.198f, -0.386f, 1.646f, 0.017f)
                lineToRelative(2.245f, 2.041f)
                close()
                moveTo(2.992f, 4.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.537f, 0.0f, 0.992f, 0.481f, 0.992f, 1.075f)
                verticalLineToRelative(13.85f)
                curveToRelative(0.0f, 0.596f, -0.444f, 1.075f, -0.992f, 1.075f)
                horizontalLineTo(2.992f)
                curveTo(2.455f, 20.0f, 2.0f, 19.519f, 2.0f, 18.925f)
                verticalLineTo(5.075f)
                curveTo(2.0f, 4.479f, 2.444f, 4.0f, 2.992f, 4.0f)
                close()
            }
        }
        .build()
        return _album!!
    }

private var _album: ImageVector? = null
