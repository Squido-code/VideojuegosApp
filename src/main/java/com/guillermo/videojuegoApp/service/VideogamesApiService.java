package com.guillermo.videojuegoApp.service;

import com.guillermo.videojuegoApp.ApiHelper.GetAllPlatformsHelper;
import com.guillermo.videojuegoApp.ApiHelper.GetPlatformGamesHelper;
import com.guillermo.videojuegoApp.domain.Videogame;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface VideogamesApiService {
    @GET("/api/platforms")
    Observable<GetAllPlatformsHelper> getAllPlatforms(@Query("key") String apikey,
                                                      @Query("page_size") int pageSize);
    @GET("/api/games")
    Observable<GetPlatformGamesHelper> getPlatformGames(@Query("key") String apikey,
                                                  @Query("page_size") int pageSize,
                                                  @Query("platforms") int platformId);

    @GET("/api/games/{id}")
    Observable<Videogame> getVideogame(@Path("id") int id, @Query("key") String apikey);
}
