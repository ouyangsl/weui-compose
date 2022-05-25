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

public val WeUI.Icons.Outlined.ReportProblem: ImageVector
    get() {
        if (`_report-problem` != null) {
            return `_report-problem`!!
        }
        `_report-problem` = Builder(name = "Report-problem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.998f, 4.4f)
                lineToRelative(-8.92f, 15.454f)
                lineToRelative(17.843f, -0.001f)
                lineTo(11.998f, 4.4f)
                close()
                moveTo(2.732f, 21.054f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, -1.5f)
                lineTo(11.132f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.732f, 0.0f)
                lineToRelative(9.27f, 16.053f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, 1.5f)
                lineToRelative(-18.536f, 0.001f)
                close()
                moveTo(11.372f, 9.954f)
                horizontalLineToRelative(1.255f)
                lineToRelative(-0.097f, 4.722f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-0.097f, -4.722f)
                close()
                moveTo(11.998f, 17.098f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, true, -0.708f, -0.694f)
                curveToRelative(0.0f, -0.385f, 0.312f, -0.688f, 0.708f, -0.688f)
                curveToRelative(0.4f, 0.0f, 0.712f, 0.303f, 0.712f, 0.688f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, true, -0.712f, 0.694f)
                close()
            }
        }
        .build()
        return `_report-problem`!!
    }

private var `_report-problem`: ImageVector? = null
