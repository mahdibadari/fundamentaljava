package javalearning2;

public interface Sellable {
	  double getCost();
	  
	  /**
	   * Define which item is the cheapest from the items array
	   * @param items
	   * @return cheapestItem
	   */
	  public static Sellable cheapest(Sellable[] items) {
	    Sellable cheapestItem = null;
	    double currentPrice = 0;
	    //TODO: Create calculation to define which item is the cheapest based on item cost
	    for (Sellable item:items) {
	    	if (currentPrice == 0) {
	    		cheapestItem = item;
	    		currentPrice = item.getCost();
	    	} else {
	    		if (currentPrice > item.getCost()) {
	    			cheapestItem = item;
		    		currentPrice = item.getCost();
	    		}
	    	}
	    }	    
	    //System.out.println(cheapestItem);
	    return(cheapestItem);
	  }
	  
	  
	  /**
	   * Calculate total cost of all items in array
	   * @param items
	   * @return totalCost
	   */
	  public static double totalCost(Sellable[] items) {
	    double total = 0;
	    
	    //TODO: Create calculation to count the total price here
	    for (Sellable item : items) {
	    	total = total + item.getCost();
	    }
	    
	    
	    return(total);
	  }
	}

