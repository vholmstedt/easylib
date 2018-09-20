//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */

package easylib.controller;

import javax.swing.ImageIcon;

interface ISuperlist {
	Usecase EXIT = new Usecase("avslutt", new ImageIcon("exit.png"));
	Usecase ABOUT = new Usecase("om", null);	
}
