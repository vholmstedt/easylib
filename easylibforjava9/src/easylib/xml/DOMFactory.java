//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.xml;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

public final class DOMFactory {

	private Document doc = null;
	private DocumentBuilder builder;
	private DOMImplementation impl;

	public DOMFactory(InputStream is) throws Exception {
		build();
		doc = builder.parse(is);
	}

	public DOMFactory(String nsuri, String aplic, String pub, String dtd)
			throws Exception {
		build();
		DocumentType dtype = impl.createDocumentType(aplic, pub, dtd);
		doc = impl.createDocument(nsuri, aplic, dtype);
	}

	private void build() throws Exception {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		f.setNamespaceAware(true);
		builder = f.newDocumentBuilder();
		impl = builder.getDOMImplementation();
	}

	public Document getDocument() {
		return doc;
	}

}
