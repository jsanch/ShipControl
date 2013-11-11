///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeYatch.java
// Description:  Extends the LeShip class.  
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.String.*;

public final class LeYatch extends LeShip {
	private  int id = 0 ; 

	LeYatch (){
		// "random" position
		position  = new Rectangle (46*shipID, 100, 30, 40);
		color = Color.YELLOW; 
		id = shipID++; 
	}

	public void draw (Graphics g) {
		// Converts to 2d gaphics.  
		Graphics2D g2 = (Graphics2D) g;
		drawYatch(g2);
		drawID(g2, id);
	}

	public void drawYatch(Graphics2D g2){
		g2.setColor(color);
		//temporary, while I come up with good drawing.
		g2.draw (position);
	}

}


