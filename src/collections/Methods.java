package collections;

import java.util.ArrayList;
import java.util.List;

public class Methods {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		for(int i=10;i<=100;i=i+10) {
			a.add(i);
		}
		System.out.println("list is:"+a);
		a.add(5,100);//it'll add 100 after the 5th element in the list
		System.out.println("list after adding is:"+a);
		a.set(3,22);
		System.out.println("list after replacing is:"+a);
	}

}
