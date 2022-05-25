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

public val WeUI.Icons.Outlined.DeleteOn: ImageVector
    get() {
        if (`_delete-on` != null) {
            return `_delete-on`!!
        }
        `_delete-on` = Builder(name = "Delete-on", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.774f, 6.4f)
                lineToRelative(0.812f, 13.648f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.798f, 0.752f)
                horizontalLineToRelative(7.232f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.798f, -0.752f)
                lineTo(17.226f, 6.4f)
                horizontalLineToRelative(1.203f)
                lineToRelative(-0.817f, 13.719f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.616f, 22.0f)
                lineTo(8.384f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.996f, -1.881f)
                lineTo(5.571f, 6.4f)
                horizontalLineToRelative(1.203f)
                close()
                moveTo(9.5f, 9.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(0.5f, 9.0f)
                lineTo(10.0f, 18.0f)
                lineToRelative(-0.5f, -9.0f)
                close()
                moveTo(13.3f, 9.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-0.5f, 9.0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(0.5f, -9.0f)
                close()
                moveTo(4.459f, 2.353f)
                lineToRelative(15.757f, 2.778f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.406f, 0.58f)
                lineTo(20.5f, 6.4f)
                lineTo(3.758f, 3.448f)
                lineToRelative(0.122f, -0.69f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.579f, -0.405f)
                close()
                moveTo(10.749f, 1.228f)
                lineToRelative(3.94f, 0.695f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.406f, 0.58f)
                lineToRelative(-0.122f, 0.689f)
                lineToRelative(-4.924f, -0.869f)
                lineToRelative(0.122f, -0.689f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.579f, -0.406f)
                close()
            }
        }
        .build()
        return `_delete-on`!!
    }

private var `_delete-on`: ImageVector? = null
