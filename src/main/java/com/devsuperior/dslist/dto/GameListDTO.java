package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.Entities.GameList;

public class GameListDTO {

    private long id;
    private String nome;

    public GameListDTO (){}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        nome = entity.getNome();
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }
}
