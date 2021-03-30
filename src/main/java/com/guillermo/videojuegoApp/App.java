package com.guillermo.videojuegoApp;

import com.guillermo.videojuegoApp.ApiHelper.GetAllPlatformsHelper;
import com.guillermo.videojuegoApp.ApiHelper.GetPlatformGamesHelper;
import com.guillermo.videojuegoApp.domain.Platform;
import com.guillermo.videojuegoApp.domain.Videogame;
import com.guillermo.videojuegoApp.service.VideogamesApiServiceImpl;

import rx.Observable;
import rx.schedulers.Schedulers;


import java.util.List;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args){
//        VideogamesApiServiceImpl videogamesApiService = new VideogamesApiServiceImpl();
//        videogamesApiService.getAllPlatforms().flatMapIterable(getAllPlatformsHelper ->getAllPlatformsHelper.getResults())
//                .subscribeOn(Schedulers.from(Executors.newSingleThreadExecutor()))
//                .subscribe(System.out::println);
//        VideogamesApiServiceImpl videogamesApiService = new VideogamesApiServiceImpl();
//        videogamesApiService.getPlatformGames(5).flatMapIterable(getPlatformGamesHelper ->getPlatformGamesHelper.getResults())
//                .subscribeOn(Schedulers.from(Executors.newSingleThreadExecutor()))
//                .subscribe(System.out::println);
        VideogamesApiServiceImpl videogamesApiService = new VideogamesApiServiceImpl();
        videogamesApiService.getVideogameById(4200)
                .subscribeOn(Schedulers.from(Executors.newSingleThreadExecutor()))
                .subscribe(System.out::println);
//        Observable<GetAllPlatformsHelper> platformList = videogamesApiService.getAllPlatforms();
//        List<Videogame> videogames = videogamesApiService.getPlatformGames(7);
//        Videogame videogame = videogamesApiService.getVideogameById(4200);
//        System.out.println(videogame.toString());
    }
}
