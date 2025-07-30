package com.delegrego.exemplo_spring_boot_2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_spring_boot_2.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
