package com.delegrego.exemplo_spring_boot_2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegrego.exemplo_spring_boot_2.model.Departamento;
import com.delegrego.exemplo_spring_boot_2.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
@CrossOrigin
public class DepartamentoController {

	@Autowired
	private DepartamentoService servico;

	@PostMapping
	public void cadastrarDepartamento(@RequestBody Departamento d) {
		servico.cadastrarDepartamento(d);
	}

	@GetMapping
	public List<Departamento> listarDepartamentos() {
		return servico.listarDepartamentos();
	}

	@GetMapping("/{id}")
	public Optional<Departamento> obterDepartamentoPorId(@PathVariable int id) {
		return servico.obterDepartamentoPorId(id);
	}

	@PutMapping
	public void atualizarDepartamento(@RequestBody Departamento d) {
		servico.atualizarDepartamento(d);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deletarDepartamento(@PathVariable int id) {
		servico.deletarDepartamento(id);
		return ResponseEntity.noContent().build();
	}

}
