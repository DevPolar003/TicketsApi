package br.com.etechas.ingressos.controllers;

import br.com.etechas.ingressos.entity.Filme;
import br.com.etechas.ingressos.enums.ClassificacaoIndicativaEnum;
import br.com.etechas.ingressos.enums.SimNaoEnum;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/id")
    public Filme buscarPorId(@PathVariable Long id){
        return new Filme("Filme",id, ClassificacaoIndicativaEnum.A14, SimNaoEnum.N);
    }

    @PostMapping("/post")
    public Filme cadastrarFilme(Filme filme){
        filme.setId(500L);
        return new Filme();
    }
}
