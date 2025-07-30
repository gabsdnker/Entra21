package com.delegrego.exemplo_spring_boot_2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegrego.exemplo_spring_boot_2.model.Funcionario;
import com.delegrego.exemplo_spring_boot_2.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
@CrossOrigin
public class FuncionarioController {

	@Autowired
	private FuncionarioService servico;

	@PostMapping
	public void cadastrarFuncionario(@RequestBody Funcionario f) {
		servico.cadastrarFuncionario(f);
	}

	@GetMapping
	public List<Funcionario> listarFuncionarios() {
		return servico.listarFuncionarios();
	}
	
	@GetMapping("/{id}")
	public Optional<Funcionario> obterFuncionarioPorId(@PathVariable int id) {
		return servico.obterFuncionarioPorId(id);
	}

	@PutMapping
	public void atualizarFuncionario(@RequestBody Funcionario f) {
		servico.atualizarFuncionario(f);
	}

	@DeleteMapping("/{id}")
	public void deletarFuncionario(@PathVariable int id) {
		servico.deletarFuncionario(id);
	}

}
