package ch8Labs;
// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
	//Fill in code -- this should look very much like the
	//mathematical specification
    	System.out.println("In fib1("+n+")");
    	if(n == 0)
    		return 0;
    	else if(n == 1)
    		return 1;
    	else {
    		return fib1(n-1) + fib1(n-2);
    	}
    }
    
    public static int fib2(int n) {
    	int[] nums = new int[n+1];
    	nums[0] = 0;
    	nums[1] = 1;
    	for(int i = 2; i <= n; i++) {
    		nums[i] = nums[i-1] + nums[i-2];
    	}
    	return nums[n];
    }

}