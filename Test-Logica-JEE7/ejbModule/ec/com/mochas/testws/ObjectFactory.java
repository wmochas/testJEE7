
package ec.com.mochas.testws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.com.mochas.testws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HolaMundo_QNAME = new QName("http://soap.ws.mochas.ec.com/", "holaMundo");
    private final static QName _HolaMundoResponse_QNAME = new QName("http://soap.ws.mochas.ec.com/", "holaMundoResponse");
    private final static QName _Producto_QNAME = new QName("http://soap.ws.mochas.ec.com/", "producto");
    private final static QName _Productos_QNAME = new QName("http://soap.ws.mochas.ec.com/", "productos");
    private final static QName _ProductosResponse_QNAME = new QName("http://soap.ws.mochas.ec.com/", "productosResponse");
    private final static QName _Saludar_QNAME = new QName("http://soap.ws.mochas.ec.com/", "saludar");
    private final static QName _SaludarResponse_QNAME = new QName("http://soap.ws.mochas.ec.com/", "saludarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.com.mochas.testws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HolaMundo }
     * 
     */
    public HolaMundo createHolaMundo() {
        return new HolaMundo();
    }

    /**
     * Create an instance of {@link HolaMundoResponse }
     * 
     */
    public HolaMundoResponse createHolaMundoResponse() {
        return new HolaMundoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link ProductosResponse }
     * 
     */
    public ProductosResponse createProductosResponse() {
        return new ProductosResponse();
    }

    /**
     * Create an instance of {@link Saludar }
     * 
     */
    public Saludar createSaludar() {
        return new Saludar();
    }

    /**
     * Create an instance of {@link SaludarResponse }
     * 
     */
    public SaludarResponse createSaludarResponse() {
        return new SaludarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaMundo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "holaMundo")
    public JAXBElement<HolaMundo> createHolaMundo(HolaMundo value) {
        return new JAXBElement<HolaMundo>(_HolaMundo_QNAME, HolaMundo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaMundoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "holaMundoResponse")
    public JAXBElement<HolaMundoResponse> createHolaMundoResponse(HolaMundoResponse value) {
        return new JAXBElement<HolaMundoResponse>(_HolaMundoResponse_QNAME, HolaMundoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "productos")
    public JAXBElement<Productos> createProductos(Productos value) {
        return new JAXBElement<Productos>(_Productos_QNAME, Productos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "productosResponse")
    public JAXBElement<ProductosResponse> createProductosResponse(ProductosResponse value) {
        return new JAXBElement<ProductosResponse>(_ProductosResponse_QNAME, ProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "saludar")
    public JAXBElement<Saludar> createSaludar(Saludar value) {
        return new JAXBElement<Saludar>(_Saludar_QNAME, Saludar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.mochas.ec.com/", name = "saludarResponse")
    public JAXBElement<SaludarResponse> createSaludarResponse(SaludarResponse value) {
        return new JAXBElement<SaludarResponse>(_SaludarResponse_QNAME, SaludarResponse.class, null, value);
    }

}
