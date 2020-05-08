package collections;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt();
		System.out.println("x:"+x);
		int y = r.nextInt(1000);
		System.out.println("y:"+y);
		
	}

}
