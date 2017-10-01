package com.ec.mochas.managedBeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ec.com.mochas.dao.CabeceraDao;
import ec.com.mochas.modelo.Cabecera;

@ManagedBean
@RequestScoped
public class ListasBean {

	@EJB
	private CabeceraDao cabeceraDao;

	public List<Cabecera> getCabeceras() {
		return cabeceraDao.consultarTodo();
	}
}
