package com.amazon.demonavigationcompose.ui.compose

import android.annotation.SuppressLint
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(bottomBar = {
        BottomNavigationBar(navController)
    }, floatingActionButton = {
        FloatingActionButton(onClick = { }) {
            Text("+")
        }
    }) {
        NavigationScreen(navController)
    }
}
