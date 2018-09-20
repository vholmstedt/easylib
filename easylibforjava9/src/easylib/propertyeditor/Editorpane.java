//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.propertyeditor;

import java.awt.GridLayout;
import java.util.Hashtable;
import java.util.Properties;

import javax.swing.JPanel;

class Editorpane extends JPanel {

	Hashtable<Object, Editor> rows = new Hashtable<Object, Editor>();

	Editorpane(String[][] strings) {
		setLayout(new GridLayout(strings.length + 2, 0));
		add(new JPanel()); // luft over
		for (String[] s : strings) {
			Editor e = new Editor(s[1], false);
			rows.put(s[0], e);
			add(e);
		}
		add(new JPanel()); // luft under
	}

	Properties getProperties() {
		Properties p = new Properties();
		for (Object key : rows.keySet()) {
			Editor e = rows.get(key);
			p.put(key, e.getValue());
		}
		return p;
	}

	void restore(Properties stored) {
		for (Object key : stored.keySet()) {
			rows.get(key).setValue(stored.get(key));
		}
	}

}
