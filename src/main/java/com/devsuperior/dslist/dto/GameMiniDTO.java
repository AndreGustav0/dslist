package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMiniDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public GameMiniDTO () {}

    public GameMiniDTO(Game entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        descricaoCurta = entity.getDescricaoCurta();
    }

    public GameMiniDTO(GameMinProjection projection) {
        id = projection.getId();
        titulo = projection.getTitulo();
        ano = projection.getAno();
        imgUrl = projection.getImgUrl();
        descricaoCurta = projection.getDescricaoCurta();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
