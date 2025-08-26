package com.amazon.demonavigationcompose.ui.compose.tab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.amazon.demonavigationcompose.ui.theme.Purple80

@Composable
fun HomeScreen(title: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple80),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(title),
            style = typography.titleLarge,
        )
    }
}
