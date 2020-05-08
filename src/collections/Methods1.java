package collections;

import java.util.ArrayList;
import java.util.List;

public class Methods1 {
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
		List<Integer> a1= new ArrayList<>();
		a1.add(123);
		a1.add(234);
		a1.add(345);
		a1.add(456);
		System.out.println("list#2 :"+a1);
		a.addAll(3, a1);//adds list#2 values to first list
		System.out.println("Final list:"+a);
		if(a.contains(123)) {//it says if a value is present or not
			System.out.println("value is present in the list");
		}else {
			System.out.println("value is not present in the list");
		}
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));//displays element in specific position
		}
		a.remove(4);//removes a value from the list
		System.out.println("After removing"+a);
	}

}

