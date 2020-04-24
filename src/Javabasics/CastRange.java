package Javabasics;

public class CastRange {

	public static void main(String[] args) {
		int a=100;
		byte b = (byte)a;
		System.out.println(b);
		int z=138;//value is out of range 0-128
		byte x = (byte) z;
		System.out.println(x);
		
	}

}
