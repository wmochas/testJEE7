package ec.com.mochas.dao;

import java.util.List;

import javax.ejb.Stateless;

import ec.com.mochas.modelo.Cabecera;

@Stateless
public class CabeceraDao extends GenericoDao<Cabecera, Integer> {

	public CabeceraDao() {
		super(Cabecera.class);
	}	
	
	public List<Cabecera> consultarTodo(){
		return this.consultarPorNamedQuery("consultar.todo");
	}
}