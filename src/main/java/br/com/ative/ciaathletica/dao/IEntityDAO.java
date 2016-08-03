package br.com.ative.ciaathletica.dao;

import java.util.List;

import br.com.ative.ciaathletica.entity.IEntity;

public interface IEntityDAO {
	<T extends IEntity> List<T> findAll(Class<T> clazz);
	<T extends IEntity> void save(T object);
	<T extends IEntity> void remove(Class<T> clazz, Integer id);
}
