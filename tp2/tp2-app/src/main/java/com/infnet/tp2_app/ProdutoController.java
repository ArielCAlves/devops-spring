package com.infnet.tp2_app;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final List<String> produtos = new ArrayList<>(List.of("Teclado", "Mouse", "Monitor"));

    @GetMapping
    public List<String> listar() {
        return produtos;
    }

    @GetMapping("/{id}")
    public String buscar(@PathVariable int id) {
        return produtos.get(id);
    }

    @PostMapping
    public List<String> adicionar(@RequestBody String nome) {
        produtos.add(nome);
        return produtos;
    }

    @PutMapping("/{id}")
    public String atualizar(@PathVariable int id, @RequestBody String nome) {
        produtos.set(id, nome);
        return produtos.get(id);
    }

    @DeleteMapping("/{id}")
    public List<String> deletar(@PathVariable int id) {
        produtos.remove(id);
        return produtos;
    }
}