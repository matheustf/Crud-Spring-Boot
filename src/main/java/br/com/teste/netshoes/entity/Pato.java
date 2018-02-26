package br.com.teste.netshoes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Dinossauro implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull(message = "Campo Obrigatorio!")
	@Column(nullable = false)
	private String nome;
	@NotNull(message = "Campo Obrigatorio!")
	@Column(nullable = false)
	private String idade;
	@NotNull(message = "Campo Obrigatorio!")
	@Column(nullable = false)
	private String pula;

	public Dinossauro() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getPula() {
		return pula;
	}

	public void setPula(String pula) {
		this.pula = pula;
	}
	

}
