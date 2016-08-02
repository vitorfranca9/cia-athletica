package br.com.ative.ciaathletica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ative.ciaathletica.entity.IEntity;

@Service("entityDAO")
public class CiaAthleticaDAOImpl implements CiaAthleticaDAO {

	@Autowired
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends IEntity> List<T> findAll(Class<T> clazz) {
		Query query = entityManager.createQuery(String.format("select e from %s e", clazz.getSimpleName()));
		return query.getResultList();
	}
	
	@Transactional
	@Override
	public <T extends IEntity> void salvar(T object) {
//		entityManager.getTransaction().begin();
//		entityManager.persist(object);
		entityManager.merge(object);
//		entityManager.getTransaction().commit();
//		entityManager.close();
	}

}
