///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeBoat.java
// Description:  Extends the LeShip class.  
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.String.*;

public final class LeBoat extends LeShip {
	private  int id = 0 ; 

	LeBoat (){
		//"random" position
		position  = new Rectangle (100, 60*shipID, 40, 60);		
		color = Color.BLUE; 
		id = shipID++; 
	}

	public void draw (Graphics g) {
		// Coverts to 2D graphics. 
		Graphics2D g2 = (Graphics2D) g;
		drawBoat(g2);
		drawID(g2, id);
		}

	public void drawBoat(Graphics2D g2){
		g2.setColor(color);
		//temporary, while I come up with good drawing.
		g2.draw (position);
	}

}