package Javabasics;

public class ObjectsAndString {

	public static void main(String[] args) {
		byte a=10;
		byte b=Byte.valueOf(a);
		String s=Byte.toString(b);
		byte c=Byte.parseByte(s);
		System.out.println(c);
		
	}

}
