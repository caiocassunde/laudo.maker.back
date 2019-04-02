package com.br.laudo.maker.back.controller;

import com.br.laudo.maker.back.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Controller {

	@GetMapping("/teste")
	public Produto listaProdutos(){
		Produto oi = new Produto();
		oi.setNome("nome");
		oi.setCpf("11111111111");
		return oi;
	}
}
