//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.controller;


public class Supercontroller implements ISuperlist {

	public static SuperAction aabout;
	public static SuperAction aexit;
	protected static ISupercontroller ui;

	protected static void superinit(ISupercontroller ui) {
		Supercontroller.ui = ui;
		aexit = new AExit(EXIT);
		aabout = new AAbout(ABOUT);
	}

	public static void about() {
		ui.about();
	}

	public static void exit() {
		ui.exit();
	}
	
	public static void setStatustext(String s) {
		ui.setStatustext(s);
	}

}
