package com.ec.mochas.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

//http://localhost:8080/Test-Web-JEE7/[serviceName]?wsdl-> asi llamo al wsdl 
@WebService()
public interface ITestWs {

	@WebMethod(action = "getHolaMundo", operationName = "holaMundo")
	String test();

	@WebMethod()
	@WebResult(name = "saludo")
	String saludar(@WebParam(partName = "partNombre", name = "nombre") String nombre) throws InputException;

	@WebMethod(operationName="productos")
	@WebResult(name="listaProductos")
	List<Producto> getProductos();
}