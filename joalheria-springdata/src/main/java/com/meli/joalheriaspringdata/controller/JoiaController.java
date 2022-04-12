package com.meli.joalheriaspringdata.controller;

import com.meli.joalheriaspringdata.model.Joia;
import com.meli.joalheriaspringdata.repository.JoiaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/joalheria")
public class JoiaController {

    private JoiaRepository joiaRepository;

    @GetMapping("/joias")
    public ResponseEntity<List<Joia>> getJoias() {
        return ResponseEntity.ok(joiaRepository.findAll());
    }

    @GetMapping("/joia/{id}")
    public ResponseEntity<Joia> getJoia(@PathVariable Long id) {
        //return ResponseEntity.ok(joiaRepository.findById(id).get());
        return joiaRepository.findById(id)
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Joia> postJoia(@Valid @RequestBody Joia joia) {
        return ResponseEntity.status(HttpStatus.CREATED).body(joiaRepository.save(joia));
    }

    @PutMapping
    public ResponseEntity putJoia(@Valid @RequestBody Joia joia) {
        return joiaRepository.findById(joia.getId())
                .map(resp -> ResponseEntity.ok(joiaRepository.save(joia)))
                .orElse(ResponseEntity.badRequest().build());
//        if (joiaRepository.existsById(joia.getId())) {
//            joiaRepository.save(joia);
//        }
    }

    @DeleteMapping("/joia/excluir")
    public ResponseEntity<Object> removeJoia(@RequestParam String id) {
        Long joiaId = Long.valueOf((id));
        return joiaRepository.findById(joiaId)
                .map(resp -> {
                    joiaRepository.deleteById(joiaId);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
