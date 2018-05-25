package javalearning2;

public class Circle  {

	public double radius;

	public double area;

	public Circle (double circleRadius) {
      radius = circleRadius;
	  area = Math.PI*circleRadius*circleRadius;
   }

   // The salary variable is assigned a value.
   public void getArea (double circleRadius) {
      area = Math.PI*circleRadius*circleRadius;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("Radius  : " + radius );
      System.out.println("Area :" + area);
   }

   public static void main(String args[]) {
      Circle circleOne = new Circle(2.0);
      //circleOne.getArea(1.0);
      circleOne.printEmp();
   }
	
}