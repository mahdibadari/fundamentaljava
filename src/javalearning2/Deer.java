package javalearning2;

public class Deer extends Animal implements Vegetarian {
	public void pickyEater() {
		System.out.println("Deer eats specific leaves");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("As herbivore, deer's diet consist of plants");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("When season changed, deer will travel great distance for new feeding area");
		
	}
}
