package br.com.raezu.springteste.repository;

import br.com.raezu.springteste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
