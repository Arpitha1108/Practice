package exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
		String input = args[0];
		System.out.println("input:"+input);
		int output=Integer.parseInt(input);
		System.out.println("output:"+output);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter a value");
		}catch(NumberFormatException ee) {
			System.out.println("It's invalid");
		}
		
		System.out.println("Yes I will display msg here");
	}

}
