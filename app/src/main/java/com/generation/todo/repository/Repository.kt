package com.generation.todo.repository

import com.generation.todo.api.RetrofitInstance
import com.generation.todo.model.Categoria
import retrofit2.Response

class Repository {

   suspend fun listaCategoria(): Response <List<Categoria>>{

       return RetrofitInstance.api.listaCategoria()
   }

}