package com.delegrego.exemplo_spring_boot_2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

	@Column(name = "pais", nullable = false, length = 50)
	private String pais;

	@Column(name = "estado", nullable = false, length = 2)
	private String estado;

	@Column(name = "cidade", nullable = false, length = 100)
	private String cidade;

	@Column(name = "bairro", nullable = false, length = 100)
	private String bairro;

	@Column(name = "logradouro", nullable = false, length = 100)
	private String logradouro;

	@Column(name = "numero", length = 10)
	private String numero;

	@Column(name = "cep", length = 9)
	private String cep;

	public Endereco() {

	}

	public Endereco(String pais, String estado, String cidade, String bairro, String logradouro, String numero,
			String cep) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
