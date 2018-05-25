package javalearning2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
	
  public static List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");  
  
  public static void printWordsWithSpace(){
	
	  /*
	   * TO DO
	   * Loop down the words and print each on a separate line, with two spaces in front of each word.
	   * Don’t use map.
	   * 
	   */ 
	  String wordList = "";
	  for (String word : words) {
		  wordList = wordList+"  "+word+"\n";
	  }
	  //System.out.println(wordList);
	  words.forEach(x -> System.out.println("  "+x));
  }
  
  public static void printWordsNoSpace(){
		
	  /*
	   * TO DO
	   * Repeat the previous problem, but without the two spaces in front. 
	   * This is trivial if you use the same
	   * approach as in #1, so the point is to use a method reference here, 
	   * as opposed to an explicit lambda in problem 1.
	   * 
	   */	
	  String wordList = "";
	  for (String word : words) {
		  wordList = wordList+word+"\n";
	  }
	  words.forEach(System.out::println);
  }
  
  public static List<String> excitingWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
	   * but this time use streams and the builtin “map” method.
	   * 
	   */  
	  List<String> wordList = words.stream().map(n -> n+"!").collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 
  }
  
  public static List<String> eyeWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
	   * but this time use streams and the builtin “map” method.
	   * 
	   */  
	  List<String> wordList = words.stream().map(n -> n.replace("i", "eye")).collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 
  }
  
  public static List<String> upperCaseWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
	   * but this time use streams and the builtin “map” method.
	   * 
	   */  
	  List<String> wordList = words.stream().map(String::toUpperCase).collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 
  }
  
  public static List<String> shortWordsStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
	   * but this time use “filter”
	   * 
	   */  
	  List<String> wordList = words.stream().filter(n -> n.length() < 4).collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 

	  
  }
  
  public static List<String> wordsWithBStreams(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
	   * but this time use “filter”
	   * 
	   */  
	  List<String> wordList = words.stream().filter(n -> n.contains("b")).collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 
  }
  
  public static List<String> evenLengthWords(){
	  
	  /*
	   * TO DO
	   * Produce the same lists as 
	   * List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
	   * but this time use “filter”
	   * 
	   */  
	  List<String> wordList = words.stream().filter(n -> (n.length() % 2) ==0 ).collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 
  }
  
  public static List<String> firstFunnyString(String containedTest) {
	  
	  /*
	   * TO DO
	   * Turn the strings into uppercase, 
	   * keep only the ones that are shorter than 4 characters, of what is remaining, 
	   * keep only the ones that contain containedTest arg,
	   * and return string "No Match" when no result.
	   */
	  List<String> wordList = words.stream().map(String::toUpperCase).filter(n -> n.length() < 4).filter(n -> n.contains(containedTest)).collect(Collectors.toList());
	  //System.out.println(wordList);
	  return wordList; 
  }
  
  
  public static String[] wordsAsArray() {
	  
	 /* 
	  * TO DO
	  * Create output the final result of words as an array instead of a List
	  * 
	  */
	  String[] stringArray = words.stream().toArray(size -> new String[size]);
	  //Arrays.stream(stringArray).forEach(System.out::println);
	  return stringArray;
  }
  
  public static void main(String[] args) {
	  //printWordsWithSpace();
	  //printWordsNoSpace();
	  //excitingWordsStreams();
	  //eyeWordsStreams();
	  //upperCaseWordsStreams();
	  //shortWordsStreams();
	  //wordsWithBStreams();
	  //evenLengthWords();
	  //firstFunnyString("H");
	  //wordsAsArray();
  }
  
}
