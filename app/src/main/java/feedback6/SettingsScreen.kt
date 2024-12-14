package feedback6

import android.text.Layout
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

@Composable
fun SettingsScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Layout.Alignment.Center
    ) {
        Text(text = "Pantalla de Configuración", style = MaterialTheme.typography.h4)
    }
}

