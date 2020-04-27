package Javabasics;

public class PrimitiveToString {

	public static void main(String[] args) {
		byte a = 10;
		String s=Byte.toString(a);
		byte b=Byte.parseByte(s);
		System.out.println(b);
	}

}
