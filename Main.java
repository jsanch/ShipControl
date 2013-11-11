///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: Main.java
// Description: Main file. In this all the classes come 
//				together and the layout is set
////////////////////////////////////////////////////////////


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class Main extends JFrame {
    public static void main (String [] args) {
	new Main ();
    }

    public Main () {
	
	// Window setup
    setTitle ("BattleShip Control System");
    setLocation (100, 100);
	setSize (1000, 500 );
	setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	// Container and layout setup
	Container content = getContentPane();
	content.setLayout (new BorderLayout()); 
	content.setBackground(new Color(47,79,79));

	// Putting the Menu Bar
	LeMenuBar leBar = new LeMenuBar();
	setJMenuBar (leBar.getmenuBar());


/* Canvas */ 
	// Putting the canvas in the center. 
	LeCanvas canvas = new LeCanvas ();
	content.add (canvas, BorderLayout.CENTER);
	
	//create map object. passing amount of ships and canvas to alter. 
	LeMap map = new LeMap (2, canvas); 

	//passing the map to the canvas so it knows who to draw from. 
	canvas.setMap(map); 

/* Controls */ 
	// Putting Top Pane ( a search bar)
 	LeInfoPane i = new LeInfoPane();
	content.add (i, BorderLayout.NORTH);

	// Putting the Bottom View Control Pane
	LeViewPane v = new LeViewPane(canvas);
   	content.add(v, BorderLayout.SOUTH);
   	
   	// Putting the  Operations Control Pane 
   	LeOperationsPane o = new LeOperationsPane(); 
   	content.add(o, BorderLayout.EAST);

   	// Putting Left Pane ( a scrollbar)
   	LeScrollBar s1 = new LeScrollBar ("VERTICAL");
	content.add (s1, BorderLayout.WEST);
	
/* Listener */ 

	// Show the window
	setVisible (true);
    }
}

