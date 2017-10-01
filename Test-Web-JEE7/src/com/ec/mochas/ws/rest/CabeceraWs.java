package com.ec.mochas.ws.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.com.mochas.ejb.CabeceraEjb;
import ec.com.mochas.modelo.Cabecera;

@Path("/cabecera")
public class CabeceraWs {

	@Inject
	CabeceraEjb cabeceraEjb;
	
	@GET
	@Path("/obtenerCabeceras")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> obtenerCabeceras(){
		//TODO pendiente retornar List<Cabeceras>, me esta dando una recursividad al acceder a detalles (se regresa acabecera)
		List<Cabecera> cabeceras =cabeceraEjb.getCabeceraDao().consultarTodo();
		List<String> resultado= new ArrayList<String>();
		for (Cabecera cabecera : cabeceras) {
			resultado.add(cabecera.getDescripcion());
		}
		return resultado; 
	}
	
	@GET
	@Path("/sayHello")
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}
}
