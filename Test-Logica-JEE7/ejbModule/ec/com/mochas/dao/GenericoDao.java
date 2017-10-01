package ec.com.mochas.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
abstract class GenericoDao<T, PK extends Serializable> {

	private Class<T> entityClass;

	@PersistenceContext
	protected EntityManager entityManager;

	public GenericoDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	 
	public T insertar(T t) {
		entityManager.persist(t);
		return t;
	}

	public T consultarPorId(PK id) {
		return this.entityManager.find(entityClass, id);
	}

	protected List<T> consultarPorNamedQuery(String nameQuery) {
		TypedQuery<T> query = entityManager.createNamedQuery(nameQuery, entityClass);
		List<T> usuarios = query.getResultList();
		return usuarios;
	}

	public T actualizar(T t) {
		T t1 = this.entityManager.merge(t);
		this.entityManager.flush();
		return t1;
	}

	public void borrar(T t) {
		t = this.entityManager.merge(t);
		this.entityManager.remove(t);
	}
}
