package exceptionHandling;


	import java.util.Scanner;

	public class Division {
		public static void main(String[] args) {
			int a,b,c;
			try {
			System.out.println("enter two integers");
			Scanner s = new Scanner(System.in);//system takes input from console
			a=s.nextInt();
			b=s.nextInt();
			c=a/b;
			System.out.println("result:"+c);
			}catch(ArithmeticException e) {
			System.out.println("no 0s please");
			}finally {
				System.out.println("finally block");
			}
			
		}
	}



