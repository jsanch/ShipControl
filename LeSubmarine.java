///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeSubmarine.java
// Description:  Extends the LeShip class.  
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.String.*;

public final class LeSubmarine extends LeShip {
	private  int id = 0 ; //this is the local ID. 

	LeSubmarine (){
		// "random" position. should pass this in the fut.
		position  = new Rectangle (10*shipID + 300, 50*shipID + 200, 90, 60);
		color = Color.RED;
		id = shipID++; 
	}

	public void draw (Graphics g) {
		// Converts to 2d gaphics. 
		Graphics2D g2 = (Graphics2D) g;
		drawSubmarine(g2); 
		drawID(g2, id); 
		}

	public void drawSubmarine(Graphics2D g2){
		g2.setColor(color);
		//temporary, while I come up with good drawing.
		g2.draw (position);
	}

}