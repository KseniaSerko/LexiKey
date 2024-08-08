package com.ksenia_petproject.lexikey.domain.repository

import com.ksenia_petproject.lexikey.data.dto.WordItemDto
import com.ksenia_petproject.lexikey.domain.model.WordItem
import com.ksenia_petproject.lexikey.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWordResult(
        word:String
    ):Flow<Result<WordItem>>
}