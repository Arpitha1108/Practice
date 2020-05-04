package polymorphism;

public class CompileTime {
	
	
		void add(int a, int b) {
			int sum=a+b;
			System.out.println("sum is:"+sum);
		}
		void add(float a, float b) {
			float sum=a+b;
			System.out.println("sum is:"+sum);
		}
		void add(int a, int b, int c) {
			int sum=a+b+c;
			System.out.println("sum is:"+sum);
		}
		public static void main(String[] args) {
			CompileTime c=new CompileTime();
			c.add(10,20);
			c.add(20f, 50f);
			c.add(40,30,50);
			
	}

}
