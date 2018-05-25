package javalearning2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.management.RuntimeErrorException;

public class CoinToss {
	
	public int tossAmount;
	public static int headShowed = 0;
	public static int tailShowed = 0;
	public static int conHead = 0;
	public static int conTail = 0;
	public static int div;
	public static int percentage;
	public static int probability = 2; //50% probability
	
	public enum Coin {
	    HEADS, TAILS;
	}
	
	public CoinToss (int amount) {
		if (amount <= 0) {
			throw new RuntimeErrorException(null, "Coin Flip must be more than 0");
		}
		else {
			tossAmount = amount;
		}
	}
	
	private static final List<Coin> VALUES = Arrays.asList(Coin.values());
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static Coin flip() {
			Coin result = VALUES.get(RANDOM.nextInt(SIZE));
		
		  if (result == Coin.HEADS) {
			  if (headShowed < div) {
				  headShowed++;
				  conHead++;
				  conTail=0;
				  if (conHead > 2) {
					  System.out.println(conHead+" heads in a row");
				  }
				  return result;
			  } else if (tailShowed < div) {
				  tailShowed++;
				  conTail++; conHead=0;
				  if (conTail > 2) {
					  System.out.println(conTail+" tails in a row");
				  }
				  return Coin.TAILS;
			  } else {
				return result;  
			  }
		  } else {
			  if (tailShowed < div) {
				  tailShowed++;
				  conHead=0;
				  conTail++;
				  if (conTail > 2) {
					  System.out.println(conTail+" tails in a row");
				  }
				  return result;
			  } else if (headShowed < div) {
				  headShowed++;
				  conHead++;
				  conTail=0;
				  if (conHead > 2) {
					  System.out.println(conHead+" heads in a row");
				  }
				  return Coin.HEADS;
			  } else {
				  return result;
			  }
		  }		
	}
	
	public static void TossCoinbyAmount(int tossAmount) {
		div = tossAmount/probability;
		percentage = tossAmount%probability;
		for (int x = 0; x < tossAmount; x= x+1) {
			Coin result = flip();
			System.out.println(result.toString());
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinToss newToss = new CoinToss(20);
		TossCoinbyAmount(newToss.tossAmount);
	}

}
