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

public val WeUI.Icons.Outlined.Transfer: ImageVector
    get() {
        if (_transfer != null) {
            return _transfer!!
        }
        _transfer = Builder(name = "Transfer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.2f, 11.2f)
                verticalLineToRelative(9.6f)
                horizontalLineToRelative(9.6f)
                verticalLineToRelative(-9.6f)
                lineTo(3.2f, 11.2f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 3.002f)
                curveTo(10.0f, 2.456f, 10.449f, 2.0f, 11.002f, 2.0f)
                horizontalLineToRelative(9.996f)
                curveTo(21.544f, 2.0f, 22.0f, 2.449f, 22.0f, 3.002f)
                verticalLineToRelative(9.996f)
                curveToRelative(0.0f, 0.546f, -0.449f, 1.002f, -1.002f, 1.002f)
                lineTo(14.0f, 14.0f)
                verticalLineToRelative(6.998f)
                curveToRelative(0.0f, 0.546f, -0.449f, 1.002f, -1.002f, 1.002f)
                lineTo(3.002f, 22.0f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 2.0f, 20.998f)
                verticalLineToRelative(-9.996f)
                curveTo(2.0f, 10.456f, 2.449f, 10.0f, 3.002f, 10.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(11.2f, 10.0f)
                horizontalLineToRelative(1.798f)
                curveToRelative(0.546f, 0.0f, 1.002f, 0.449f, 1.002f, 1.002f)
                lineTo(14.0f, 12.8f)
                horizontalLineToRelative(6.8f)
                lineTo(20.8f, 3.2f)
                horizontalLineToRelative(-9.6f)
                lineTo(11.2f, 10.0f)
                close()
                moveTo(8.945f, 14.697f)
                lineTo(6.781f, 14.697f)
                curveToRelative(0.282f, 0.666f, 0.666f, 1.26f, 1.15f, 1.773f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, 1.014f, -1.773f)
                close()
                moveTo(11.225f, 14.697f)
                horizontalLineToRelative(-1.093f)
                curveToRelative(-0.34f, 0.984f, -0.803f, 1.802f, -1.397f, 2.476f)
                curveToRelative(0.724f, 0.52f, 1.6f, 0.904f, 2.65f, 1.136f)
                curveToRelative(-0.24f, 0.232f, -0.55f, 0.695f, -0.71f, 0.985f)
                curveToRelative(-1.115f, -0.29f, -2.02f, -0.739f, -2.765f, -1.34f)
                curveToRelative(-0.79f, 0.623f, -1.745f, 1.079f, -2.888f, 1.397f)
                arcToRelative(6.025f, 6.025f, 0.0f, false, false, -0.638f, -0.991f)
                curveToRelative(1.108f, -0.246f, 2.013f, -0.623f, 2.744f, -1.158f)
                curveToRelative(-0.6f, -0.695f, -1.064f, -1.528f, -1.44f, -2.505f)
                lineTo(4.543f, 14.697f)
                verticalLineToRelative(-1.028f)
                horizontalLineToRelative(2.982f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, false, -0.34f, -0.948f)
                lineToRelative(1.13f, -0.333f)
                curveToRelative(0.18f, 0.34f, 0.383f, 0.796f, 0.455f, 1.1f)
                lineToRelative(-0.586f, 0.181f)
                horizontalLineToRelative(3.04f)
                verticalLineToRelative(1.028f)
                close()
                moveTo(17.551f, 10.637f)
                lineToRelative(-0.43f, -1.367f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(-0.43f, 1.367f)
                lineTo(13.5f, 10.637f)
                lineTo(15.457f, 5.0f)
                horizontalLineToRelative(1.387f)
                lineToRelative(1.96f, 5.637f)
                horizontalLineToRelative(-1.253f)
                close()
                moveTo(16.117f, 6.078f)
                lineToRelative(-0.722f, 2.309f)
                horizontalLineToRelative(1.472f)
                lineToRelative(-0.722f, -2.309f)
                horizontalLineToRelative(-0.028f)
                close()
            }
        }
        .build()
        return _transfer!!
    }

private var _transfer: ImageVector? = null
