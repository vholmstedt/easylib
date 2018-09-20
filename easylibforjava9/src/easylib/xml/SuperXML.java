//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.xml;

import java.io.File;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SuperXML {

	protected Document document;
	protected DOMFactory helper;
	protected Element root;

	protected void save(String filename) {
		 DOMSource source = new DOMSource(document);
		 StreamResult file = new StreamResult(new File(filename));
		 TransformerFactory transformerFactory = TransformerFactory.newInstance();
		 
         try {
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "utf8");
			 transformer.transform(source, file);
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	public Document getDocument() {
		return document;
	}

}
