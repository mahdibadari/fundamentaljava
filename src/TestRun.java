import java.util.List;

public class TestRun {
	public static void main(String args[]) {
		test_markPrimesParallel_singleParam();
	}
	
	public static void test_markPrimesSerial() {
		int lowerIndex = 2;
		int upperIndex = 10;
		int size = upperIndex + 1;
		boolean[] primeFlags = new boolean[size];
		MathUtils.markPrimesSerial(primeFlags,lowerIndex,upperIndex);
		System.out.println(primeFlags[0]);
		System.out.println(primeFlags[1]);
		System.out.println(primeFlags[2]);
		System.out.println(primeFlags[3]);
	}
	
	public static void test_markPrimesSerial_singleParam() {
		int upperIndex = 10;
		boolean[] primeFlags = new boolean[upperIndex+1];
		MathUtils.markPrimesSerial(primeFlags);
		System.out.println(primeFlags[0]);
		System.out.println(primeFlags[1]);
		System.out.println(primeFlags[2]);
		System.out.println(primeFlags[3]);
		System.out.println(primeFlags[4]);
		System.out.println(primeFlags[5]);
	}
	
	public static void test_markPrimesParallel_singleParam() {
		int upperIndex = 10;
		boolean[] primeFlags = new boolean[upperIndex+1];
		MathUtils.markPrimesParallel(primeFlags);
		System.out.println(primeFlags[0]);
		System.out.println(primeFlags[1]);
		System.out.println(primeFlags[2]);
		System.out.println(primeFlags[3]);
		System.out.println(primeFlags[4]);
		System.out.println(primeFlags[5]);
	}
	
	public static void test_collectPrimes() {
		int upperIndex = 1000;
		boolean[] primeFlags = new boolean[upperIndex];
		MathUtils.markPrimesSerial(primeFlags);
		List<Integer> primeList = MathUtils.collectPrimes(primeFlags);
		System.out.println(primeList.size() +";"+ 168);
		System.out.println(primeList.get(primeList.size() - 1) +";"+ 997);
	}
	
	public static void test_findPrimesSerial_booleanArrayParameter() {
		int upperIndex = 1000;
		boolean[] primeFlags = new boolean[upperIndex];
		List<Integer> primeList = MathUtils.findPrimesSerial(primeFlags);
		System.out.println(primeList.size() +";"+ 168);
		System.out.println(primeList.get(primeList.size() - 1) +";"+ 997);
	}
	
	public static void test_findPrimesSerial_sizeParameter() {
		int upperIndex = 1000;
		List<Integer> primeList = MathUtils.findPrimesSerial(upperIndex);
		System.out.println(primeList.size() +";"+ 168);
		System.out.println(primeList.get(primeList.size() - 1) +";"+ 997);
	}
	
	public static void test_findPrimesParallel_booleanArrayParameter() {
		int upperIndex = 1000;
		boolean[] primeFlags = new boolean[upperIndex];
		List<Integer> primeList = MathUtils.findPrimesParallel(primeFlags);
		System.out.println(primeList.size() +";"+ 168);
		System.out.println(primeList.get(primeList.size() - 1) +";"+ 997);
	}
	
	public static void test_findPrimesParallel_sizeParameter() {
		int upperIndex = 1000;
		List<Integer> primeList = MathUtils.findPrimesParallel(upperIndex);
		System.out.println(primeList.size() +";"+ 168);
		System.out.println(primeList.get(primeList.size() - 1) +";"+ 997);
	}
}
