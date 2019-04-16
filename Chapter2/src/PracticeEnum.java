
public class PracticeEnum {
	
	enum Season {Winter, Spring, Summer, Fall}
	
	public static void main(String[] args) {
		Season season1st, season4th;
		
		season1st = Season.Winter;
		season4th = Season.Fall;
		
		System.out.println("1st Season: "+ season1st + "\n4th Season: " + season4th);
		
		int num1 = 10, num2 = 13, num3;
		double num4 = 12, num5 = 32.1, num6;
		final int MAX_AGE = 100;
		
		num3 = (int)num5;
		num6 = num1/num2;
		
		System.out.println("num1: " + num1 + "\tnum2: " + num2 + "\tnum3: " + num3);
		System.out.println("num4: " + num4 + "\tnum5: " + num5 + "\tnum3: " + num6);
		
		num4 = num1 + num5 - num6 / MAX_AGE * num2 % num3;
		
		System.out.println(num4);
		
		num4 = num1/num3 + (num5-num6)%num2;
		
		System.out.println(num4);
	}

}
