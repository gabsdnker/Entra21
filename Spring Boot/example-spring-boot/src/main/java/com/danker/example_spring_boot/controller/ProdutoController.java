package com.danker.example_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danker.example_spring_boot.model.Produto;
import com.danker.example_spring_boot.service.ProdutoService;

// Controlador REST para gerenciar produtos
// Anotado com @RestController para ser detectado pelo Spring como um controlador REST

@RestController
public class ProdutoController {

	@Autowired
	ProdutoService servico;

	// Create
	@PostMapping("/produtos")
	public void inserirProduto(@RequestBody Produto p) {
		servico.inserirProduto(p);
	}

	// Read
	@GetMapping("/produtos")
	public List<Produto> listarProdutos() {
		return servico.listarProdutos();
	}

	// Update
	@PutMapping("/produtos")
	public void atualizarProduto(@RequestBody Produto p) {
		servico.atualizarProduto(p);
	}

	// Delete
	@DeleteMapping("/produtos/{id}")
	public void deletarProduto(@PathVariable int id) {
		servico.deletarProduto(id);
	}

}