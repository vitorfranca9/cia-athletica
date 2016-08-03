package br.com.ative.ciaathletica.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ative.ciaathletica.entity.IEntity;
import br.com.ative.ciaathletica.entity.Teste;

@Service("entityDAO")
public class EntityDAO implements IEntityDAO {

	@Autowired
//	private Session session;
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends IEntity> List<T> findAll(Class<T> clazz) {
		return entityManager.createQuery(String.format("select e from %s e", clazz.getSimpleName())).getResultList();
	}
	
	@Transactional
	@Override
	public <T extends IEntity> void save(T entity) {
		if (entity.getId() == null) {
			entityManager.persist(entity);
		} else {
			entityManager.merge(entity);
		}
	}

	@Transactional
	@Override
	public <T extends IEntity> void remove(Class<T> clazz, Integer id) {
		T entity = entityManager.find(clazz, id);
		entityManager.remove(entity);
	}

}
