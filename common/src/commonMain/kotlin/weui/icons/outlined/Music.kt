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

public val WeUI.Icons.Outlined.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(19.597f, 2.803f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.72f, -0.46f)
                lineToRelative(-11.61f, 2.55f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.86f, 1.11f)
                verticalLineToRelative(10.4f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.73f, 0.89f)
                lineToRelative(-1.67f, 0.35f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.6f, 2.24f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, false, 2.0f, 2.0f)
                curveToRelative(0.127f, 0.014f, 0.254f, 0.014f, 0.38f, 0.0f)
                curveToRelative(0.07f, 0.0f, 1.12f, -0.24f, 1.3f, -0.32f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, 1.52f, -2.36f)
                verticalLineToRelative(-13.0f)
                lineToRelative(10.79f, -2.37f)
                verticalLineToRelative(9.91f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.73f, 0.89f)
                lineToRelative(-1.74f, 0.37f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.56f, 2.24f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 2.0f, 2.0f)
                curveToRelative(0.13f, 0.015f, 0.26f, 0.015f, 0.39f, 0.0f)
                curveToRelative(0.442f, -0.087f, 0.88f, -0.198f, 1.31f, -0.33f)
                arcToRelative(2.67f, 2.67f, 0.0f, false, false, 1.54f, -2.33f)
                lineTo(19.607f, 2.933f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.01f, -0.13f)
                close()
                moveTo(18.407f, 15.643f)
                verticalLineToRelative(0.9f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, -0.8f, 1.22f)
                curveToRelative(-0.2f, 0.07f, -0.93f, 0.23f, -1.09f, 0.26f)
                horizontalLineToRelative(-0.15f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.8f, -0.88f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.6f, -1.0f)
                lineToRelative(1.74f, -0.35f)
                curveToRelative(0.172f, -0.03f, 0.34f, -0.08f, 0.5f, -0.15f)
                close()
                moveTo(6.407f, 18.303f)
                verticalLineToRelative(0.9f)
                curveToRelative(-0.03f, 0.52f, -0.33f, 0.986f, -0.79f, 1.23f)
                curveToRelative(-0.19f, 0.06f, -0.92f, 0.22f, -1.07f, 0.26f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.94f, -0.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.59f, -1.0f)
                lineToRelative(1.72f, -0.34f)
                curveToRelative(0.17f, -0.04f, 0.335f, -0.1f, 0.49f, -0.18f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
