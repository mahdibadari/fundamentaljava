package javalearning2;

public class Square implements RegularPolygon{
	int sidelength;
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return sidelength;
	}
	
	public Square(int length) {
		this.sidelength = length;
	}

}
