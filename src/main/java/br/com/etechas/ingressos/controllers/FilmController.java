package br.com.etechas.ingressos.controllers;

import br.com.etechas.ingressos.entity.Film;
import br.com.etechas.ingressos.enums.AgeRating;
import br.com.etechas.ingressos.enums.YesAndNo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmController {

    @GetMapping("/teste")
    public List<Film> getAllFilms() {
        return List.of(
                new Film("O espeta cu", 1L,
                        AgeRating.LIVRE, YesAndNo.S),
                new Film("O espeta cu,1L", 1L,
                        AgeRating.LIVRE, YesAndNo.S));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> buscarPorId(@PathVariable Long id) {
        if (idsExistentes.contains(id)) {
            var filme = new Film("Filme", id, AgeRating.A14, YesAndNo.N);
            return ResponseEntity.ok(filme);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/post")
    public ResponseEntity<Film> cadastrarFilme(@RequestBody Film film) {
        film.setId(500L);
        return ResponseEntity.ok(film);
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
    public Film altFilme(@PathVariable Long id,
                         @RequestBody Film film) {
        return film;
    }
}
