package com.example.novelmanager.fb6
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

@Composable
fun NovelManagerApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) },
        content = { paddingValues ->
            NavigationHost(navController, Modifier.padding(paddingValues))
        }
    )
}
