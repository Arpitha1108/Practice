package inherit;

public class SingleInheritance {//inheriting Object class implicitly
	void method() {
		System.out.println("I am a method");
	}

	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.method();
		s.hashCode();
		s.getClass();

	}

}
