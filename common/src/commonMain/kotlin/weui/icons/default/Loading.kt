package weui.icons.default

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import weui.theme.WeUI

public val WeUI.Icons.Default.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }
        _loading = Builder(
            name = "Loading", defaultWidth = 120.0.dp, defaultHeight = 120.0.dp, viewportWidth
            = 100.0f, viewportHeight = 100.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFE9E9E9)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(50.0f, 10.0f)
                lineTo(50.0f, 10.0f)
                arcTo(3.5f, 5.0f, 0.0f, false, true, 53.5f, 15.0f)
                lineTo(53.5f, 25.0f)
                arcTo(3.5f, 5.0f, 0.0f, false, true, 50.0f, 30.0f)
                lineTo(50.0f, 30.0f)
                arcTo(3.5f, 5.0f, 0.0f, false, true, 46.5f, 25.0f)
                lineTo(46.5f, 15.0f)
                arcTo(3.5f, 5.0f, 0.0f, false, true, 50.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF989697)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(70.0f, 15.359f)
                lineTo(70.0f, 15.359f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 70.531f, 21.439f)
                lineTo(65.531f, 30.1f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 60.0f, 32.68f)
                lineTo(60.0f, 32.68f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 59.469f, 26.6f)
                lineTo(64.469f, 17.939f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 70.0f, 15.359f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9B999A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(84.641f, 30.001f)
                lineTo(84.641f, 30.001f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 82.061f, 35.532f)
                lineTo(73.4f, 40.532f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 67.32f, 40.001f)
                lineTo(67.32f, 40.001f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 69.9f, 34.47f)
                lineTo(78.561f, 29.47f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 84.641f, 30.001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA3A1A2)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(90.0f, 50.0f)
                lineTo(90.0f, 50.0f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 85.0f, 53.5f)
                lineTo(75.0f, 53.5f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 70.0f, 50.0f)
                lineTo(70.0f, 50.0f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 75.0f, 46.5f)
                lineTo(85.0f, 46.5f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 90.0f, 50.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFABA9AA)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(84.641f, 70.0f)
                lineTo(84.641f, 70.0f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 78.561f, 70.531f)
                lineTo(69.9f, 65.531f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 67.32f, 60.0f)
                lineTo(67.32f, 60.0f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 73.4f, 59.469f)
                lineTo(82.061f, 64.469f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 84.641f, 70.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB2B2B2)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(70.001f, 84.641f)
                lineTo(70.001f, 84.641f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 64.47f, 82.061f)
                lineTo(59.47f, 73.4f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 60.001f, 67.32f)
                lineTo(60.001f, 67.32f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 65.533f, 69.9f)
                lineTo(70.533f, 78.561f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 70.001f, 84.641f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBAB8B9)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(50.0f, 90.0f)
                lineTo(50.0f, 90.0f)
                arcTo(5.0f, 3.5f, 90.0f, false, true, 46.5f, 85.0f)
                lineTo(46.5f, 75.0f)
                arcTo(5.0f, 3.5f, 90.0f, false, true, 50.0f, 70.0f)
                lineTo(50.0f, 70.0f)
                arcTo(5.0f, 3.5f, 90.0f, false, true, 53.5f, 75.0f)
                lineTo(53.5f, 85.0f)
                arcTo(5.0f, 3.5f, 90.0f, false, true, 50.0f, 90.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC2C0C1)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(29.999f, 84.641f)
                lineTo(29.999f, 84.641f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 29.467f, 78.561f)
                lineTo(34.467f, 69.9f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 39.999f, 67.32f)
                lineTo(39.999f, 67.32f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 40.53f, 73.4f)
                lineTo(35.53f, 82.061f)
                arcTo(5.0f, 3.5f, 120.0f, false, true, 29.999f, 84.641f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBCBCB)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.359f, 70.0f)
                lineTo(15.359f, 70.0f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 17.939f, 64.469f)
                lineTo(26.6f, 59.469f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 32.68f, 60.0f)
                lineTo(32.68f, 60.0f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 30.1f, 65.531f)
                lineTo(21.439f, 70.531f)
                arcTo(3.5f, 5.0f, 60.0f, false, true, 15.359f, 70.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD2D2D2)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 50.0f)
                lineTo(10.0f, 50.0f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 15.0f, 46.5f)
                lineTo(25.0f, 46.5f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 30.0f, 50.0f)
                lineTo(30.0f, 50.0f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 25.0f, 53.5f)
                lineTo(15.0f, 53.5f)
                arcTo(3.5f, 5.0f, 90.0f, false, true, 10.0f, 50.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDADADA)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.359f, 30.001f)
                lineTo(15.359f, 30.001f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 21.439f, 29.47f)
                lineTo(30.1f, 34.47f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 32.68f, 40.001f)
                lineTo(32.68f, 40.001f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 26.6f, 40.532f)
                lineTo(17.939f, 35.532f)
                arcTo(3.5f, 5.0f, 120.0f, false, true, 15.359f, 30.001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE2E2E2)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(30.0f, 15.359f)
                lineTo(30.0f, 15.359f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 35.531f, 17.939f)
                lineTo(40.531f, 26.6f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 40.0f, 32.68f)
                lineTo(40.0f, 32.68f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 34.469f, 30.1f)
                lineTo(29.469f, 21.439f)
                arcTo(5.0f, 3.5f, 60.0f, false, true, 30.0f, 15.359f)
                close()
            }
        }
            .build()
        return _loading!!
    }

private var _loading: ImageVector? = null