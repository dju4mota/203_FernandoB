package br.inatel.labs.labsads.padraomvc.model;

public class Produto {
	
	private Long id;
	private String descricao;
	private Double preco;
	
	Produto(Long id, String descricao, Double preco) {
		this.descricao = descricao;
		this.id = id;
		this.preco = preco;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public Double getPreco() {
		return preco;
	}
	
	
}
