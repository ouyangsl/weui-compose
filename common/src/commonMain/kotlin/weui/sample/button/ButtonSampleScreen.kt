package weui.sample.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.button.*

/**
 * 按钮 Sample
 */
@Composable
fun ButtonSampleScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Button(
            text = "主要操作",
            colors = PrimaryButtonColors
        ) {}

        Button(
            text = "主要操作",
            colors = PrimaryButtonColors,
            enabled = false
        ) {}

        Button(
            text = "次要操作",
            colors = DefaultButtonColors
        ) {}

        Button(
            text = "次要操作",
            colors = DefaultButtonColors,
            enabled = false
        ) {}

        Button(
            text = "警示操作",
            colors = WarnButtonColors
        ) {}

        Button(
            text = "警示操作",
            colors = WarnButtonColors,
            enabled = false
        ) {}

        Button(
            text = "普通行按钮",
            type = ButtonType.Cell,
            colors = DefaultCellButtonColors,
            modifier = Modifier.fillMaxWidth()
        ) {}

        Button(
            text = "强调行按钮",
            type = ButtonType.Cell,
            colors = PrimaryCellButtonColors,
            modifier = Modifier.fillMaxWidth()
        ) {}

        Button(
            text = "警示行按钮",
            type = ButtonType.Cell,
            colors = WarnCellButtonColors,
            modifier = Modifier.fillMaxWidth()
        ) {}
    }
}