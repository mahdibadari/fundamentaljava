package settraining;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestRun {
	public static void main(String args[]) { 
	      int count[] = {34, 22,10,60,30,22};
	      Set<Integer> set = new HashSet<Integer>();
	      try {
	         for(int i = 0; i < 5; i++) {
	            set.add(count[i]);
	         }
	         System.out.println(set);
	         set.add(43);
	         
	         String names[] = {"Shion", "Alan", "Illiminer", "Wintia", "Nan Hang"};
		     Set<String> setNames = new HashSet<String>();
	         for(int i = 0; i < 5; i++) {
	        	 setNames.add(names[i]);
		         }
	         
	         TreeSet sortedNames = new TreeSet<String>(setNames);
	         System.out.println("The sorted list is:");
	         System.out.println(sortedNames);

	         TreeSet sortedSet = new TreeSet<Integer>(set);
	         System.out.println("The sorted list is:");
	         System.out.println(sortedSet);

	         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	         
	         Set<Integer> cons = new HashSet<Integer>(set);
	         cons.clear();
	         System.out.println(cons);
	         System.out.println(String.valueOf(set.contains(22)));
	         System.out.println(String.valueOf(set.size()));
	         set.remove(22);
	         System.out.println(String.valueOf(set.contains(22)));
	      }
	      catch(Exception e) {}
	   }
}
