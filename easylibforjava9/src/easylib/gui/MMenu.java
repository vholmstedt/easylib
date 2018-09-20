//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.gui;

import javax.swing.JMenu;

import easylib.controller.SuperAction;

public class MMenu extends JMenu {

	public MMenu(String s) {
		super(s);
	}

	public void add(SuperAction a) {
		super.add(a).addMouseListener(a);
	}
}
