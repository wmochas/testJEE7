package ec.com.mochas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.com.mochas.modelo.Usuario;

public class UsuarioDao extends GenericoDao<Usuario,Long> {

	/*
	 * En este caso necesito obtener una instancia del entityManager
	 * ya que no la puedo obtener por inyeccion
	 * */
	public UsuarioDao(EntityManager entityManager){
		super(entityManager);
	}
	
	public List<Usuario> consultarTodo(){
		Query query = entityManager.createQuery("Select u from Usuario u");
		@SuppressWarnings("unchecked")
		List<Usuario> usuarios = query.getResultList();
		return usuarios;	
	}
}