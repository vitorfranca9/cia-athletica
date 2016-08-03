package br.com.ative.ciaathletica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ative.ciaathletica.dao.IEntityDAO;
import br.com.ative.ciaathletica.entity.IEntity;
import br.com.ative.ciaathletica.entity.Status;
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
	public void save(String name) {
		Teste teste = new Teste();
		teste.setNome(name);
		teste.setDescricao(name);
		teste.setStatus(Status.ATIVO);
		entityDAO.save(teste);
	}

	@Override
	public <T extends IEntity> void remover(Integer id) {
		Teste teste = (Teste) entityDAO.find(Teste.class, id);
		entityDAO.remove(teste.getClass(),teste.getId());
	}

}
