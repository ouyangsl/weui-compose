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

public val WeUI.Icons.Outlined.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.31f, 15.561f)
                lineToRelative(4.114f, 4.115f)
                lineToRelative(-0.848f, 0.848f)
                lineToRelative(-4.123f, -4.123f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.857f, -0.84f)
                close()
                moveTo(16.8f, 11.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, true, false, -11.6f, 0.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 11.6f, 0.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
