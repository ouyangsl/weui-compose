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

public val WeUI.Icons.Outlined.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.503f, 17.8f)
                horizontalLineTo(20.5f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.3f, -0.3f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.3f, -0.3f)
                horizontalLineToRelative(-17.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.3f, 0.3f)
                verticalLineToRelative(12.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.3f, 0.3f)
                horizontalLineToRelative(4.7f)
                verticalLineToRelative(2.303f)
                lineToRelative(2.303f, -2.303f)
                close()
                moveTo(11.0f, 19.0f)
                lineToRelative(-2.293f, 2.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.586f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 17.5f)
                verticalLineToRelative(-12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 4.0f)
                horizontalLineToRelative(17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 5.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
