package threads;

import java.util.Scanner;

public class JoinMethod extends Thread {
	static int n, sum=0;
	public static void main(String[] args) {
		System.out.println("Sum of N numbers");
		System.out.println("enter value");
		 Scanner s = new Scanner(System.in);
		 JoinMethod.n =s.nextInt();
		 JoinMethod j = new JoinMethod();
		 j.start();
		 try {
			j.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println("sum of"+JoinMethod.n+"Numbers is"+JoinMethod.sum);
	}
	public void run() {
		for(int i=0;i<=JoinMethod.n;i++) {
			JoinMethod.sum += i;
		}
	}
}
