package Javabasics;

class Inheritance 
{
	int a;
	public void add(int b, int c)
	{
		a=b+c;
		System.out.println("sum:"+a);
	}
	
	public void sub(int b, int c)
	{
		a=b-c;
		System.out.println("sub:"+a);
	}
}
class My_class extends Inheritance  
{
	public void multiply(int b,int c)
	{
		a=b*c;
		System.out.println("multiply:"+a);
	}
	public void divide(int b,int c)
	{
		a=b/c;
		System.out.println("divide:"+a);
	}
	public static void main(String args[])
	{
		int x=15, y=12;
		My_class A1 = new My_class();
		A1.add(x,y);
		A1.sub(x,y);
		A1.multiply(x,y);
		A1.divide(x,y);
	}
	
}
