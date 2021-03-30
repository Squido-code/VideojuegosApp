package com.guillermo.videojuegoApp.service;

import com.guillermo.videojuegoApp.domain.Platform;
import com.guillermo.videojuegoApp.ApiHelper.getAllPlatformsHelper;
import com.guillermo.videojuegoApp.domain.Videogame;
import com.guillermo.videojuegoApp.ApiHelper.GetPlatformGamesHelper;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

import static com.guillermo.videojuegoApp.util.Constants.*;

public class VideogamesApiServiceImpl {
    private VideogamesApiService apiService;

    public VideogamesApiServiceImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URLBASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(VideogamesApiService.class);
    }
    public List<Platform> getAllPlatforms(){
        Call<getAllPlatformsHelper> allPlatforms = apiService.getAllPlatforms(APIKEY,PAGESIZE);
        try{
            Response<getAllPlatformsHelper> response = allPlatforms.execute();
            return response.body().getResults();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
        return null;
    }
    public List<Videogame> getPlatformGames(int platformId){
        Call<GetPlatformGamesHelper> platformGame = apiService.getPlatformGames(APIKEY,PAGESIZE,platformId);
        try{
            Response<GetPlatformGamesHelper> response = platformGame.execute();
            return response.body().getResults();
        }catch (IOException io){
            io.printStackTrace();
        }
        return null;
    }
    public Videogame getVideogameById(int id){
        Call<Videogame> videogame = apiService.getVideogame(id,APIKEY);
        try{
            Response<Videogame> response = videogame.execute();
            return response.body();
        }catch (IOException io){
            io.printStackTrace();
        }
        return null;
    }
}
