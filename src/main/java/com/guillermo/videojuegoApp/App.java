package com.guillermo.videojuegoApp;

import com.guillermo.videojuegoApp.domain.Platform;
import com.guillermo.videojuegoApp.domain.Videogame;
import com.guillermo.videojuegoApp.service.VideogamesApiServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args){
        VideogamesApiServiceImpl videogamesApiService = new VideogamesApiServiceImpl();
        List<Platform> platformList = videogamesApiService.getAllPlatforms();
        List<Videogame> videogames = videogamesApiService.getPlatformGames(7);
        Videogame videogame = videogamesApiService.getVideogameById(4200);
        System.out.println(videogame.toString());
    }
}
