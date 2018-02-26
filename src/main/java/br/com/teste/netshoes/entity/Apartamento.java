package br.com.teste.netshoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Apartamento {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private int numero;
	
	@NotNull(message = "Campo Obrigatorio!")
	@OneToOne
	private Morador dono;
	
	@NotNull(message = "Campo Obrigatorio!")
	@OneToOne
	private Morador locatario;
	
	public Apartamento() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Morador getDono() {
		return dono;
	}

	public void setDono(Morador dono) {
		this.dono = dono;
	}

	public Morador getLocatario() {
		return locatario;
	}

	public void setLocatario(Morador locatario) {
		this.locatario = locatario;
	}
	
}
