package com.ec.mochas.ws.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ec.mochas.ws.soap.ITestWs", name = "TestWs", portName = "TestPort", serviceName = "TestService", targetNamespace = "http://www.mochas.com")
public class TestWs implements ITestWs {

	public String test() {
		return "Hola Mundo";
	}

	public String saludar(String nombre) throws InputException {
		String saludo;
		saludo="Hola " + nombre;
		if(nombre ==null){
			throw new InputException("Invalid Input", nombre +" no es valido");
		}
		return saludo;
	}

	public void noDeberiaSerWsMethod() {

	}

	public List<Producto> getProductos() {
		return generaProductos();
	}

	private List<Producto> generaProductos() {
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto("computadora", 100));
		productos.add(new Producto("play station 3", 200));
		return productos;
	}
}
