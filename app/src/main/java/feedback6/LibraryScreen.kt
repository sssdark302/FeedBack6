package feedback6

import android.text.Layout
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import java.lang.reflect.Modifier


@Composable
fun LibraryScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Layout.Alignment.Center
    ) {
        Text(text = "Pantalla de Biblioteca", style = MaterialTheme.typography.h4)
    }
}

