package com.bignerdranch.android.saint_p.vm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SaintViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(SaintUpdateUI())

    val uiState: StateFlow<SaintUpdateUI> = _uiState.asStateFlow()

    fun update(update: Int) {
        _uiState.update {
            it.copy(
                category = update,
                recommendation = update,
                description = update
            )
        }
    }

}