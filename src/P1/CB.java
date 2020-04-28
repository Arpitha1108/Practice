package P1;

public class CB {

	public static void main(String[] args) {
		CA a = new CA();
		//System.out.println(a.a);cant be accessed since it is private in class CA
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		
		
	}

}
