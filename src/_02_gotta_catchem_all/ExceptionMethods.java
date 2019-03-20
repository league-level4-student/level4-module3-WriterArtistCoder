package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double n, double d) {
		if (d == 0.0) {
			throw new IllegalArgumentException();
		}
		
		return n/d;
	}
	
	public static String reverseString(String s) {
		String x = "";
		if (s.isEmpty()) {
			throw new IllegalStateException();
		}
		
		for (char c : s.toCharArray()) {
			x = c+x;
		}
		
		return x;
	}
}
