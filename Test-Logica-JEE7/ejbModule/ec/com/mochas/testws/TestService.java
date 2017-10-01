package ec.com.mochas.testws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-08-08T16:52:47.176-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "TestService", 
                  wsdlLocation = "http://localhost:8080/Test-Web-JEE7/TestService?wsdl",
                  targetNamespace = "http://www.mochas.com") 
public class TestService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.mochas.com", "TestService");
    public final static QName TestPort = new QName("http://www.mochas.com", "TestPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Test-Web-JEE7/TestService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TestService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Test-Web-JEE7/TestService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TestService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public TestService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TestService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TestService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ITestWs
     */
    @WebEndpoint(name = "TestPort")
    public ITestWs getTestPort() {
        return super.getPort(TestPort, ITestWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ITestWs
     */
    @WebEndpoint(name = "TestPort")
    public ITestWs getTestPort(WebServiceFeature... features) {
        return super.getPort(TestPort, ITestWs.class, features);
    }

}
