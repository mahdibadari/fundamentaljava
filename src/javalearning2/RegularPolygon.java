package javalearning2;

public interface RegularPolygon {
	public int getNumSides();
	public int getSideLength();
	
	public static int totalSides(RegularPolygon[] polies) {		
		int total = 0;
		for (RegularPolygon poly: polies) {
			total += poly.getNumSides();
		}
		return total;
	}
	
	public default int getPerimeter(RegularPolygon poly) {
		return poly.getNumSides()*poly.getSideLength();
	}
	
	public default double getInteriorAngle(RegularPolygon poly) {
		int n = poly.getNumSides();
		return ((n-2)*Math.PI)/n;
	}
 
}
