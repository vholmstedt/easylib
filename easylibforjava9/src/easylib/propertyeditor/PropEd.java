//#SDP subject 2003 - 2018

/*

This file is part of the SDP project named easylib_for_java_9

University of South-Eastern Norway

Textbook: http://evalanche.hbv.no/pat
More information: https://sites.google.com/site/mitsoptew 

*/ 

/** author V: Holmstedt */


package easylib.propertyeditor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PropEd extends JFrame implements ActionListener {

	static private PropEd instance = null;

	static public PropEd getInstance(IProped p) {
		return (instance == null ? (instance = new PropEd(p)) : instance(p));
	}

	Editorpane editorpane;
	IProped iproped;
	
	private PropEd(IProped p) {
		iproped = p;
		setTitle("Egenskaper");
		JLabel header = new JLabel(p.getTitle(), JLabel.CENTER);
		header.setFont(new Font("sansserif", Font.PLAIN, 20));
		add(header, BorderLayout.NORTH);
		add(editorpane = new Editorpane(p.getList()));
		JButton lagre = new JButton(p.getAction());
		JButton avbryt = new JButton("Lukk");
		avbryt.addActionListener(this);
		JPanel kommandopanel = new JPanel(new GridLayout(0, 2));
		kommandopanel.add(lagre);
		kommandopanel.add(avbryt);
		add(kommandopanel, BorderLayout.SOUTH);		
		add(new JPanel(), BorderLayout.WEST); // marg
		add(new JPanel(), BorderLayout.EAST); // marg
		pack();
		setLocationRelativeTo(null); // sentrerer vinduet
	}

	static private PropEd instance(IProped p) {
		instance.setModel(p);
		return instance;
	}
	
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	}

	private void setModel(IProped p) {
		iproped = p;
		showProped();
	}

	public void showProped() {
		editorpane.restore(iproped.loadConfig());
		setVisible(true);
	}

	public Properties getProperties() {
		return editorpane.getProperties();
	}

}
