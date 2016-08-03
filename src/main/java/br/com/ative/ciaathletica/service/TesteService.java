package br.com.ative.ciaathletica.service;

import br.com.ative.ciaathletica.entity.IEntity;

public interface TesteService {

	void select();

	void save(String name);

	<T extends IEntity> void remover(Integer id);
	
}
