package javalearning2;

public class PaperClipSale implements Sellable {

    private String color;
    private double boxPrice;
    private int numBoxes;
	
  public PaperClipSale(String color, double boxPrice, int numBoxes) {
	//TODO: complete this so it will set the properties when called   
	  this.color = color;
	  this.boxPrice = boxPrice;
	  this.numBoxes = numBoxes;  
  }

  //TODO: define getter each attributes/properties

  
  
  
  
  
  
  
  
  
  

  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
		
	//TODO: create calculation to calculate finalCost based on price and number of boxes here
	finalCost = boxPrice*numBoxes;
	
	
	
	
	return(finalCost);  	  
  }

  @Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	toString = "This paperclip color is " +color+ ", its price is "+boxPrice+", with number of box "+numBoxes;
	  
	  
	return toString;  
  }
}

