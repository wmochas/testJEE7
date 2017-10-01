package com.ec.mochas.managedBeans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ec.com.mochas.ejb.CabeceraEjb;
import ec.com.mochas.modelo.Cabecera;
import ec.com.mochas.modelo.Detalle;
import ec.com.mochas.ws.SoapClient;

@ManagedBean
@SessionScoped
public class CabeceraBean {

	@EJB
	private CabeceraEjb cabeceraEjb;
	@EJB
	private SoapClient soapClient;

	private Cabecera cabecera;
	private Detalle detalle;
	private String tituloCabecera;
	private String tituloDetalle;
	private String localizacion;// para probar mi ws

	@PostConstruct
	public void init() {
		if (soapClient == null) {
			System.out.println("NULLOOOO");
		} else {
			//179.49.27.133
			//localizacion = soapClient.getPaisPorIp("192.168.10.10");
		}
	}

	// opciones generales cabecera
	// ***************************************************
	public String crear() {
		cabecera = new Cabecera();
		this.tituloCabecera = "Crear";
		// el valor retornado corresponde a la pagina a la cual navegare dentro
		// de la carpeta /cabecera
		return "gestionCabecera";
	}

	public String ver(Cabecera cabecera) {

		this.cabecera = cabecera;
		return "ver";
	}

	public String actualizar(Cabecera cabecera) {
		this.tituloCabecera = "Actualizar";
		this.cabecera = cabecera;
		return "gestionCabecera";
	}

	public String borrar(Cabecera cabecera) {
		cabeceraEjb.getCabeceraDao().borrar(cabecera);
		return "cabeceras";
	}

	// Crear
	// ***************************************************
	public String insertarDetalle() {
		this.tituloDetalle = "Crear";
		detalle = new Detalle();
		return "gestionDetalle";
	}

	public String agregarDetalle() {
		if (this.cabecera.getDetalles() == null) {
			this.cabecera.setDetalles(new ArrayList<Detalle>());
		}
		if (!this.cabecera.getDetalles().contains(detalle)) {
			this.detalle.setCabecera(cabecera);
			this.cabecera.getDetalles().add(detalle);
			this.detalle = new Detalle();
		}
		return "gestionCabecera";
	}

	public String actualizarDetalle(Detalle detalle) {
		this.tituloDetalle = "Actualizar";
		this.detalle = detalle;
		return "gestionDetalle";
	}

	public String actualizarDetalle() {
		if (cabecera.getId() != null)
			return "detalleActualActualizado";
		else
			return "detalleNuevoActualizado";
	}

	public String borrarDetalle(Detalle detalle) {
		this.cabecera.getDetalles().remove(detalle);
		return "gestionCabecera";
	}

	public String guardar() {
		cabeceraEjb.getCabeceraDao().actualizar(cabecera);
		return "listadoCabeceras";
	}

	// PROPIEDADES
	// **********************************************************
	public Cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera cabecera) {
		this.cabecera = cabecera;
	}

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}

	public String getTituloCabecera() {
		return tituloCabecera;
	}

	public void setTituloCabecera(String titulo) {
		this.tituloCabecera = titulo;
	}

	public String getTituloDetalle() {
		return tituloDetalle;
	}

	public void setTituloDetalle(String tituloDetalle) {
		this.tituloDetalle = tituloDetalle;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
}
