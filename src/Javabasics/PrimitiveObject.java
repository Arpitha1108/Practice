package Javabasics;

public class PrimitiveObject {

	public static void main(String[] args) {
		int a=10;//primitive type
		Integer b = Integer.valueOf(a);//primitive to object type
		int c=b.intValue();//back to primitive type
		System.out.println(c);
	}

}
