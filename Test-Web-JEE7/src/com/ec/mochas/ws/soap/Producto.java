package com.ec.mochas.ws.soap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"precio","nombre"})
public class Producto {

	private String nombre;
	
	private double precio;

	public Producto(){
		
	}
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@XmlElement(name="nombreProducto")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name="precioProducto")
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
