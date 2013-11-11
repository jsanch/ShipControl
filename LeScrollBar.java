///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeScrollBar.java
// Description: This is a normal JScrollBar class with a 
//				Listener.  
//								
////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class LeScrollBar extends JScrollBar implements AdjustmentListener {

    public LeScrollBar (String orientation) {
    	setBackground(Color.GRAY);
    	if (orientation == "VERTICAL") {
			setOrientation (VERTICAL);
		}
		else if (orientation == "HORIZONTAL") {
			setOrientation (HORIZONTAL);
		}
		addAdjustmentListener (this);
    }

    public void adjustmentValueChanged (AdjustmentEvent event) {
	System.out.println ("Scrollbar: " + getValue());
    }
}