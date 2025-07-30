package com.delegrego.exemplo_spring_boot_2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_spring_boot_2.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	
	// Derived query method to find a Funcionario by email
	Optional<Funcionario> findByEmail(String email);
}
