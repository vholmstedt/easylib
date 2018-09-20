//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.propertyeditor;

import java.util.Properties;

abstract public class Configmodel implements IProped {

	abstract protected void properties2attributes(Properties p);

	public void storeConfig(Properties p) {
		if (XMLProperties.properties2xmlfile(p)) {
			properties2attributes(p);
		}
	}

	public Properties loadConfig() {
		Properties p = XMLProperties.xmlfile2properties();
		properties2attributes(p);
		return p;
	}

}
