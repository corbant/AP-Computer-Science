
public class TestClass extends OtherClass implements TestInterface {
	int thing;
	int otherThing;
	
	public String stringOut(String string) {
		thing = 1;
		return string;
	}
	
	public int intOut() {
		otherThing = 3;
		return otherThing;
	}
	
	@Override
	public void printHello() {
		System.out.println("Goodbye");
	}
	
	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		String string = testClass.stringOut("Testing");
		System.out.println(string);
		testClass.printHello();
		int integer = testClass.integer;
		System.out.println(integer);
	}
	

}
