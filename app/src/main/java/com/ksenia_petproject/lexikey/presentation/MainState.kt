package com.ksenia_petproject.lexikey.presentation

import com.ksenia_petproject.lexikey.domain.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)