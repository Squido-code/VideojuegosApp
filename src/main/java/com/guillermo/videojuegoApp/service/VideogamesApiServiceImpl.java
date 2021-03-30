package com.guillermo.videojuegoApp.service;

import com.guillermo.videojuegoApp.ApiHelper.GetAllPlatformsHelper;
import com.guillermo.videojuegoApp.ApiHelper.GetPlatformGamesHelper;
import com.guillermo.videojuegoApp.domain.Videogame;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

import static com.guillermo.videojuegoApp.util.Constants.*;

public class VideogamesApiServiceImpl {
    private VideogamesApiService apiService;

    public VideogamesApiServiceImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URLBASE)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        apiService = retrofit.create(VideogamesApiService.class);
    }
    public Observable<GetAllPlatformsHelper> getAllPlatforms(){

        return apiService.getAllPlatforms(APIKEY,PAGESIZE);
    }
    public Observable<GetPlatformGamesHelper> getPlatformGames(int platformId){
        return apiService.getPlatformGames(APIKEY,PAGESIZE,platformId);

    }
    public Observable<Videogame> getVideogameById(int id){
        return apiService.getVideogame(id,APIKEY);
    }
}
