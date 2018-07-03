
package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PriceAndSeats", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8084/TurkishAirlines/PriceAndSeats?wsdl")
public class PriceAndSeats_Service
    extends Service
{

    private final static URL PRICEANDSEATS_WSDL_LOCATION;
    private final static WebServiceException PRICEANDSEATS_EXCEPTION;
    private final static QName PRICEANDSEATS_QNAME = new QName("http://webservices/", "PriceAndSeats");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/TurkishAirlines/PriceAndSeats?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRICEANDSEATS_WSDL_LOCATION = url;
        PRICEANDSEATS_EXCEPTION = e;
    }

    public PriceAndSeats_Service() {
        super(__getWsdlLocation(), PRICEANDSEATS_QNAME);
    }

    public PriceAndSeats_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRICEANDSEATS_QNAME, features);
    }

    public PriceAndSeats_Service(URL wsdlLocation) {
        super(wsdlLocation, PRICEANDSEATS_QNAME);
    }

    public PriceAndSeats_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRICEANDSEATS_QNAME, features);
    }

    public PriceAndSeats_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PriceAndSeats_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PriceAndSeats
     */
    @WebEndpoint(name = "PriceAndSeatsPort")
    public PriceAndSeats getPriceAndSeatsPort() {
        return super.getPort(new QName("http://webservices/", "PriceAndSeatsPort"), PriceAndSeats.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PriceAndSeats
     */
    @WebEndpoint(name = "PriceAndSeatsPort")
    public PriceAndSeats getPriceAndSeatsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "PriceAndSeatsPort"), PriceAndSeats.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRICEANDSEATS_EXCEPTION!= null) {
            throw PRICEANDSEATS_EXCEPTION;
        }
        return PRICEANDSEATS_WSDL_LOCATION;
    }

}