package javalearning2;

public class SalesTest {
	public static void main(String[] args) {
	    CarSale sale1 = new CarSale("Lamborghini Aventador", 40_000, 5);
	    CarSale sale2 = new CarSale("Ferrari 458 Spider", 30_000, 4);
	    PaperClipSale sale3 = new PaperClipSale("silver", 3.55, 30_000);
	    PaperClipSale sale4 = new PaperClipSale("gold", 2.56, 20_000);
	    Sellable[] sales = { sale1, sale2, sale3, sale4 };
	    //Sellable[] sales = {sale1,sale2};
	    System.out.println("Items for sale:");
	    for(Sellable sale: sales) {
	      System.out.println("  " + sale);
	    }
	    System.out.println("Cheapest item: " + Sellable.cheapest(sales));
	    System.out.println("Total cost: " + Sellable.totalCost(sales));
	  }
}
