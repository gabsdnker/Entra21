package com.danker.example_spring_boot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Indica que esta classe é uma entidade JPA
@Entity

// Define o nome da tabela no banco de dados que esta entidade irá mapear
@Table(name = "produto")

public class Produto {

    // Define o campo 'id' como chave primária da entidade
    @Id

    // Define o nome da coluna no banco de dados que corresponde a este campo
    @Column(name = "id")
    private int id;

    @Column(name = "nm_produto")
    private String nmProduto;

    @Column(name = "preco")
    private double preco;

    // Construtor padrão necessário para JPA
    public Produto() {
    }

    // Construtor com parâmetros para inicializar os campos da entidade
    public Produto(int id, String nmProduto, double preco) {
        this.id = id;
        this.nmProduto = nmProduto;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNmProduto() {
        return nmProduto;
    }
    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


}
