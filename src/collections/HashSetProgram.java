package collections;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class HashSetProgram {

	public static void main(String[] args) {
		Random r = new Random();	
		List<Integer> list= new ArrayList<>();
		for(int i=1;i<=10;i++) {
			int number = r.nextInt(5);
			list.add(number);
			}
		System.out.println("list is:" +list);
		Set<Integer> s = new HashSet<>(list);
		System.out.println("value of set:"+s);
		
	}

}
