package Javabasics;

public class ImplicitTypeCast {

	public static void main(String[] args) {
		int a=1111;
		long l=a;//type casting implicitly
		System.out.println(l);
		double d=l;
		System.out.println(d);
		char ch = 'Z';
		int b=ch;
		System.out.println(b);
	}

}
