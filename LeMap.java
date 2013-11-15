///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeMap.java
// Description:This has all the logic. It instiatiantes some ships.
//				Tells the map what to draw.
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LeMap{
	// instiantiate a set of ships.
	private ArrayList<LeShip> ships = new ArrayList<LeShip> ();
    private LeCanvas canvas;

    //grid lines.
    private boolean Grid = true;

    //ship visibility
    private boolean Boats = true;
    private boolean Yatchs = true;
    private boolean Subs = true;

    public LeMap ( int n, LeCanvas canvas){
    	// passing canvas to this class
    	this.canvas = canvas;

    	// creating list of Ships.
	    for (int i=0; i<n; i++) {
		 ships.add (new LeSubmarine());
		 ships.add (new LeBoat());
		 ships.add (new LeYatch());
   		}
        for ( int i=0; i<n; i++){

        }
   	}

    public void addShip(Rectangle position, int direction,
                    int speed, String type){
        if (type == "Boat") ships.add(new LeBoat());
        if (type == "Yatch") ships.add(new LeYatch());
        if (type == "Sub") ships.add(new LeSubmarine());
    }

    public void drawGrid (Graphics g){
            // This adapts to the window size and changes when resized.
    		Dimension size = canvas.getSize();
    		for (int i = 0; i< size.width; i++){
    		g.setColor(Color.BLACK);
    		g.drawLine (i*20, 0, i*20, size.height);
    		g.drawLine (0, i*20, size.width, i*20);
    	}
    }
    public void draw( Graphics g){
        if (Grid)  drawGrid(g);
    	if (Yatchs) drawYatchs(g);
        if (Boats) drawBoats(g) ;
        if (Subs) drawSubs(g) ;


    }
    public void drawYatchs( Graphics g){
        for (LeShip s: ships){
            if (s instanceof LeYatch){
                s.draw(g);
            }
        }
    }
    public void drawBoats( Graphics g){
        for (LeShip s: ships){
            if (s instanceof LeBoat){
                s.draw(g);
            }
        }
    }
    public void drawSubs( Graphics g){
        for (LeShip s: ships){
            if (s instanceof LeSubmarine){
                s.draw(g);
            }
        }
    }


    /* Setter functions */

    void setYatchsVisibility (boolean b){
        Yatchs = b;
    }
    void setBoatsVisibility (boolean b){
        Boats = b;
    }
     void setSubsVisibility (boolean b){
        Subs = b;
    }



}
