package javalearning2;


public class PolygonTest {
	public static void main(String[] args) {
		/*
		 * Create Polygon using EquilateralTriangle and Square
		 * then print out the totalsides  
		 */
		Square square1 = new Square(4);
		EquilateralTriangle triangle1 = new EquilateralTriangle(5);
		RegularPolygon[] polies = { square1, triangle1 };
	    System.out.println("Number of total sides from all polygons: " + RegularPolygon.totalSides(polies));
	  }
}
