///////////////////////////////////////////////////////////
// Name:  Jaime Sanchez
// Email: jaime.sanechez@tufts.edu
// File: LeCanvas.java
// Description: This is the Canvas compponent. It Draws stuff.
////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LeCanvas extends JComponent {
  	// need to have map 
  	private LeMap map;

  	public enum ShipType {BOAT, YATCH, SUB};

  	public LeCanvas(){  
    	setBorder (new LineBorder(Color.CYAN, 2));
    }

    public void setMap (LeMap map){
    	this.map = map; 
    }
    
    public void paintComponent (Graphics g) {
		map.draw(g);
    }



    //	this is an inner class. it is accessible to other classes.
    // purpose: to create listeners all over the program
    //			with access to redrawing map. 
	class CB_listener implements  ItemListener {
		@Override 
		public void itemStateChanged (ItemEvent e) {
			JCheckBox cb = (JCheckBox)e.getItem(); 
			setVisibility(cb); 
			repaint(); 
		}
	    private void setVisibility(JCheckBox cb){
    		if( cb.getText() == "Yatch"){
	        	map.setYatchsVisibility (cb.isSelected()); 
	        }
	        if( cb.getText() == "Submarines"){
	        	map.setBoatsVisibility (cb.isSelected()); 
	        }
	        if( cb.getText() == "Boats"){
	        	map.setSubsVisibility (cb.isSelected()); 
	        }
  
		}
  	}
  	class BackgroundColor_Listener implements ActionListener { 
  		@Override
  		public void actionPerformed (ActionEvent e){
  			JRadioButton button = (JRadioButton) e.getSource();
  			if ( button.getText().equals("Green") ) {
  				System.out.println("change to green"); 
  				setOpaque(true);
  				setBackground(new Color(47,79,79)); 
  			} else {
  				System.out.println("change to white"); 
  				setOpaque(true);
				setBackground(Color.WHITE); 
  			}
  			repaint();
  		}
  	}
}
