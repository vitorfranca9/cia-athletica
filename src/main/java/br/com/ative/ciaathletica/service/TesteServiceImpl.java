package br.com.ative.ciaathletica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ative.ciaathletica.dao.IEntityDAO;
import br.com.ative.ciaathletica.entity.Teste;

@Service("testeService")
public class TesteServiceImpl implements TesteService {
	
	@Autowired
	private IEntityDAO entityDAO;
	
	@Override
	public void select() {
		List<Teste> testes = entityDAO.findAll(Teste.class);
		System.out.println(testes);
	}

	@Override
	public void incluir(String name) {
		Teste teste = new Teste();
		teste.setId(2);
		teste.setNome(name);
		teste.setDescricao(name);
		entityDAO.save(teste);
	}

	@Override
	public void remover(String name) {
		Teste teste = new Teste();
		teste.setId(2);
		teste.setNome(name);
		teste.setDescricao(name);
		entityDAO.remove(teste.getClass(),teste.getId());
	}

}
