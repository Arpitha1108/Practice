package exceptionHandling;

public class StringParser {

	public static void main(String[] args) {
		String s = "aaaa";
		try {
		int i=Integer.parseInt(s);//converting string to integer
		System.out.println(i);//number format exception will be thrown
	}catch(NumberFormatException e) {
		System.out.println("Can't convert a string to integer");
		
	}

}
}
