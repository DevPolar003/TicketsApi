package br.com.etechas.ingressos.controllers;

import br.com.etechas.ingressos.entity.Filme;
import br.com.etechas.ingressos.enums.ClassificacaoIndicativaEnum;
import br.com.etechas.ingressos.enums.SimNaoEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.SSLEngineResult;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping("/teste")
    public List<Filme> getAllFilms() {
        return List.of(
                new Filme("O espeta cu", 1L,
                        ClassificacaoIndicativaEnum.LIVRE, SimNaoEnum.S),
                new Filme("O espeta cu,1L", 1L,
                        ClassificacaoIndicativaEnum.LIVRE, SimNaoEnum.S));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        if(idsExistentes.contains(id)){
            var filme = new Filme("Filme", id, ClassificacaoIndicativaEnum.A14, SimNaoEnum.N);
            return ResponseEntity.ok(filme);
        }else{
            return ResponseEntity.notFound().build();
        }
        }



    @PostMapping("/post")
    public Filme cadastrarFilme(@RequestBody Filme filme) {
        filme.setId(500L);
        return filme;
    }

    List<Long> idsExistentes = List.of(1L, 2L, 3L, 5L, 325L, 43436L, 437L, 788L);

    @DeleteMapping("/delete-filme/{id}")
    public ResponseEntity<Void> deletarFilme(@PathVariable Long id) {


            if (idsExistentes.contains(id)) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        }



    @PutMapping("/criar-filme/{id}")
    public Filme altFilme(@PathVariable Long id,
                          @RequestBody Filme filme){
        return filme;
    }
}
