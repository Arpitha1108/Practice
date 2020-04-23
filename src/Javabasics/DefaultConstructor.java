package Javabasics;

public class DefaultConstructor {
	int num;
	//non-static block
	{
		System.out.println("Non static block");
		//executes twice, since 2 instances are created
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		new DefaultConstructor();//there is no constructor written,it's default
		new DefaultConstructor();
	}


}
