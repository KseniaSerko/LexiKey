package com.ksenia_petproject.lexikey.data.dto

data class MeaningDto(
    val definitions: List<DefinitionDto>? = null,
    val partOfSpeech: String? = null
)