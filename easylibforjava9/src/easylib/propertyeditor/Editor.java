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

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class Editor extends JPanel {

	private JTextField textfield;

	Editor(String ex, boolean ispassw) {
		setLayout(new GridLayout(1, 0));
		add(new JLabel(ex + ": ", JLabel.RIGHT));
		textfield = (ispassw ? new JPasswordField() : new JTextField());
		add(textfield);
	}

	String getValue() {
		return noEndslash(textfield.getText());
	}

	void setValue(Object s) {
		textfield.setText(noEndslash(s));
	}

	private String noEndslash(Object s) {
		String r = s.toString().trim();
		while (r.endsWith("/") || r.endsWith(" ")) {
			r = r.substring(0, r.length() - 1);
		}
		return r;
	}
}
