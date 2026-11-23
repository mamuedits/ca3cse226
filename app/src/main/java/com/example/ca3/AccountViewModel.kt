
package com.example.ca3

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class AccountViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    companion object {
        private const val ACCOUNT_TYPE_KEY = "account_type"
    }

    val accountType: StateFlow<String> =
        savedStateHandle.getStateFlow(
            ACCOUNT_TYPE_KEY,
            "Savings"
        )

    fun updateAccountType(newType: String) {
        savedStateHandle[ACCOUNT_TYPE_KEY] = newType
    }
}
