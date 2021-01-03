package br.com.raezu.springteste.controller;

import br.com.raezu.springteste.model.Produto;
import br.com.raezu.springteste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HomeController {
    @Autowired
    ProdutoService produtoService;

    @RequestMapping("/home")
    public String hello() {
        produtoService.saveOrUpdate(Produto.builder().nome("Teste").preco(2).descricao("testando insercao produto").build());
        return "Hello Rest!";
    }
}
