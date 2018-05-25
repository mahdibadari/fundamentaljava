package concurrentlearning;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javalearning2.CoinToss.Coin;

public class CoinFlipper implements Runnable {

	int headShowed = 0;
	int tailShowed = 0;
	  @Override
	  public void run() {
		//TODO: create 'for' loop 1000 times
		//and also place counter in it.
		//each time number in counter >= 3, print something like this:
		//"Pool-1-thread-1 got 3 heads in a row!!"
		//or like this"
		//"Pool-1-thread-2 got 5 heads in a row!!"  
			for (int i=0; i<50; i++) {
				Coin result = VALUES.get(RANDOM.nextInt(SIZE));
				String nothing = "";
				if (result == Coin.HEADS) {
					headShowed++;
					tailShowed = 0;
				  } else {
					 tailShowed++;
					 headShowed = 0;
				  }
				if (headShowed > 2) {
					nothing = "got "+headShowed+" heads in a row!!";
				}
				if (tailShowed > 2) {
					nothing = "got "+tailShowed+" tails in a row!!";
				}
				String threadName = Thread.currentThread().getName();
				if (!nothing.equals("")) {			  		
			  		System.out.printf("%s %s%n", threadName, nothing);
		  		}
				pause(Math.random());
		  	}	  
	  }
	  
	  private static final List<Coin> VALUES = Arrays.asList(Coin.values());
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();
		
		public void pause(double seconds) {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(Math.round(1000.0*seconds));
			} catch (InterruptedException ie){
				
			}
		}
}
