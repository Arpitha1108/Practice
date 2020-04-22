package Javabasics;

public class BlockMethod {
	public static void main(String[] args) {
		System.out.println("Main Method");
		StaticMethods.Method();
	}
//static method
	static void Method() {
		System.out.println("I am a static method");
	}
//static block
	static {
		System.out.println("I am a static block");
	}
}

