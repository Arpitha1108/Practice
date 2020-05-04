package constructorChaining;

public class Child extends Super{
	Child() {
		this(10);
		System.out.println("Child with no arguments");
	}
	Child(int x) {
		super(x);
		System.out.println("Child with arguments");
	}
public static void main(String[] args) {
	Child c = new Child();
	
}
}
