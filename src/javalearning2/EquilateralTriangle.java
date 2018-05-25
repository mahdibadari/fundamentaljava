package javalearning2;

public class EquilateralTriangle implements RegularPolygon{
	int sidelength;
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return sidelength;
	}
	
	public EquilateralTriangle(int sidelength) {
		this.sidelength = sidelength;
	}

}
