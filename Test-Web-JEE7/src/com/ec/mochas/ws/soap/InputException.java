package com.ec.mochas.ws.soap;

public class InputException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String errorDetails;
	public InputException(String reason,String errorDetails){
		super(reason);
		this.errorDetails=errorDetails;
	}
	
	public String getFaultInfo(){
		return errorDetails;
	}

}
