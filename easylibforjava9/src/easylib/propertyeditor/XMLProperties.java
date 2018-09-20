//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */


package easylib.propertyeditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

class XMLProperties  {
	
	static final String XMLFILE = "props.xml";

	static private Properties inputstream2properties(InputStream o) {
		Properties p = new Properties();
		try {
			p.loadFromXML(o);
			o.close();
		} catch (Exception e) {
		}
		return p;
	}
	
	public static boolean properties2xmlfile(Properties p) {
		try {
			OutputStream o = new FileOutputStream(new File(XMLFILE));
			p.storeToXML(o, null);
			o.close();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	public static Properties xmlfile2properties() {
		InputStream o = null;
		try {
			o = new FileInputStream(new File(XMLFILE)); // preferred
		} catch (FileNotFoundException e) {
			o = ClassLoader.getSystemResourceAsStream(XMLFILE); // default
		}
		return inputstream2properties(o);
	}

}
