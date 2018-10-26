
package org.me.imatge;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.imatge package. 
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

    private final static QName _ListImatges_QNAME = new QName("http://imatge.me.org/", "listImatges");
    private final static QName _ListImatgesResponse_QNAME = new QName("http://imatge.me.org/", "listImatgesResponse");
    private final static QName _ModifyImatge_QNAME = new QName("http://imatge.me.org/", "modifyImatge");
    private final static QName _ModifyImatgeResponse_QNAME = new QName("http://imatge.me.org/", "modifyImatgeResponse");
    private final static QName _RegistreImatge_QNAME = new QName("http://imatge.me.org/", "registreImatge");
    private final static QName _RegistreImatgeResponse_QNAME = new QName("http://imatge.me.org/", "registreImatgeResponse");
    private final static QName _SearchByAutor_QNAME = new QName("http://imatge.me.org/", "searchByAutor");
    private final static QName _SearchByAutorResponse_QNAME = new QName("http://imatge.me.org/", "searchByAutorResponse");
    private final static QName _SearchByDate_QNAME = new QName("http://imatge.me.org/", "searchByDate");
    private final static QName _SearchByDateResponse_QNAME = new QName("http://imatge.me.org/", "searchByDateResponse");
    private final static QName _SearchById_QNAME = new QName("http://imatge.me.org/", "searchById");
    private final static QName _SearchByIdResponse_QNAME = new QName("http://imatge.me.org/", "searchByIdResponse");
    private final static QName _SearchByKeywords_QNAME = new QName("http://imatge.me.org/", "searchByKeywords");
    private final static QName _SearchByKeywordsResponse_QNAME = new QName("http://imatge.me.org/", "searchByKeywordsResponse");
    private final static QName _SearchByTitle_QNAME = new QName("http://imatge.me.org/", "searchByTitle");
    private final static QName _SearchByTitleResponse_QNAME = new QName("http://imatge.me.org/", "searchByTitleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.imatge
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListImatges }
     * 
     */
    public ListImatges createListImatges() {
        return new ListImatges();
    }

    /**
     * Create an instance of {@link ListImatgesResponse }
     * 
     */
    public ListImatgesResponse createListImatgesResponse() {
        return new ListImatgesResponse();
    }

    /**
     * Create an instance of {@link ModifyImatge }
     * 
     */
    public ModifyImatge createModifyImatge() {
        return new ModifyImatge();
    }

    /**
     * Create an instance of {@link ModifyImatgeResponse }
     * 
     */
    public ModifyImatgeResponse createModifyImatgeResponse() {
        return new ModifyImatgeResponse();
    }

    /**
     * Create an instance of {@link RegistreImatge }
     * 
     */
    public RegistreImatge createRegistreImatge() {
        return new RegistreImatge();
    }

    /**
     * Create an instance of {@link RegistreImatgeResponse }
     * 
     */
    public RegistreImatgeResponse createRegistreImatgeResponse() {
        return new RegistreImatgeResponse();
    }

    /**
     * Create an instance of {@link SearchByAutor }
     * 
     */
    public SearchByAutor createSearchByAutor() {
        return new SearchByAutor();
    }

    /**
     * Create an instance of {@link SearchByAutorResponse }
     * 
     */
    public SearchByAutorResponse createSearchByAutorResponse() {
        return new SearchByAutorResponse();
    }

    /**
     * Create an instance of {@link SearchByDate }
     * 
     */
    public SearchByDate createSearchByDate() {
        return new SearchByDate();
    }

    /**
     * Create an instance of {@link SearchByDateResponse }
     * 
     */
    public SearchByDateResponse createSearchByDateResponse() {
        return new SearchByDateResponse();
    }

    /**
     * Create an instance of {@link SearchById }
     * 
     */
    public SearchById createSearchById() {
        return new SearchById();
    }

    /**
     * Create an instance of {@link SearchByIdResponse }
     * 
     */
    public SearchByIdResponse createSearchByIdResponse() {
        return new SearchByIdResponse();
    }

    /**
     * Create an instance of {@link SearchByKeywords }
     * 
     */
    public SearchByKeywords createSearchByKeywords() {
        return new SearchByKeywords();
    }

    /**
     * Create an instance of {@link SearchByKeywordsResponse }
     * 
     */
    public SearchByKeywordsResponse createSearchByKeywordsResponse() {
        return new SearchByKeywordsResponse();
    }

    /**
     * Create an instance of {@link SearchByTitle }
     * 
     */
    public SearchByTitle createSearchByTitle() {
        return new SearchByTitle();
    }

    /**
     * Create an instance of {@link SearchByTitleResponse }
     * 
     */
    public SearchByTitleResponse createSearchByTitleResponse() {
        return new SearchByTitleResponse();
    }

    /**
     * Create an instance of {@link Imatge }
     * 
     */
    public Imatge createImatge() {
        return new Imatge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListImatges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "listImatges")
    public JAXBElement<ListImatges> createListImatges(ListImatges value) {
        return new JAXBElement<ListImatges>(_ListImatges_QNAME, ListImatges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListImatgesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "listImatgesResponse")
    public JAXBElement<ListImatgesResponse> createListImatgesResponse(ListImatgesResponse value) {
        return new JAXBElement<ListImatgesResponse>(_ListImatgesResponse_QNAME, ListImatgesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyImatge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "modifyImatge")
    public JAXBElement<ModifyImatge> createModifyImatge(ModifyImatge value) {
        return new JAXBElement<ModifyImatge>(_ModifyImatge_QNAME, ModifyImatge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyImatgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "modifyImatgeResponse")
    public JAXBElement<ModifyImatgeResponse> createModifyImatgeResponse(ModifyImatgeResponse value) {
        return new JAXBElement<ModifyImatgeResponse>(_ModifyImatgeResponse_QNAME, ModifyImatgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreImatge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "registreImatge")
    public JAXBElement<RegistreImatge> createRegistreImatge(RegistreImatge value) {
        return new JAXBElement<RegistreImatge>(_RegistreImatge_QNAME, RegistreImatge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreImatgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "registreImatgeResponse")
    public JAXBElement<RegistreImatgeResponse> createRegistreImatgeResponse(RegistreImatgeResponse value) {
        return new JAXBElement<RegistreImatgeResponse>(_RegistreImatgeResponse_QNAME, RegistreImatgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByAutor")
    public JAXBElement<SearchByAutor> createSearchByAutor(SearchByAutor value) {
        return new JAXBElement<SearchByAutor>(_SearchByAutor_QNAME, SearchByAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByAutorResponse")
    public JAXBElement<SearchByAutorResponse> createSearchByAutorResponse(SearchByAutorResponse value) {
        return new JAXBElement<SearchByAutorResponse>(_SearchByAutorResponse_QNAME, SearchByAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByDate")
    public JAXBElement<SearchByDate> createSearchByDate(SearchByDate value) {
        return new JAXBElement<SearchByDate>(_SearchByDate_QNAME, SearchByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByDateResponse")
    public JAXBElement<SearchByDateResponse> createSearchByDateResponse(SearchByDateResponse value) {
        return new JAXBElement<SearchByDateResponse>(_SearchByDateResponse_QNAME, SearchByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchById")
    public JAXBElement<SearchById> createSearchById(SearchById value) {
        return new JAXBElement<SearchById>(_SearchById_QNAME, SearchById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByIdResponse")
    public JAXBElement<SearchByIdResponse> createSearchByIdResponse(SearchByIdResponse value) {
        return new JAXBElement<SearchByIdResponse>(_SearchByIdResponse_QNAME, SearchByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByKeywords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByKeywords")
    public JAXBElement<SearchByKeywords> createSearchByKeywords(SearchByKeywords value) {
        return new JAXBElement<SearchByKeywords>(_SearchByKeywords_QNAME, SearchByKeywords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByKeywordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByKeywordsResponse")
    public JAXBElement<SearchByKeywordsResponse> createSearchByKeywordsResponse(SearchByKeywordsResponse value) {
        return new JAXBElement<SearchByKeywordsResponse>(_SearchByKeywordsResponse_QNAME, SearchByKeywordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByTitle")
    public JAXBElement<SearchByTitle> createSearchByTitle(SearchByTitle value) {
        return new JAXBElement<SearchByTitle>(_SearchByTitle_QNAME, SearchByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imatge.me.org/", name = "searchByTitleResponse")
    public JAXBElement<SearchByTitleResponse> createSearchByTitleResponse(SearchByTitleResponse value) {
        return new JAXBElement<SearchByTitleResponse>(_SearchByTitleResponse_QNAME, SearchByTitleResponse.class, null, value);
    }

}
