package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 151");
		p1.setCodigoBarras("145JIFJFUDE212456");
		p1.setDescricao("Produto Linha Branca com painel let Samsung");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p1.setId(20l);
		p1.setNome("Televisor 70");
		p1.setCodigoBarras("TLERD44487114454");
		p1.setDescricao("Televisor Tela Plana let Samsung");
		p1.setPreco(6326.12);
		
		// Adicionando os produtos á lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		
		return "produtos";
		
	}

}
