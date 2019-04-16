package practice;

public class BackwardRecursion {

	public static void main(String[] args) {
		backwards("Hello");

	}
	
	public static void backwards(String s) {
		if(s.length() == 0)
			System.out.print("");
		else {
			System.out.print(s.charAt(s.length() - 1));
			backwards(s.substring(0, s.length() - 1));
		}
	}

}
