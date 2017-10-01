package ec.com.mochas.testws.clientsample;

import ec.com.mochas.testws.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        TestService service1 = new TestService();
	        System.out.println("Create Web Service...");
	        ITestWs port1 = service1.getTestPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.productos());
	        System.out.println("Server said: " + port1.saludar(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.holaMundo());
	        System.out.println("Create Web Service...");
	        ITestWs port2 = service1.getTestPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.productos());
	        System.out.println("Server said: " + port2.saludar(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.holaMundo());
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
