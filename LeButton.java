///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeButton.java
// Description: This is a button with a Listener used by
//				buttons in LeOperationsPane.
//								
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class LeButton extends JButton implements ActionListener {
    public LeButton (String label) {
		setText (label);
		addActionListener (this);
    }

    public void actionPerformed (ActionEvent e) {
		System.out.println (getText() + " Button was pushed");
    }
}