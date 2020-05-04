package polymorphism;

public class RunTime {

	public static void main(String[] args) {
		OnePlus o1 = new OnePlus7();
		OnePlus o2 = new OnePlus7T();
		
		o1.start();
		o1.shutdown();
		o2.start();
		o2.shutdown();
		
		
	}

}
