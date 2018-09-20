//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */


package easylib.controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;


class AExit extends SuperAction {

	AExit(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Stopper programmet");
		putValue(Action.LONG_DESCRIPTION, "Lukker vindu og stopper programmet");
	}

	public void actionPerformed(ActionEvent e) {
		Supercontroller.exit();
	}

}
