
package org.url.documentlibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.url.documentlibrary package. 
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

    private final static QName _Exception_QNAME = new QName("http://documentlibrary.url.org/", "Exception");
    private final static QName _DepotDocument_QNAME = new QName("http://documentlibrary.url.org/", "depotDocument");
    private final static QName _RechercheDocument_QNAME = new QName("http://documentlibrary.url.org/", "rechercheDocument");
    private final static QName _Arret_QNAME = new QName("http://documentlibrary.url.org/", "arret");
    private final static QName _DemarrageResponse_QNAME = new QName("http://documentlibrary.url.org/", "demarrageResponse");
    private final static QName _RetourneDocument_QNAME = new QName("http://documentlibrary.url.org/", "retourneDocument");
    private final static QName _RetourneDocumentResponse_QNAME = new QName("http://documentlibrary.url.org/", "retourneDocumentResponse");
    private final static QName _GenerePDFResponse_QNAME = new QName("http://documentlibrary.url.org/", "generePDFResponse");
    private final static QName _RechercheDocumentResponse_QNAME = new QName("http://documentlibrary.url.org/", "rechercheDocumentResponse");
    private final static QName _ArretResponse_QNAME = new QName("http://documentlibrary.url.org/", "arretResponse");
    private final static QName _DepotDocumentResponse_QNAME = new QName("http://documentlibrary.url.org/", "depotDocumentResponse");
    private final static QName _Demarrage_QNAME = new QName("http://documentlibrary.url.org/", "demarrage");
    private final static QName _GenerePDF_QNAME = new QName("http://documentlibrary.url.org/", "generePDF");
    private final static QName _RetourneDocumentResponseReturn_QNAME = new QName("", "return");
    private final static QName _DepotDocumentContenu_QNAME = new QName("", "contenu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.url.documentlibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentMap }
     * 
     */
    public DocumentMap createDocumentMap() {
        return new DocumentMap();
    }

    /**
     * Create an instance of {@link DocumentMap.RealMap }
     * 
     */
    public DocumentMap.RealMap createDocumentMapRealMap() {
        return new DocumentMap.RealMap();
    }

    /**
     * Create an instance of {@link RechercheDocument }
     * 
     */
    public RechercheDocument createRechercheDocument() {
        return new RechercheDocument();
    }

    /**
     * Create an instance of {@link DepotDocument }
     * 
     */
    public DepotDocument createDepotDocument() {
        return new DepotDocument();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Demarrage }
     * 
     */
    public Demarrage createDemarrage() {
        return new Demarrage();
    }

    /**
     * Create an instance of {@link GenerePDF }
     * 
     */
    public GenerePDF createGenerePDF() {
        return new GenerePDF();
    }

    /**
     * Create an instance of {@link GenerePDFResponse }
     * 
     */
    public GenerePDFResponse createGenerePDFResponse() {
        return new GenerePDFResponse();
    }

    /**
     * Create an instance of {@link RechercheDocumentResponse }
     * 
     */
    public RechercheDocumentResponse createRechercheDocumentResponse() {
        return new RechercheDocumentResponse();
    }

    /**
     * Create an instance of {@link ArretResponse }
     * 
     */
    public ArretResponse createArretResponse() {
        return new ArretResponse();
    }

    /**
     * Create an instance of {@link DepotDocumentResponse }
     * 
     */
    public DepotDocumentResponse createDepotDocumentResponse() {
        return new DepotDocumentResponse();
    }

    /**
     * Create an instance of {@link Arret }
     * 
     */
    public Arret createArret() {
        return new Arret();
    }

    /**
     * Create an instance of {@link DemarrageResponse }
     * 
     */
    public DemarrageResponse createDemarrageResponse() {
        return new DemarrageResponse();
    }

    /**
     * Create an instance of {@link RetourneDocument }
     * 
     */
    public RetourneDocument createRetourneDocument() {
        return new RetourneDocument();
    }

    /**
     * Create an instance of {@link RetourneDocumentResponse }
     * 
     */
    public RetourneDocumentResponse createRetourneDocumentResponse() {
        return new RetourneDocumentResponse();
    }

    /**
     * Create an instance of {@link Pdf }
     * 
     */
    public Pdf createPdf() {
        return new Pdf();
    }

    /**
     * Create an instance of {@link DocumentMap.RealMap.Entry }
     * 
     */
    public DocumentMap.RealMap.Entry createDocumentMapRealMapEntry() {
        return new DocumentMap.RealMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepotDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "depotDocument")
    public JAXBElement<DepotDocument> createDepotDocument(DepotDocument value) {
        return new JAXBElement<DepotDocument>(_DepotDocument_QNAME, DepotDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "rechercheDocument")
    public JAXBElement<RechercheDocument> createRechercheDocument(RechercheDocument value) {
        return new JAXBElement<RechercheDocument>(_RechercheDocument_QNAME, RechercheDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "arret")
    public JAXBElement<Arret> createArret(Arret value) {
        return new JAXBElement<Arret>(_Arret_QNAME, Arret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemarrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "demarrageResponse")
    public JAXBElement<DemarrageResponse> createDemarrageResponse(DemarrageResponse value) {
        return new JAXBElement<DemarrageResponse>(_DemarrageResponse_QNAME, DemarrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetourneDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "retourneDocument")
    public JAXBElement<RetourneDocument> createRetourneDocument(RetourneDocument value) {
        return new JAXBElement<RetourneDocument>(_RetourneDocument_QNAME, RetourneDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetourneDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "retourneDocumentResponse")
    public JAXBElement<RetourneDocumentResponse> createRetourneDocumentResponse(RetourneDocumentResponse value) {
        return new JAXBElement<RetourneDocumentResponse>(_RetourneDocumentResponse_QNAME, RetourneDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerePDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "generePDFResponse")
    public JAXBElement<GenerePDFResponse> createGenerePDFResponse(GenerePDFResponse value) {
        return new JAXBElement<GenerePDFResponse>(_GenerePDFResponse_QNAME, GenerePDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "rechercheDocumentResponse")
    public JAXBElement<RechercheDocumentResponse> createRechercheDocumentResponse(RechercheDocumentResponse value) {
        return new JAXBElement<RechercheDocumentResponse>(_RechercheDocumentResponse_QNAME, RechercheDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "arretResponse")
    public JAXBElement<ArretResponse> createArretResponse(ArretResponse value) {
        return new JAXBElement<ArretResponse>(_ArretResponse_QNAME, ArretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepotDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "depotDocumentResponse")
    public JAXBElement<DepotDocumentResponse> createDepotDocumentResponse(DepotDocumentResponse value) {
        return new JAXBElement<DepotDocumentResponse>(_DepotDocumentResponse_QNAME, DepotDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Demarrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "demarrage")
    public JAXBElement<Demarrage> createDemarrage(Demarrage value) {
        return new JAXBElement<Demarrage>(_Demarrage_QNAME, Demarrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerePDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://documentlibrary.url.org/", name = "generePDF")
    public JAXBElement<GenerePDF> createGenerePDF(GenerePDF value) {
        return new JAXBElement<GenerePDF>(_GenerePDF_QNAME, GenerePDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RetourneDocumentResponse.class)
    public JAXBElement<byte[]> createRetourneDocumentResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_RetourneDocumentResponseReturn_QNAME, byte[].class, RetourneDocumentResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contenu", scope = DepotDocument.class)
    public JAXBElement<byte[]> createDepotDocumentContenu(byte[] value) {
        return new JAXBElement<byte[]>(_DepotDocumentContenu_QNAME, byte[].class, DepotDocument.class, ((byte[]) value));
    }

}
