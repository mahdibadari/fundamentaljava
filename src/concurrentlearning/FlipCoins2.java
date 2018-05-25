package concurrentlearning;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

import javalearning2.CoinToss.Coin;

/** Second variation: main class implements Runnable.
 */

public class FlipCoins2 implements Runnable {
	int headShowed = 0;
	int tailShowed = 0;
  public FlipCoins2() {
	// Note that you cannot do tasks.execute(this) directly from main.
	// When you are in main, no instance of the surrounding class has
	// yet been created, so there *IS* no "this". So, here main calls
	// the constructor of the class, and that constructor does tasks.execute(this).
	  
	// Similarly, you cannot make
	// an instance of an inner class directly from main. Again, this is because
    // in main, the outer class has not yet been built.
	  
    int poolSize = 10;
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above

    ExecutorService tasklist = Executors.newFixedThreadPool(poolSize);
    for (int i = 0; i < 5; i++) {
    	tasklist.execute(this);
    }

	tasklist.shutdown();
    //TODO execute this 5 times (or several times) concurrently
    
    
    
    
    
    //TODO: do not forget to shutdown the executor
    
    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
  
	  for (int i=0; i<10; i++) {
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