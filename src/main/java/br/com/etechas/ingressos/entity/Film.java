package br.com.etechas.ingressos.entity;

import br.com.etechas.ingressos.enums.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Film {
    private Long id;
    private String nome;
    private Integer duracao;
    private AgeRating classificao;
    private FilmCategories categoria;
    private Integer ano;
    private String capa;
    private String diretor;
    private String elenco;
    private String descricao;
    private double avaliacao;
    private YesAndNo emCartaz;


    public Film(String nome, Long id, AgeRating classificao, YesAndNo emCartaz) {
        this.id = id;
        this.nome = nome;
        this.classificao = classificao;
        this.emCartaz = emCartaz;
    }
}
