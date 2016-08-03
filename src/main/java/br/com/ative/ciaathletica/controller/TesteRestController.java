package br.com.ative.ciaathletica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ative.ciaathletica.service.TesteService;

@RestController
public class TesteRestController {

	@Autowired
	private TesteService testeService;
	
	@RequestMapping("hello/{name}")
	public String hello(@PathVariable String name) {
		testeService.select();
		return "Hello " +name;
	}
	
	@RequestMapping("cole")
	public String cole(@RequestParam(name="name") String name) {
		return "Oi " +name;
	}
	
	@RequestMapping("incluir/{name}")
	public String incluir(@PathVariable String name) {
		testeService.incluir(name);
		return "Oi " +name;
	}
	
	@RequestMapping("remover/{name}")
	public String remover(@PathVariable String name) {
		testeService.remover(name);
		return "Oi " +name;
	}
	
	@RequestMapping("iae/{name}")
	public String iae(@PathVariable String name) {
//		testeService.remover(name);
		return "Iae " +name;
	}
	
}
