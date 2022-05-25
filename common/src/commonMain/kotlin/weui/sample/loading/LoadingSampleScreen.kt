package weui.sample.loading

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import weui.components.loading.Loading

@Composable
fun LoadingSampleScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 50.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Loading(modifier = Modifier.size(24.dp))
        Loading(modifier = Modifier.size(48.dp))
        Loading(modifier = Modifier.size(72.dp))
        Loading(modifier = Modifier.size(108.dp))
    }
}