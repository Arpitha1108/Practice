package Javabasics;

public class ObjectRef {
	int a=12,b=12;
	int c;
	ObjectRef(){
		
		c=a+b;
	}

	public static void main(String[] args) {
		ObjectRef o=new ObjectRef();
		System.out.println(o.c);
		System.out.println(o.c);
		System.out.println(o.c);
	}

}
