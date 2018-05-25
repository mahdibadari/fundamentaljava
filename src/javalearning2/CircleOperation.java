package javalearning2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.management.RuntimeErrorException;

public class CircleOperation {
	public int intRandom = 100;
	public static double smallest;
	public static double largest;
	public static double sum = 0;
	public static String radiusList = "";
	
	public static List<Circle> setRandomCircles(int circleCount){
		//circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		if (circleCount <= 0) {
			throw new RuntimeErrorException(null, "Amount of circles wanted must be more than 0. Amount user inputted: "+circleCount);
		} else {
		List<Circle> circles = new ArrayList<>();
		 for(int x = 0; x < circleCount; x = x + 1) {
         Random r = new Random();
	   	int Low = 10;
		int High = 100;
		int result = r.nextInt(High-Low) + Low;
		double newRandom = (double) result;
		 Circle newCircle = new Circle(newRandom);
		 circles.add(newCircle);
      }
		 return circles; }
	}
	
	//public static List<Circle> getRandomCircle(){
	//	setRandomCircles();
	//	return circles;
	//}
	
	public static void setSmallest(List<Circle> circles2){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		 smallest = 0.0;
		 for (Circle circle : circles2) {
			if (smallest == 0.0 )
			{
				smallest = circle.radius;
			} else {
				if (smallest > circle.radius){
					smallest = circle.radius;
				}
			}
		}
	}
	
	public double getSmallest(){		
		return smallest;
	}
	
	public static void setLargest(List<Circle> circles2){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		 largest = 0.0;
		 for (Circle circle : circles2) {
			if (largest == 0.0 )
			{
				largest = circle.radius;
			} else {
				if (largest < circle.radius){
					largest = circle.radius;
				}
			}
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public static void setSum(List<Circle> circles2){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		 for (Circle circle : circles2) {
			sum = sum + circle.area;
		}
	}
	
	public double getSum(){
		
		return sum;
	}

	public static void setCircleList(List<Circle> circles){
		for (Circle circle : circles) {
			radiusList = radiusList + circle.radius +", ";
		}
		//return radiusList;
	}

	public static void printCircles() {
	  System.out.println("All circles radius (in mm) : "+ radiusList) ;
      System.out.println("Smallest circle radius (in mm)  : " + smallest);
      System.out.println("Largest circle radius (in mm) : " + largest);
      System.out.println("Sum of circles' area (in mm squared) :" + df2.format(sum));
   }
	
	private static DecimalFormat df2 = new DecimalFormat(".##");

   public static void main(String args[]) {
	   List<Circle> circles = setRandomCircles(2);
	   setLargest(circles);
	   setSmallest(circles);
	   setSum(circles);
	   setCircleList(circles);
	   printCircles();
   }
}
