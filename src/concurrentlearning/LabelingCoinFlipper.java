package concurrentlearning;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.*;

import javalearning2.CoinToss.Coin;

public class LabelingCoinFlipper implements Runnable {
  private JLabel label;

  public LabelingCoinFlipper(JLabel label) {
    label.setText(String.format("Heads: %3d", 0));
    this.label = label;
  }

  @Override
  public void run() {
	  int headShowed = 0;
		int tailShowed = 0;
    pause(200);
    for (int i = 0; i < 20; i++) {
    	Coin result = VALUES.get(RANDOM.nextInt(SIZE));
		if (result == Coin.HEADS) {
			headShowed++;
			//System.out.println("Heads: "+headShowed);
			label.setText("Heads: "+headShowed);
		  } else {
			 tailShowed++;
				//System.out.println("Tails: "+tailShowed);
				label.setText("Tails: "+tailShowed);
		  }
		pause(500);
    }
    
    
    //TODO: create 'for' loop 1000 times
  	//and also place counter in it.
  	//Print something like this:
  	//"Heads: 1!!"
  	//or like this"
  	//"Heads: 3"  
    //do not forget to add "pause(5);" after change the label text
    //so you could see the entire process
    
    
    
    
    
    
    
    
  }
  
  private static final List<Coin> VALUES = Arrays.asList(Coin.values());
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

  private static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch(InterruptedException ie) {}
  }
}
