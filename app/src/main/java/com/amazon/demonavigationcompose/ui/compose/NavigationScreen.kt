package com.amazon.demonavigationcompose.ui.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.amazon.demonavigationcompose.nav.NavTitle
import com.amazon.demonavigationcompose.ui.compose.tab.HomeScreen
import com.amazon.demonavigationcompose.ui.compose.tab.ListScreen
import com.amazon.demonavigationcompose.ui.compose.tab.ProfileScreen
import com.amazon.demonavigationcompose.ui.compose.tab.SearchScreen

@Composable
fun NavigationScreen(navController: NavHostController) {
    NavHost(
        navController,
        startDestination = NavTitle.HOME
    ) {
        composable(NavTitle.HOME) { HomeScreen("HOME") }
        composable(NavTitle.SEARCH) { SearchScreen() }
        composable(NavTitle.LIST) { ListScreen() }
        composable(NavTitle.PROFILE) { ProfileScreen() }
    }
}
