package com.guillermo.videojuegoApp.ApiHelper;

import com.guillermo.videojuegoApp.domain.Videogame;
import lombok.Data;

import java.util.List;
@Data
public class GetPlatformGamesHelper {
    private List<Videogame> results;
}
