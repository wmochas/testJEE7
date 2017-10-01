package com.ec.mochas.ws.soap;

import javax.xml.ws.Endpoint;

/***
 * Con esto puedo publicar el web service sin levantar jboss
 * 
 * @author wilsonmarcelo
 *
 */
public class TestPublisher {

	public static void main(String[] args) throws InterruptedException {

		Endpoint.publish("http://192.168.1.8:1234/testws", new TestWs());
		Thread.sleep(5000);
	}

}
