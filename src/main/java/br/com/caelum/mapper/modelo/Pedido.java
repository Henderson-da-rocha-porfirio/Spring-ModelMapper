package br.com.caelum.mapper.modelo;

import java.util.ArrayList;
import java.util.List;

/* Vamos dar um exemplo mais concreto. Parte do nosso domain model poderia representar um Pedido que se relaciona com outras classes como Endereco, Produto e Cliente: */

public class Pedido {
	
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();
	private Endereco destino;
	
	public Pedido(Cliente cliente, Endereco destino) {
		this.cliente = cliente;
		this.destino = destino;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Endereco getDestino() {
		return destino;
	}

	public void adicionaProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
