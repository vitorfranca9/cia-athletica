package br.com.ative.ciaathletica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ative.ciaathletica.dao.CiaAthleticaDAO;
import br.com.ative.ciaathletica.entity.Teste;

@Service("testeService")
public class TesteServiceImpl implements TesteService {

//	@Autowired
//	private CiaAthleticaJdbcTemplate template;
	
	@Autowired
	private CiaAthleticaDAO entityDAO;
	
	@Override
	public void select() {
//		template.select();
		List<Teste> testes = entityDAO.findAll(Teste.class);
		System.out.println(testes);
	}

	@Override
	public void incluir(String name) {
		Teste teste = new Teste();
		teste.setId(2);
		teste.setNome(name);
		teste.setDescricao(name);
		entityDAO.salvar(teste);
		System.out.println("cole");
	}

}
