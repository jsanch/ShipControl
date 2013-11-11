///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeShip.java
// Description:  Abstract Class for ship objects. 
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//
public abstract class LeShip {
	/* Instance Variables */
	protected Rectangle position; 
	protected int direction;
	protected int speed;
	protected Color color; 
	protected String textlabel; 
	static protected int shipID  = 0; 

	// absract draw method to be modified for each ship. 
	public abstract void draw (Graphics g);

	/* General Ship Methods */
	protected void drawID(Graphics2D g,int id){
		//draws ShipID text label.
		String idstring = Integer.toString(id); 
		String str = "ship" + idstring;
		int xcord = (int)this.position.getX(); 
		int ycord = (int)this.position.getY(); 
		g.drawString(str,xcord,ycord);
	}


    /* getter functios */
    public Rectangle getPosition(){
    	return position;
    }

    public int getDirection(){
    	return direction;
    }

    public int getSpeed(){
    	return speed;
    }

    public Color getColor(){
    	return color;
    }

    /* setter functios */

    public void setPosition(Rectangle pos){
    	position = pos;
    }

    public void setDirection(int dir){
    	direction = dir;
    }

    public void setSpeed(int s){
    	speed = s;
    }
    public void setColor(Color c){
    	color = c;
    }


}