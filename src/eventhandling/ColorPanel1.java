package eventhandling;

import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.*;

/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a separate class as the mouse listener concept
 */

public class ColorPanel1 extends JPanel {
  public ColorPanel1() {
    //TO DO
	//setBackground color as Red
	//call separate class that available (ColorListener.java) as the mouseListener
	  JButton button = new JButton("Click here!");
	  add(button);
	  setBackground( Color.RED );
	  MouseListener mouseListener = new ColorListener(this);
	  button.addMouseListener(mouseListener);
  }
  
  public void swapColors() {
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
	Color color = getBackground();
	if (color == Color.RED) {
		setBackground( Color.BLUE );
	} else {
		setBackground( Color.RED );
	}
  }
}