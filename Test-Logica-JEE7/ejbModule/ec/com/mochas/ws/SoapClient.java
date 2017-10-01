package ec.com.mochas.ws;

import javax.ejb.Stateless;
import javax.xml.ws.soap.SOAPFaultException;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

@Stateless
public class SoapClient {

	/***
	 * Este metodo consume un web service que usa SOAP, se usa las clases del
	 * paquete net.webservicex los cuales fueron generados por la herramienta de
	 * consola "wsimport" el cual viene incluido con el jdk el url usado es el
	 * siguiente: http://www.webservicex.net/geoipservice.asmx?WSDL
	 * 
	 * @param ip
	 * @return
	 */
	public String getPaisPorIp(String ip) {
		String respuesta;
		try {
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ip);
			respuesta = geoIP.getCountryName();
		} catch (SOAPFaultException ex) {
			respuesta = "Error de ws";
		}
		return respuesta;
	}
}
