package com.tool;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class WSDLToJavaCodeGenerator {
	  public static void main(String[] args) {
		    try {
		      // you can also specify WSDL directly like http://localhost:8080/CXFTutorial/ChangeStudent?wsdl
		      WSDLToJava.main(new String[] { "-d", "src", "-b", "bindings.xml", "ChangeStudent.wsdl" });
		      //WSDLToJava.main(new String[] { "-d", "src", "ChangeStudent.wsdl" });
		      System.out.println("finished %%%%%%%%%%");
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

	  }
}
