package com.amazon.demonavigationcompose.ui.compose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.amazon.demonavigationcompose.nav.MainDestinations
import androidx.compose.ui.res.stringResource

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navItems = listOf(
        MainDestinations.Home,
        MainDestinations.Search,
        MainDestinations.List,
        MainDestinations.Profile
    )
    var selectedItem by rememberSaveable { mutableStateOf(0) }
    NavigationBar {
        navItems.forEachIndexed { index, item ->
            val icon = when(item){
                MainDestinations.Home -> Icons.Filled.Home
                MainDestinations.Search -> Icons.Filled.Search
                MainDestinations.List -> Icons.AutoMirrored.Filled.List
                else -> Icons.Filled.Person
            }
            NavigationBarItem(
                alwaysShowLabel = true,
                icon = { Icon(icon, contentDescription = stringResource(item.titleRes)) },
                label = { Text(stringResource(item.titleRes)) },
                selected = selectedItem == index ,
                onClick = {
                    selectedItem = index
                    navController.navigate(item)
                }
            )
        }
    }
}
