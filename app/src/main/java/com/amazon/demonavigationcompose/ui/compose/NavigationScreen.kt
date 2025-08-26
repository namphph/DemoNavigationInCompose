package com.amazon.demonavigationcompose.ui.compose

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.amazon.demonavigationcompose.R
import com.amazon.demonavigationcompose.nav.MainDestinations
import com.amazon.demonavigationcompose.ui.compose.tab.HomeScreen
import com.amazon.demonavigationcompose.ui.compose.tab.ListScreen
import com.amazon.demonavigationcompose.ui.compose.tab.ProfileScreen
import com.amazon.demonavigationcompose.ui.compose.tab.SearchScreen

@Composable
fun NavigationScreen(navController: NavHostController) {
    NavHost(
        navController,
        startDestination = MainDestinations.Home
    ) {
        // HomeScreen
        composable<MainDestinations.Home> {backStackEntry ->
            val home: MainDestinations.Home = backStackEntry.toRoute()
            HomeScreen(home.titleRes)
        }

        // ProfileScreen
        composable<MainDestinations.Profile> { backStackEntry ->
            val profile: MainDestinations.Profile = backStackEntry.toRoute()
            ProfileScreen(profile.titleRes)
        }

        // SearchScreen
        composable<MainDestinations.Search> {backStackEntry ->
            val search: MainDestinations.Search = backStackEntry.toRoute()
            SearchScreen(search.titleRes)
        }

        // ListScreen
        composable<MainDestinations.List> {backStackEntry ->
            val list: MainDestinations.List = backStackEntry.toRoute()
            ListScreen(list.titleRes)
        }
    }
}
