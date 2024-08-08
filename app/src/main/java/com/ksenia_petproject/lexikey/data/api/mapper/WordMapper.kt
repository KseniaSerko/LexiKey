package com.ksenia_petproject.lexikey.data.api.mapper

import com.ksenia_petproject.lexikey.data.dto.DefinitionDto
import com.ksenia_petproject.lexikey.data.dto.MeaningDto
import com.ksenia_petproject.lexikey.data.dto.WordItemDto
import com.ksenia_petproject.lexikey.domain.model.Definition
import com.ksenia_petproject.lexikey.domain.model.Meaning
import com.ksenia_petproject.lexikey.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)