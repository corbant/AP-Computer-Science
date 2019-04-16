package ch5Examples;

public class Section5_3Notes {

	public static void main(String[] args) {
		
		//A class that implements an interface is guaranteed to have
		//explicit methods that correspond to the abstract
		//methods outlined in the interface
		
		//public interface Comparable<T>
		//{
		//	//abstract keyword is used to note
		//	//the method will be implemented in another class
		//	public abstract int compareTo(T o);
		//}
		
		//For example, String and Num implement the Comparable interface
		//meaning they have a compareTo() method
		
		String a = "Hello", b = "hello", c = "HELLO";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(a));
		System.out.println(a.compareTo(c));
		
		Num n1 = new Num(1), n2 = new Num(2), n3 = new Num(3);
		
		System.out.println(n2.compareTo(n3));
		System.out.println(n2.compareTo(n2));
		System.out.println(n2.compareTo(n1));
		
		//For another example, Complexity is an interface, Question implements,
		//and MiniQuiz instantiates and uses Questions with complexity methods.

	}

}
