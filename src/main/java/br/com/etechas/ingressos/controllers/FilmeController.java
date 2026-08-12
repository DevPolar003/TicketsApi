package br.com.etechas.ingressos.controllers;

import br.com.etechas.ingressos.entity.Filme;
import br.com.etechas.ingressos.enums.ClassificacaoIndicativaEnum;
import br.com.etechas.ingressos.enums.SimNaoEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping("/teste")
    public List<Filme> getAllFilms(){
    return List.of(
            new Filme("O espeta cu,1L", 1L,
            ClassificacaoIndicativaEnum.LIVRE, SimNaoEnum.S),
        new Filme("O espeta cu,1L", 1L,
                ClassificacaoIndicativaEnum.LIVRE, SimNaoEnum.S));
    }
}
