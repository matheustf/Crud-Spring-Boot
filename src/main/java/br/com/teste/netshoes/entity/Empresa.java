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
public class Empresa implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	private String nomeFansasia;
	
	@NotNull(message = "Campo Obrigatorio!")
	@OneToOne
	private Endereco endereco;
	
	@Column(nullable = false)
	@NotNull(message = "Campo Obrigatorio!")
	@OneToMany
	private List<Predio> predios;

	public Empresa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFansasia() {
		return nomeFansasia;
	}

	public void setNomeFansasia(String nomeFansasia) {
		this.nomeFansasia = nomeFansasia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Predio> getPredios() {
		return predios;
	}

	public void setPredios(List<Predio> predios) {
		this.predios = predios;
	}
	
	

}
