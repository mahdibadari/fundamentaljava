package concurrentlearning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App1 {
	public App1() {
		ExecutorService tasklist = Executors.newFixedThreadPool(100);
		tasklist.execute(new Counter(this,6));
		tasklist.execute(new Counter(this,5));
		tasklist.execute(new Counter(this,4));
		tasklist.shutdown();
	}

	public void pause(double seconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(Math.round(1000.0*seconds));
		} catch (InterruptedException ie){
			
		}
	}
}
