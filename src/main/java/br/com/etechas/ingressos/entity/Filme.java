package br.com.etechas.ingressos.entity;
import br.com.etechas.ingressos.enums.ClassificaçaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import     br.com.etechoracio.ingresso.enums.SimNaoEnum;
public class Filme {
private Long id;
    String nome;
    Integer duracao;
    ClassificaçaoIndicativaEnum classificao;
    CategoriaFilmeEnum categoria;
    Integer ano;
    String capa;
    String diretor;
    String elenco;
    String descricao;
    double avaliacao;
    SimNaoEnum emCartaz;
    int inge;
}
