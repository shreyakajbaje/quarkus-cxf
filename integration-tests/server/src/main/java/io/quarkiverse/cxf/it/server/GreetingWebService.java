package io.quarkiverse.cxf.it.server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.ws.RequestWrapper;

@WebService
public interface GreetingWebService {

    @WebMethod
    String reply(@WebParam(name = "text") String text);

    @WebMethod
    @RequestWrapper(localName = "Ping", targetNamespace = "http://server.it.cxf.quarkiverse.io/", className = "io.quarkiverse.cxf.it.server.Ping")
    String ping(@WebParam(name = "text") String text) throws GreetingException;

}
