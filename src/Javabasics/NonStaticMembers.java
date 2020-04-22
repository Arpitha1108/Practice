package Javabasics;

public class NonStaticMembers {
	// non-static variable
	int num;

	// constructor
	NonStaticMembers()
	{
		System.out.println("Constructor");
	}
	//non-static block
	{
		System.out.println("Non static block");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		new NonStaticMembers();
	}

}
