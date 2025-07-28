package com.danker.example_spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danker.example_spring_boot.model.Produto;
import com.danker.example_spring_boot.repo.ProdutoRepo;

// Serviço para gerenciar operações relacionadas a produtos
// Anotado com @Service para ser detectado pelo Spring como um componente de serviço
@Service
public class ProdutoService {

    // Injeção de dependência do repositório de produtos
    @Autowired 
    ProdutoRepo produtoRepo;

    // Create
    public void inserirProduto(Produto p){
        produtoRepo.save(p);
    }

    // Read
    public List<Produto> listarProdutos(){
        return produtoRepo.findAll();
    }

    // Update
    public void atualizarProduto(Produto p){
        produtoRepo.save(p);
    }

    // Delete
    public void deletarProduto(int id){
        produtoRepo.deleteById(id);
    }

}
