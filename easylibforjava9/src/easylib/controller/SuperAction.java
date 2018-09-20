//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */


package easylib.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.Action;


abstract public class SuperAction extends AbstractAction implements
		MouseListener {

	protected SuperAction(Usecase u) {
		putValue(Action.NAME, u.name);
		putValue(Action.SMALL_ICON, u.icon);		
	}
	
	public String longDescription() {
		return getValue(Action.LONG_DESCRIPTION).toString();
	}
	
	public void mouseExited(MouseEvent e) {
		Supercontroller.setStatustext("");
	}

	public void mouseEntered(MouseEvent evt) {		
		Supercontroller.setStatustext(longDescription());
	}
	
	public void mouseClicked(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

}
