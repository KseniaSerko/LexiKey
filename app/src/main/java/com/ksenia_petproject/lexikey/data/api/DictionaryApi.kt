package com.ksenia_petproject.lexikey.data.api

import com.ksenia_petproject.lexikey.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word: String
    ): WordResultDto?

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }
}