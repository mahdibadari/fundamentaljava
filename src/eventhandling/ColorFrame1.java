package eventhandling;

import javax.swing.*;

/*
 * Class main to run the ColorPanel1
 */
public class ColorFrame1 extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = -6726479237585379336L;

public ColorFrame1() {
    super("Separate Class as MouseListener");
    setContentPane(new ColorPanel1());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame1();
  }
}

