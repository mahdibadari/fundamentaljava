package listtraining;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
	      List<String> a1 = new ArrayList<String>();
	      a1.add("Shion");
	      a1.add("Amadream");
	      a1.add("Wintia");      
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      List<String> l1 = new LinkedList<String>();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);
	      
	      boolean result = a1.addAll(l1);
	      System.out.println();
	      System.out.println("Status of list combine: "+String.valueOf(result));
	      System.out.print("\t" + a1);
	      
	      String resultStr = (String) a1.get(4);
	      System.out.println();
	      System.out.println("Item 5 is : "+resultStr);
	      
	      List<String> c1 = new ArrayList<String>();
	      c1 = a1;
	      c1.add(2, "Alan");
	      System.out.print("\t" + c1);
	      
	      List<String> d1 = new ArrayList<String>();
	      d1 = c1.subList(1, 4);
	      System.out.print("\t"+d1);
	   }
}
