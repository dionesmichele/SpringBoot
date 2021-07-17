package com.farmacia.farm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produto {

	@Id
	@GeneratedValue
	private Long IdProduto;

	@NotNull
	@Size(min = 5, max = 100)
	private String nome;

	@NotNull
	@Size(min = 5, max = 250)
	private String classificacao;

	@NotNull
	private Long preco;

	public Long getIdProduto() {
		return IdProduto;
	}

	public void setIdProduto(Long idProduto) {
		IdProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	}

}
