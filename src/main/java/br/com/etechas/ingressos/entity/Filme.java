package br.com.etechas.ingressos.entity;

import br.com.etechas.ingressos.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Filme {
  private Long id;
  private String nome;
  private Integer duracao;
  private ClassificacaoIndicativaEnum classificao;
  private CategoriaFilmeEnum categoria;
  private Integer ano;
  private String capa;
  private String diretor;
  private String elenco;
  private String descricao;
  private double avaliacao;
  private SimNaoEnum emCartaz;


  public Filme(String nome, Long id, ClassificacaoIndicativaEnum classificao, SimNaoEnum emCartaz) {
    this.id = id;
    this.nome = nome;
    this.classificao = classificao;
    this.emCartaz = emCartaz;
  }
}
