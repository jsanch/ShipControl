///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeSearch.java
// Description: This Class is used by LeInfoPan. This is the 
//				text field used in the search bar. 
//								
////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class LeSearch extends JTextField implements ActionListener {
    
    public LeSearch () {
		super ("", 20);
		addActionListener (this);
    }

    public void actionPerformed (ActionEvent e) {
		System.out.println ("Text: " + e.getActionCommand());
    }
}