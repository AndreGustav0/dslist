package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    public GameList(){}

    public GameList(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return id == gameList.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
