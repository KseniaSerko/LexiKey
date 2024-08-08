package com.ksenia_petproject.lexikey.data.dto

data class WordItemDto(
    val meanings: List<MeaningDto>? = null,
    val phonetic: String? = null,
    val word: String? = null
)