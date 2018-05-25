package lambda;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SortingExamples {


	  // array containing a few Strings
	  public static String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
	  
	  public static String[] sortedByLengthAscending(){
		  String[] sortedByLengthAscending = words;
		  
		  /*
		   * TO DO
		   * Sort words by length (i.e., shortest to longest)
		   * 
		   */
		  Arrays.sort(sortedByLengthAscending, (a, b)->Integer.compare(a.length(), b.length()));
		  return sortedByLengthAscending;
	  }
	  
	  
	  public static String[] sortedByLengthDescending(){
		  String[] sortedByLengthDescending = words;
		  
		  /*
		   * TO DO
		   * Sort words by reverse length (i.e., longest to shortest)
		   * 
		   */
	      
	      Arrays.sort(sortedByLengthDescending, (a, b)->Integer.compare(b.length(), a.length()));
		  return sortedByLengthDescending;
				  
	  }
	  
	  public static String[] sortedByFirstLetter(){
		  String[] sortedByFirstLetter = words;
		  
		  /*
		   * TO DO
		   * Sort words alphabetically by the first character only
		   * 
		   */	
		  //sortedByFirstLetter.sort()
		  List<String> listOfProducts = Arrays.asList(sortedByFirstLetter);     
		  Collections.sort(listOfProducts, Collator.getInstance());
		  String[] reversed = listOfProducts.toArray(sortedByFirstLetter);
		  return reversed;
				  
	  }
	  
	  public static String[] sortedByContains(){
		  String[] sortedByContains = words;
		  
		  /*
		   * TO DO
		   * Sort words by whether it contains 'e'
		   * Strings that contain “e” first, everything else second
		   * Hint: use method StringUtils.eChecker
		   * 
		   */
		  Arrays.sort(sortedByContains, (a, b)->StringUtils.eChecker(a, b));
		  return sortedByContains;
				  
	  } 
	  
	}

