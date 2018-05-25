package javalearning2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.management.RuntimeErrorException;

public class RectangleOperation {
	public static double smallest;
	public static double largest;
	public static double sum = 0;
	public static Rectangle smallestRect;
	public static Rectangle largestRect;
	public static String dimensionList = "";
	public static List<Rectangle> setRandomRectangle(int amountofRect){
		//circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		if (amountofRect <= 0) {
			throw new RuntimeErrorException(null, "Amount of rectangles wanted must be more than 0. Amount user inputted: " +amountofRect);
		} else {
		List<Rectangle> rectangles = new ArrayList<>();
		 for(int x = 0; x < amountofRect; x = x + 1) {
         Random r1 = new Random();
         Random r2 = new Random();
         while (r1 == r2) {
        	 r2 = new Random();
         }
	   	int Low = 10;
		int High = 100;
		int result = r1.nextInt(High-Low) + Low;
		double randomWidth = (double) result;
		int result2 = r2.nextInt(High-Low) + Low;
		double randomHeight = (double) result2;
		Rectangle newRect = new Rectangle(randomWidth, randomHeight);		
		 rectangles.add(newRect);
      }
		 return rectangles;
		}
	}
	
	public static void setSmallest(List<Rectangle> rectangles){
		for (Rectangle rect : rectangles) {
			if (smallest == 0.0 )
			{
				smallest = rect.area;
				smallestRect = rect;
			} else {
				if (smallest > rect.area){
					smallest = rect.area;
					smallestRect = rect;
				}
			}
		}
	}
	
	public double getSmallest(){		
		return smallest;
	}
	
	public static void setLargest(List<Rectangle> rectangles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		 largest = 0.0;
		 for (Rectangle rect : rectangles) {
			if (largest == 0.0 )
			{
				largest = rect.area;
				largestRect = rect;
			} else {
				if (largest < rect.area){
					largest = rect.area;
					largestRect = rect;
				}
			}
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public static void setSum(List<Rectangle> rectangles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		 for (Rectangle rect : rectangles) {
			sum = sum + rect.area;
		}
	}
	
	public double getSum(){
		
		return sum;
	}
	
	public static void setRectangleList(List<Rectangle> rectangles){
		for (Rectangle rect : rectangles) {
			dimensionList = dimensionList + rect.panjang + "x"+rect.lebar +", ";
		}
	}
	
	public static void printRectangles() {
		  System.out.println("All rectangles dimensions (in mm) : "+ dimensionList) ;
	      System.out.println("Smallest rectangle area (in mm)  : " + smallest + " , with dimension (in mm): " + smallestRect.panjang +"x"+smallestRect.lebar);
	      System.out.println("Largest rectangle area (in mm) : " + largest+ " , with dimension (in mm): " + largestRect.panjang +"x"+largestRect.lebar);
	      System.out.println("Sum of rectangles' area (in mm squared) :" + df2.format(sum));
	   }
	
	private static DecimalFormat df2 = new DecimalFormat(".##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> rectangles = setRandomRectangle(3);
		setSmallest(rectangles);
		setLargest(rectangles);
		setSum(rectangles);
		setRectangleList(rectangles);
		printRectangles();
	}

}
