
package com.soap.webclient;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.webclient package. 
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

    private final static QName _OrderNotFound_QNAME = new QName("http://webservice.soap.com/", "OrderNotFound");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.webclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderNotFound }
     * 
     */
    public OrderNotFound createOrderNotFound() {
        return new OrderNotFound();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderNotFound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderNotFound }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.soap.com/", name = "OrderNotFound")
    public JAXBElement<OrderNotFound> createOrderNotFound(OrderNotFound value) {
        return new JAXBElement<OrderNotFound>(_OrderNotFound_QNAME, OrderNotFound.class, null, value);
    }

}
