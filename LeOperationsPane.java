///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeOperationsPane.java
// Description: This is part of the control pane of the 
//				program. It consists of buttons to interact 
//				with the ships. 
//								
////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LeOperationsPane extends JPanel{

   	public LeOperationsPane(){
	
	// setBorder (new LineBorder(Color.GREEN, 2));
	setLayout (new GridLayout(6,1));
	setBackground(Color.GRAY);

	//add label and buttons. 
	JLabel labelOperations = new JLabel ("Operations:");
	add (labelOperations);

	LeButton attackButton = new LeButton ("Attack");
	add (attackButton);
	LeButton stopButton = new LeButton ("Stop");
	add (stopButton);
	LeButton autodestroyButton = new LeButton ("Auto Destroy");
	add (autodestroyButton);
	LeButton selectButton = new LeButton ("Select Ship");
	add (selectButton);
	LeButton buyButton = new LeButton ("Buy Ships");
	add (buyButton);
	
	}

}

