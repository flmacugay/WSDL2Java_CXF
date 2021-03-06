package com.student;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2014-11-23T00:35:30.490+11:00
 * Generated source version: 2.7.13
 * 
 */
@WebServiceClient(name = "ChangeStudentDetailsImplService", 
                  wsdlLocation = "ChangeStudent.wsdl",
                  targetNamespace = "http://student.com/") 
public class ChangeStudentDetailsImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://student.com/", "ChangeStudentDetailsImplService");
    public final static QName ChangeStudentDetailsImplPort = new QName("http://student.com/", "ChangeStudentDetailsImplPort");
    static {
        URL url = ChangeStudentDetailsImplService.class.getResource("ChangeStudent.wsdl");
        if (url == null) {
            url = ChangeStudentDetailsImplService.class.getClassLoader().getResource("ChangeStudent.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(ChangeStudentDetailsImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "ChangeStudent.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ChangeStudentDetailsImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ChangeStudentDetailsImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChangeStudentDetailsImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ChangeStudentDetailsImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ChangeStudentDetailsImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ChangeStudentDetailsImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ChangeStudentDetails
     */
    @WebEndpoint(name = "ChangeStudentDetailsImplPort")
    public ChangeStudentDetails getChangeStudentDetailsImplPort() {
        return super.getPort(ChangeStudentDetailsImplPort, ChangeStudentDetails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChangeStudentDetails
     */
    @WebEndpoint(name = "ChangeStudentDetailsImplPort")
    public ChangeStudentDetails getChangeStudentDetailsImplPort(WebServiceFeature... features) {
        return super.getPort(ChangeStudentDetailsImplPort, ChangeStudentDetails.class, features);
    }

}
