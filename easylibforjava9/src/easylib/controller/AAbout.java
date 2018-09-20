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


class AAbout extends SuperAction {

	AAbout(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "om programmet");
		putValue(Action.LONG_DESCRIPTION, "versjon og annen relevant informasjon");
	}

	public void actionPerformed(ActionEvent e) {
		Supercontroller.about();
	}

}
