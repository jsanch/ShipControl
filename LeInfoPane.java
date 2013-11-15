
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeInfoPane.java
// Description: This is the Class for the Info in the
//				program that is going to be displayed.
//				Also it is where the search bar is.
////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LeInfoPane extends JPanel {

   	public LeInfoPane(){

	   	setLayout( new FlowLayout());
	   	setBackground(Color.GRAY);

	   	JLabel title = new JLabel("Search Ship Data Base: ");
	   	add(title);

	   	LeSearch search = new LeSearch();
	   	add(search);

	}
}
