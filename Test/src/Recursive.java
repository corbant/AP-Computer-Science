
public class Recursive {
	
	public static void main(String[] args) {
		tricky(8);
	}
	
	public static void tricky(int n) {
		if(n>=0) {
			System.out.print(n);
			tricky(n-2);
			System.out.print(n);
		}
	}

}
