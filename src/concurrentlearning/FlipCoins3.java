package concurrentlearning;

import java.awt.*;
import java.util.concurrent.*;
import javax.swing.*;

public class FlipCoins3 extends JFrame {
  public FlipCoins3() {
    super("Flipping Coins");
    getContentPane().setLayout(new GridLayout(5, 1));
    
    int poolSize = 10;
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService tasklist = Executors.newFixedThreadPool(poolSize);

    
    for(int i=0; i<4; i++) {
      JLabel label = new JLabel();
      label.setFont(new Font("SansSerif", Font.PLAIN, 60));
      
      //TODO: add line to instantiate labelling coin flipper and execute it.
      tasklist.execute(new LabelingCoinFlipper(label));
      
      add(label);
    }    
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

	tasklist.shutdown();
  }
  
  public static void main(String[] args) {
    new FlipCoins3();
  }
}
