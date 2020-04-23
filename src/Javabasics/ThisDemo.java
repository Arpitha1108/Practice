package Javabasics;

public class ThisDemo {
	int a=111,b=222,c=333;
	ThisDemo(){
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);//this keyword
	}

	public static void main(String[] args) {
		System.out.println("this keyword");
		
		new ThisDemo();
		new ThisDemo();

	}

}
