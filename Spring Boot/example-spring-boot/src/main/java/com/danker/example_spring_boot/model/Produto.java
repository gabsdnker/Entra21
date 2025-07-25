package com.danker.example_spring_boot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")

public class Produto {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nm_produto")
    private String nmProduto;

    @Column(name = "preco")
    private double preco;

    public Produto() {
    }

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
