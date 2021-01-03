package br.com.raezu.springteste.service;

import br.com.raezu.springteste.model.Produto;
import br.com.raezu.springteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id).get();
    }

    public void saveOrUpdate(Produto produto) {
        produtoRepository.save(produto);
    }

    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }

}
