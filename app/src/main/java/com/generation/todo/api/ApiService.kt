package com.generation.todo.api

import com.generation.todo.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")
    suspend fun listaCategoria() : Response<List<Categoria>>
}