package com.synerzip.handler;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.synerzip.view.StudentForm;

// TODO: Auto-generated Javadoc
/**
 * The Class SmartWindowHandler.
 */
public class SmartWindowHandler extends WindowAdapter {

	/* (non-Javadoc)
	 * @see java.awt.event.WindowAdapter#windowClosing(java.awt.event.WindowEvent)
	 */
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		StudentForm studentForm = (StudentForm) e.getSource();
		studentForm.dispose();
	}
}
