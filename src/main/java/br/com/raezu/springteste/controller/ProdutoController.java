package br.com.raezu.springteste.controller;

import br.com.raezu.springteste.model.Produto;
import br.com.raezu.springteste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/produto/{id}")
    public Produto getProduto(@PathVariable("id") Long id) {
        return produtoService.getProdutoById(id);
    }

}
