package br.com.raezu.springteste.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Builder()
@AllArgsConstructor()
@NoArgsConstructor()
@Entity
public class Produto {
    @Id
    @GeneratedValue
    private Long id;
    private String nome, descricao;
    private double preco;


}
