package javalearning2;

public class Rectangle {

	public double panjang;
	public double lebar;
	public double area;
	public double keliling;
	
	public Rectangle(double width, double height) {
		this.panjang = width;
		this.lebar = height;
		this.area = height*width;
		this.keliling = 2*(height+width);
	}
	
	public void recPrint() {
		System.out.println("Panjang: " +panjang +" , Lebar: "+lebar);
		System.out.println("Area  : " + area );
	      System.out.println("Keliling :" + keliling);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle kotak = new Rectangle(3,4);
		kotak.recPrint();
	}

}
