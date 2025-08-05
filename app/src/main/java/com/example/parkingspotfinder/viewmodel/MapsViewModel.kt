package com.example.parkingspotfinder.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.parkingspotfinder.data.MapState

class MapsViewModel: ViewModel() {

    var state by mutableStateOf(MapState())
}