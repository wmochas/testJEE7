package ec.com.mochas.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

abstract class GenericoDao<T, PK extends Serializable> {

	private Class<T> entityClass;
	//si ejecutara en un servidor de aplicaciones podria inyectar esta dependencia.
	protected EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public GenericoDao(EntityManager em){
		this.entityManager=em;
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}
	
	public T insertar(T t){
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.getTransaction().commit();
		return t;
	}
	
	public T buscarPorId(PK id) {
		return this.entityManager.find(entityClass, id);
	}

	public T actualizar(T t) {		
		entityManager.getTransaction().begin();
		T t1=this.entityManager.merge(t);
		entityManager.getTransaction().commit();
		return t1;		
	}

	public void borrar(T t) {
		t = this.entityManager.merge(t);
		this.entityManager.remove(t);
	}
	
//	public List<Usuario> consultarTodo(){
//		Query query = entityManager.createQuery("Select u from Usuario u");
//		List<Usuario> usuarios = query.getResultList();
//		return usuarios;	
//	}	
}