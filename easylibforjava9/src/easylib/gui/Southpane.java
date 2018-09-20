//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */


package easylib.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author segovia
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
class Southpane extends JPanel {

	private JLabel status;

	Southpane() {
		setLayout(new GridLayout(1, 0));
		setBackground(Color.YELLOW);
		(status = new JLabel("", JLabel.CENTER)).setOpaque(false);
		status.setBorder(BorderFactory.createEtchedBorder());
		status.setFont(new Font("sansserif", Font.PLAIN, 12));
		add(status);
	}

	public void setStatustext(String message) {
		status.setText(message);
	}

}
