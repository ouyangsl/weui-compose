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

public val WeUI.Icons.Filled.ReportProblem: ImageVector
    get() {
        if (`_report-problem` != null) {
            return `_report-problem`!!
        }
        `_report-problem` = Builder(name = "Report-problem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(21.268f, 21.053f)
                lineToRelative(-18.536f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, -1.5f)
                lineTo(11.132f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.732f, 0.0f)
                lineToRelative(9.27f, 16.053f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, 1.5f)
                close()
                moveTo(11.248f, 9.545f)
                lineToRelative(0.116f, 5.666f)
                horizontalLineToRelative(1.272f)
                lineToRelative(0.117f, -5.666f)
                horizontalLineToRelative(-1.506f)
                close()
                moveTo(11.998f, 18.117f)
                curveToRelative(0.48f, 0.0f, 0.855f, -0.369f, 0.855f, -0.832f)
                curveToRelative(0.0f, -0.463f, -0.375f, -0.826f, -0.856f, -0.826f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, -0.85f, 0.826f)
                curveToRelative(0.0f, 0.463f, 0.375f, 0.832f, 0.85f, 0.832f)
                close()
            }
        }
        .build()
        return `_report-problem`!!
    }

private var `_report-problem`: ImageVector? = null
