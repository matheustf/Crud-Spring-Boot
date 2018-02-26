package br.com.teste.netshoes.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Predio implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String nome;
	
	@NotNull(message = "Campo Obrigatorio!")
	@OneToOne
	private Endereco endereco;
	
	@Column
	@OneToMany
	private List<Bloco> blocos;
	
	public Predio() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Bloco> getBlocos() {
		return blocos;
	}

	public void setBlocos(List<Bloco> blocos) {
		this.blocos = blocos;
	}
	
	

}
