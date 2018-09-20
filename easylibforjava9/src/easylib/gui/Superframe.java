//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import easylib.controller.ISupercontroller;


public abstract class Superframe extends JFrame implements ISupercontroller {
	
	protected Southpane southpane = null;
	
	protected Superframe() {		
		add((southpane = new Southpane()), BorderLayout.SOUTH);		
		setSize(900, 450);
		setLocationRelativeTo(null);		
	}
		
	public void setStatustext(String message) {
		southpane.setStatustext(message);
	}

	public void exit() {
		System.exit(0);
	}

	public void about(String about) {
		JOptionPane.showMessageDialog(null,
		about, "Om programmet", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
