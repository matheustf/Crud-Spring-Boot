package br.com.teste.netshoes.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Bloco {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private int qtdAndares;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	@OneToMany
	private List<Apartamento> apartamentos;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private int qtdAndaresCobertura;
	
	public Bloco() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAndares() {
		return qtdAndares;
	}

	public void setQtdAndares(int qtdAndares) {
		this.qtdAndares = qtdAndares;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

	public int getQtdAndaresCobertura() {
		return qtdAndaresCobertura;
	}

	public void setQtdAndaresCobertura(int qtdAndaresCobertura) {
		this.qtdAndaresCobertura = qtdAndaresCobertura;
	}
	
	
}
