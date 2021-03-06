
package org.url.documentlibrary;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DocumentLibraryWS", targetNamespace = "http://documentlibrary.url.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DocumentLibraryWS {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "demarrage", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.Demarrage")
    @ResponseWrapper(localName = "demarrageResponse", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.DemarrageResponse")
    @Action(input = "http://documentlibrary.url.org/DocumentLibraryWS/demarrageRequest", output = "http://documentlibrary.url.org/DocumentLibraryWS/demarrageResponse")
    public void demarrage();

    /**
     * 
     * @param nom
     * @param contenu
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "depotDocument", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.DepotDocument")
    @ResponseWrapper(localName = "depotDocumentResponse", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.DepotDocumentResponse")
    @Action(input = "http://documentlibrary.url.org/DocumentLibraryWS/depotDocumentRequest", output = "http://documentlibrary.url.org/DocumentLibraryWS/depotDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://documentlibrary.url.org/DocumentLibraryWS/depotDocument/Fault/Exception")
    })
    public int depotDocument(
        @WebParam(name = "nom", targetNamespace = "")
        String nom,
        @WebParam(name = "contenu", targetNamespace = "")
        byte[] contenu)
        throws Exception_Exception
    ;

    /**
     * 
     * @param motsCles
     * @param condition
     * @return
     *     returns org.url.documentlibrary.DocumentMap
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rechercheDocument", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.RechercheDocument")
    @ResponseWrapper(localName = "rechercheDocumentResponse", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.RechercheDocumentResponse")
    @Action(input = "http://documentlibrary.url.org/DocumentLibraryWS/rechercheDocumentRequest", output = "http://documentlibrary.url.org/DocumentLibraryWS/rechercheDocumentResponse")
    public DocumentMap rechercheDocument(
        @WebParam(name = "motsCles", targetNamespace = "")
        List<String> motsCles,
        @WebParam(name = "condition", targetNamespace = "")
        String condition);

    /**
     * 
     * @param index
     * @return
     *     returns byte[]
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retourneDocument", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.RetourneDocument")
    @ResponseWrapper(localName = "retourneDocumentResponse", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.RetourneDocumentResponse")
    @Action(input = "http://documentlibrary.url.org/DocumentLibraryWS/retourneDocumentRequest", output = "http://documentlibrary.url.org/DocumentLibraryWS/retourneDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://documentlibrary.url.org/DocumentLibraryWS/retourneDocument/Fault/Exception")
    })
    public byte[] retourneDocument(
        @WebParam(name = "index", targetNamespace = "")
        int index)
        throws Exception_Exception
    ;

    /**
     * 
     * @param index
     * @return
     *     returns org.url.documentlibrary.Pdf
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generePDF", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.GenerePDF")
    @ResponseWrapper(localName = "generePDFResponse", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.GenerePDFResponse")
    @Action(input = "http://documentlibrary.url.org/DocumentLibraryWS/generePDFRequest", output = "http://documentlibrary.url.org/DocumentLibraryWS/generePDFResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://documentlibrary.url.org/DocumentLibraryWS/generePDF/Fault/Exception")
    })
    public Pdf generePDF(
        @WebParam(name = "index", targetNamespace = "")
        int index)
        throws Exception_Exception
    ;

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "arret", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.Arret")
    @ResponseWrapper(localName = "arretResponse", targetNamespace = "http://documentlibrary.url.org/", className = "org.url.documentlibrary.ArretResponse")
    @Action(input = "http://documentlibrary.url.org/DocumentLibraryWS/arretRequest", output = "http://documentlibrary.url.org/DocumentLibraryWS/arretResponse")
    public void arret();

}
