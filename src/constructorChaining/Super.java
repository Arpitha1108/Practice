package constructorChaining;

public class Super {
	int x;
	public Super() {
		System.out.println("without argument");
	}
	public Super(int x) {
		this();
		this.x = x;
		System.out.println("with argument");
	}
}
