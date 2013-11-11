///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeViewPane.java
// Description: This Class is part of the control panel of 
//				the program and it's purpose is to enable
//				and disable different viees of the ships
//								
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


// public class LeViewPane extends JPanel implements ItemListener {
public class LeViewPane extends JPanel{
	public LeViewPane(LeCanvas c){ //passing canvas, bc, will alter it. 
	LeCanvas canvas = c; 
	setLayout (new FlowLayout());
	setBackground(Color.GRAY);

	/* panel 1 */
	//create a panel to hold label and checkboxes buttons. 
	JPanel panel1 = new JPanel();
	panel1.setLayout ( new GridLayout(1,5));
	panel1.setBackground(Color.GRAY);
	
	// Create a  label
	JLabel label = new JLabel ("Show on Radar:");

	// Create  CheckBoxes. 
	JCheckBox subCB = new JCheckBox ("Submarines", true);
	JCheckBox yatchCB = new JCheckBox ("Yatch", true);
	JCheckBox boatCB = new JCheckBox ("Boats", true);

	// Add the label to the panel. 
	panel1.add (label);

	// Add Checkboxes to the panel. 
	panel1.add (subCB);
	panel1.add (yatchCB);
	panel1.add (boatCB);


	// Create listener. 
	LeCanvas.CB_listener listener1 = canvas.new CB_listener(); 
	LeCanvas.CB_listener listener2 = canvas.new CB_listener(); 
	LeCanvas.CB_listener listener3 = canvas.new CB_listener(); 


	// register listeners 
	subCB.addItemListener(listener1); 
	yatchCB.addItemListener(listener2);
	boatCB.addItemListener(listener3);

	// add panel to the frame. 
	add (panel1);

	/* panel 2 */
	// create panel, label, and radio buttons : 
	JPanel panel2 = new JPanel();
	panel2.setBackground(Color.GRAY);

	JLabel label2 = new JLabel ("Toogle Backgrounds: ");

	JRadioButton rbGreen = new JRadioButton ("Green");
	JRadioButton rbWhite = new JRadioButton ("White");

	//Add them: 
	panel2.add(label2);
	panel2.add(rbGreen);
	panel2.add(rbWhite);

	// group radio buttons. 
	ButtonGroup group = new ButtonGroup();
	group.add(rbGreen);
	group.add(rbWhite);

	//set initial selected button
	rbGreen.setSelected(true);

	//Create Listeners : 
	LeCanvas.BackgroundColor_Listener bglistener1 = canvas.new BackgroundColor_Listener();
	LeCanvas.BackgroundColor_Listener bglistener2 = canvas.new BackgroundColor_Listener();
	//Register Listeners:
	rbGreen.addActionListener(bglistener1);
	rbWhite.addActionListener(bglistener2);

	//add panel to frame
	add (panel2); 
	}

}