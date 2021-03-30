package com.guillermo.videojuegoApp.ApiHelper;

import com.guillermo.videojuegoApp.domain.Platform;
import lombok.Data;
import rx.Observable;

import java.util.List;
@Data
public class GetAllPlatformsHelper {
    private List<Platform> results;
}
