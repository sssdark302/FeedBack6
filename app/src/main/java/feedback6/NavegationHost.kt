import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import feedback6.BottomNavItem
import feedback6.HomeScreen
import feedback6.LibraryScreen
import feedback6.SettingsScreen
import feedback6.sampleNovels
import java.lang.reflect.Modifier

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavItem.Library.route) {
            LibraryScreen()
        }
        composable(BottomNavItem.Settings.route) {
            SettingsScreen()
        }
    }
}
