package com.guillermo.videojuegoApp.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.net.URI;

@Data
@ToString
@Builder
public class Platform {
    private int id;
    private String name;
    private int games_count;
    private URI image_background;
}
