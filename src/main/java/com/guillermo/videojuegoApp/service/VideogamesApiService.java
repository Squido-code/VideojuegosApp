package com.guillermo.videojuegoApp.service;

import com.guillermo.videojuegoApp.ApiHelper.getAllPlatformsHelper;
import com.guillermo.videojuegoApp.ApiHelper.GetPlatformGamesHelper;
import com.guillermo.videojuegoApp.domain.Videogame;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface VideogamesApiService {
    @GET("/api/platforms")
    Call<getAllPlatformsHelper> getAllPlatforms(@Query("key") String apikey,
                                                @Query("page_size") int pageSize);
    @GET("/api/games")
    Call<GetPlatformGamesHelper> getPlatformGames(@Query("key") String apikey,
                                                  @Query("page_size") int pageSize,
                                                  @Query("platforms") int platformId);

    @GET("/api/games/{id}")
    Call<Videogame> getVideogame(@Path("id") int id, @Query("key") String apikey);
}
