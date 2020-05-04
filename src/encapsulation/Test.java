package encapsulation;

public class Test {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setFirstName("Arpitha");
		b.setLastName("KR");
		b.setCard("11111");
		System.out.println("first name is: "+b.getFirstName());
		System.out.println("last name is: "+b.getLastName());
		System.out.println("Card is:"+b.getCard());
	}
}
