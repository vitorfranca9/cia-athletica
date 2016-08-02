package br.com.ative.ciaathletica.dao;

import java.util.List;

import br.com.ative.ciaathletica.entity.IEntity;

public interface CiaAthleticaDAO {
	<T extends IEntity> List<T> findAll(Class<T> clazz);
	<T extends IEntity> void salvar(T object);
}
