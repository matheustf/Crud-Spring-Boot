package br.com.teste.netshoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Morador {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String sobrenome;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private int idade;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private boolean dono;
	

	public Morador() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public boolean isDono() {
		return dono;
	}


	public void setDono(boolean dono) {
		this.dono = dono;
	}
	
	
	
}
