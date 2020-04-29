package inherit;

public class MethodOveriding {

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.food());
		Cat c = new Cat();
		System.out.println(c.food());
		Monkey m = new Monkey();
		System.out.println(m.food());
	}

}
