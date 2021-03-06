package com.example.mymovieapp


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "a249df7dba4e00ca399a5f71dd68e435",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "a249df7dba4e00ca399a5f71dd68e435",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "a249df7dba4e00ca399a5f71dd68e435",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}