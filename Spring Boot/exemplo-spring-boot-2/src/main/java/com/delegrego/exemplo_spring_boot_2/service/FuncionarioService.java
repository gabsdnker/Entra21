package com.delegrego.exemplo_spring_boot_2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_spring_boot_2.model.Funcionario;
import com.delegrego.exemplo_spring_boot_2.repo.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired // Injeção de dependência do repositório FuncionarioRepository
	private FuncionarioRepository repo;

	public void cadastrarFuncionario(Funcionario f) {
		repo.save(f);
	}

	public List<Funcionario> listarFuncionarios() {
		return repo.findAll();
	}
	
	public Optional<Funcionario> obterFuncionarioPorId(int id) {
		return repo.findById(id);
	}

	public void atualizarFuncionario(Funcionario f) {
		repo.save(f);
	}

	public void deletarFuncionario(int id) {
		repo.deleteById(id);
	}

}
