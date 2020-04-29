package supermethod;

public class Child extends Parent{
	int c,d;
	Child(int a, int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
		
	}
	void displayDetails() {
		System.out.println("parent's a"+super.a);
		System.out.println("parent's b"+super.b);
		System.out.println("child's c"+this.c);
		System.out.println("child's d"+this.d);
		
	}
	void method() {
		super.method();
		System.out.println("Child's Method");
	}


}
