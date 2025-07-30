package com.delegrego.exemplo_spring_boot_2.security;

import com.delegrego.exemplo_spring_boot_2.model.Funcionario;
import com.delegrego.exemplo_spring_boot_2.repo.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class FuncionarioDetailsService implements UserDetailsService {

	@Autowired // Injeção de dependência do repositório FuncionarioRepository
	private FuncionarioRepository repo;

	@Override // Método que carrega os detalhes do usuário pelo email
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Funcionario funcionario = repo.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
		return new User(funcionario.getEmail(), funcionario.getSenha(),
				Collections.singletonList(new SimpleGrantedAuthority("USER")));
	}
}