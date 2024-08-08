package com.ksenia_petproject.lexikey.presentation

sealed class MainUIEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUIEvents()

    object OnSearchClick : MainUIEvents()
}