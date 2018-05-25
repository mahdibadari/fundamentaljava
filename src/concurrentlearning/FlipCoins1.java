package concurrentlearning;

import java.util.concurrent.*;

public class FlipCoins1 {
  public static void main(String[] args) {
    int poolSize = 10;
    
    ExecutorService tasklist = Executors.newFixedThreadPool(poolSize);
	tasklist.execute(new CoinFlipper());
	tasklist.execute(new CoinFlipper());
	tasklist.execute(new CoinFlipper());
	tasklist.execute(new CoinFlipper());
	tasklist.execute(new CoinFlipper());
	tasklist.shutdown();
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    
    
    //TODO execute the CoinFlipper 5 times (or several times) concurrently 

    
    
    
    //TODO: do not forget to shutdown the executor
    
    
  }
  
  public void pause(double seconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(Math.round(1000.0*seconds));
		} catch (InterruptedException ie){
			
		}
	}
}
