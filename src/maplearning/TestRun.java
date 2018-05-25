package maplearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestRun {
	public static void main(String[] args) {
	      Map<String, String> m1 = new HashMap<String, String>(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");
	      
	      boolean ada = m1.containsKey("Zahrea");
	      boolean ada1 = m1.containsValue("31");
	      Set<?> hh = m1.entrySet();
	      
	      int ada2 = m1.hashCode();
	      m1.put("Daisy", "29");
	      
	      Map<String, String> m2 = new HashMap<String, String>(); 
	      m1.put("Han", "8");
	      m1.put("Luke", "31");
	      m1.put("Leia", "12");
	      m1.put("Dylon", "14");
	      
	      m1.putAll(m2);
	      
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	      System.out.println();
	      System.out.println(String.valueOf(ada));
	      System.out.println(String.valueOf(ada1));
	      System.out.println(String.valueOf(ada2));
	      System.out.print("\t"+hh);
	   }
}
