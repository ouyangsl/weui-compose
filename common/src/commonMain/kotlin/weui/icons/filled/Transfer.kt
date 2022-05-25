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

public val WeUI.Icons.Filled.Transfer: ImageVector
    get() {
        if (_transfer != null) {
            return _transfer!!
        }
        _transfer = Builder(name = "Transfer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.475f, 9.27f)
                horizontalLineToRelative(1.646f)
                lineToRelative(0.43f, 1.367f)
                horizontalLineToRelative(1.254f)
                lineTo(16.844f, 5.0f)
                horizontalLineToRelative(-1.387f)
                lineToRelative(-1.215f, 3.5f)
                lineTo(10.0f, 8.5f)
                lineTo(10.0f, 3.002f)
                curveTo(10.0f, 2.456f, 10.449f, 2.0f, 11.002f, 2.0f)
                horizontalLineToRelative(9.996f)
                curveTo(21.544f, 2.0f, 22.0f, 2.449f, 22.0f, 3.002f)
                verticalLineToRelative(9.996f)
                curveToRelative(0.0f, 0.546f, -0.449f, 1.002f, -1.002f, 1.002f)
                lineTo(15.5f, 14.0f)
                lineTo(15.5f, 9.493f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -0.025f, -0.223f)
                close()
                moveTo(16.117f, 6.078f)
                horizontalLineToRelative(0.028f)
                lineToRelative(0.722f, 2.309f)
                horizontalLineToRelative(-1.472f)
                lineToRelative(0.722f, -2.309f)
                close()
                moveTo(3.002f, 10.0f)
                horizontalLineToRelative(9.996f)
                curveToRelative(0.546f, 0.0f, 1.002f, 0.449f, 1.002f, 1.002f)
                verticalLineToRelative(9.996f)
                curveToRelative(0.0f, 0.546f, -0.449f, 1.002f, -1.002f, 1.002f)
                lineTo(3.002f, 22.0f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 2.0f, 20.998f)
                verticalLineToRelative(-9.996f)
                curveTo(2.0f, 10.456f, 2.449f, 10.0f, 3.002f, 10.0f)
                close()
                moveTo(11.225f, 14.697f)
                verticalLineToRelative(-1.028f)
                horizontalLineToRelative(-3.04f)
                lineToRelative(0.586f, -0.181f)
                curveToRelative(-0.072f, -0.304f, -0.275f, -0.76f, -0.456f, -1.1f)
                lineToRelative(-1.13f, 0.333f)
                curveToRelative(0.138f, 0.29f, 0.269f, 0.658f, 0.341f, 0.948f)
                lineTo(4.544f, 13.669f)
                verticalLineToRelative(1.028f)
                horizontalLineToRelative(1.143f)
                curveToRelative(0.377f, 0.977f, 0.84f, 1.81f, 1.441f, 2.505f)
                curveToRelative(-0.731f, 0.535f, -1.636f, 0.912f, -2.744f, 1.158f)
                curveToRelative(0.203f, 0.246f, 0.522f, 0.738f, 0.638f, 0.991f)
                curveToRelative(1.143f, -0.318f, 2.099f, -0.774f, 2.888f, -1.397f)
                curveToRelative(0.745f, 0.601f, 1.65f, 1.05f, 2.765f, 1.34f)
                curveToRelative(0.16f, -0.29f, 0.47f, -0.753f, 0.71f, -0.985f)
                curveToRelative(-1.05f, -0.232f, -1.926f, -0.615f, -2.65f, -1.136f)
                curveToRelative(0.594f, -0.674f, 1.057f, -1.492f, 1.397f, -2.476f)
                horizontalLineToRelative(1.093f)
                close()
                moveTo(8.945f, 14.697f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, true, -1.013f, 1.773f)
                arcToRelative(5.942f, 5.942f, 0.0f, false, true, -1.151f, -1.773f)
                horizontalLineToRelative(2.164f)
                close()
            }
        }
        .build()
        return _transfer!!
    }

private var _transfer: ImageVector? = null
