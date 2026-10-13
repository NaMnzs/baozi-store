package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity
public class Produto {
    @Id
    @GeneratedValue
    private Long Id;

    private String nome;
    private BigDecimal preco;
    private Boolean estoque;

    public Produto(Long id, String nome, BigDecimal preco, Boolean estoque) {
        Id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
}
