package br.inatel.labs.labsads.padraomvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;


@Service
public class ProdutoService {
	private List<Produto> listaDeProdutos = new ArrayList<>();
	
	@PostConstruct
	private void setup() {
		Produto p1 = new Produto(1L, "PC", 5000.00);
		Produto p2 = new Produto(2L, "Placa de video", 3000.00);
		Produto p3 = new Produto(3L, "Monitor", 1000.00);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
	}
	
	public List<Produto> findAll(){
		return listaDeProdutos;
	}
	
}
