package br.com.etechas.ingressos.entity;

import br.com.etechas.ingressos.enums.*;

public class Filme {
  Long id;
  String nome;
  Integer duracao;
  ClassificacaoIndicativaEnum classificao;
  CategoriaFilmeEnum categoria;
  Integer ano;
  String capa;
  String diretor;
  String elenco;
  String descricao;
  double avaliacao;
  SimNaoEnum emCartaz;
}
