package com.danker.example_spring_boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danker.example_spring_boot.model.Produto;

// Interface de repositório para a entidade Produto 
public interface ProdutoRepo extends JpaRepository<Produto, Integer>{

    // JpaRepository já fornece métodos CRUD básicos, 
    // aqui você pode adicionar métodos personalizados se necessário

}
