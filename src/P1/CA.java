package P1;

public class CA {
	
	private int a = 111;//accessible only within class
		int b = 222;//accessible within same package
	protected int c = 333;//accessible within package and extended class
	public int d = 444;//accessible everywhere
	
	public static void main(String[] args) {
		CA a = new CA();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}

}
