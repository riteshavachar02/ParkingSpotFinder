package com.example.parkingspotfinder.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ToggleOff
import androidx.compose.material.icons.filled.ToggleOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.parkingspotfinder.viewmodel.MapsViewModel
import com.google.maps.android.compose.GoogleMap


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(
    viewModel: MapsViewModel = viewModel()
) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(
                    imageVector = if (viewModel.state.isFalloutMap) {
                            Icons.Default.ToggleOff
                        } else {
                            Icons.Default.ToggleOn
                        },
                    contentDescription = "Toggle Fallout Map "
                )
            }
        }
    ) { paddingValues ->
        GoogleMap(
            contentPadding = paddingValues
        )
    }

}