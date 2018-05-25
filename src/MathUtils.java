
import java.util.*;
import java.util.concurrent.*;

public class MathUtils {
  private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
  public static void markPrimesSerial(boolean[] primeFlags, 
                                      int lowerIndex, int upperIndex) {
	  // To Do : One simple line of code that uses Primes.isPrime
	  for (int i = lowerIndex; i < upperIndex; i++) {
		  primeFlags[i] = Primes.isPrime(i);
	  }
  }
  
  /** Marks each entry i with true or false depending on
   *  whether i is prime or not. Serial version that
   *  marks all entries in the array.
   */
  public static void markPrimesSerial(boolean[] primeFlags) {
    markPrimesSerial(primeFlags, 0, primeFlags.length-1);
  }
  
  /** Marks each entry i with true or false depending on
   *  whether i is prime or not. Parallel version that
   *  marks all entries in the array.
   */
  public static void markPrimesParallel(boolean[] primeFlags) {
	  // To Do : create parallel version of mark primes
	  //ParallelPrimeMarker left = new ParallelPrimeMarker(primeFlags, 0, (primeFlags.length/2)-1);
	  //ParallelPrimeMarker right = new ParallelPrimeMarker(primeFlags, primeFlags.length/2, primeFlags.length-1);
	  //markPrimesSerial(primeFlags, 0, (primeFlags.length/2)-1);
	  //markPrimesSerial(primeFlags, primeFlags.length/2, primeFlags.length-1);
	  ParallelPrimeMarker mark = new ParallelPrimeMarker(primeFlags, 0, primeFlags.length-1);
	  mark.compute();
  }
  
  /** Given an already-marked boolean[] of flags that says
   *  whether each index is prime or not, produces a List
   *  of the primes. Used by both the serial and parallel versions.
   */
  public static List<Integer> collectPrimes(boolean[] primeFlags) {
	  // To Do : collect and return list of marked prime numbers from array
	  List<Integer> result = new ArrayList<Integer>();
	  int i = 0;
	  for (boolean primed: primeFlags) {
		  if (primed) {
			 result.add(i); 
		  }
		  i++;
	  }
	  return result;
  }
  
  /** Given an unmarked boolean[] of flags, serially marks each one saying
   *  whether the index is prime or not, then passes that array
   *  to collectPrimes to produce a List of primes. The version where
   *  you pass in the array (here) was split into a separate method so that,
   *  for timing purposes, you can separate the time of making the array
   *  from the time of marking it.
   */
  
  public static List<Integer> findPrimesSerial(boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
	  markPrimesSerial(primeFlags);
	  List<Integer> result = new ArrayList<Integer>();
	  int i = 0;
	  for (boolean primed: primeFlags) {
		  if (primed) {
			 result.add(i); 
		  }
		  i++;
	  }
	  return result;
  }
  
  /** Uses findPrimesSerial(booleanArray) to produce a List of primes
   *  less than the given size. */
  
  public static List<Integer> findPrimesSerial(int size) {
	// To Do : collect and return list of marked prime numbers from given only the size
	  boolean[] primeFlags = new boolean[size];
	  markPrimesSerial(primeFlags);
	  List<Integer> result = new ArrayList<Integer>();
	  int i = 0;
	  for (boolean primed: primeFlags) {
		  if (primed) {
			 result.add(i); 
		  }
		  i++;
	  }
	  return result;
  }
  
  /** Given an unmarked boolean[] of flags, marks each one in parallel, saying
   *  whether the index is prime or not, then passes that array
   *  to collectPrimes to produce a List of primes. The version where
   *  you pass in the array (here) was split into a separate method so that,
   *  for timing purposes, you can separate the time of making the array
   *  from the time of marking it.
   */
  
  public static List<Integer> findPrimesParallel(boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
	  markPrimesParallel(primeFlags);
	  List<Integer> result = new ArrayList<Integer>();
	  int i = 0;
	  for (boolean primed: primeFlags) {
		  if (primed) {
			 result.add(i); 
		  }
		  i++;
	  }
	  return result;
  }
  
  /** Uses findPrimesParallel(booleanArray) to produce a List of primes
   *  less than the given size. */
  
  public static List<Integer> findPrimesParallel(int size) {
    // To Do : collect and return list of marked prime numbers from given only the size
	  boolean[] primeFlags = new boolean[size];
	  markPrimesParallel(primeFlags);
	  List<Integer> result = new ArrayList<Integer>();
	  int i = 0;
	  for (boolean primed: primeFlags) {
		  if (primed) {
			 result.add(i); 
		  }
		  i++;
	  }
	  return result;
  }
  
}

