package feedback6
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val title: String) {
    object Home : BottomNavItem("home", Icons.Default.Home, "Inicio")
    object Library : BottomNavItem("library", Icons.Default.Book, "Biblioteca")
    object Settings : BottomNavItem("settings", Icons.Default.Settings, "Configuración")
}
