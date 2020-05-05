package exceptionHandling;

public class Test {
	static ArrayindexOOB a;//throws null pointer exception
	//since instance of Arrayindexoob is not created

	public static void main(String[] args) {
		try {
		Test.a.method();
	}catch(NullPointerException e) {
		System.out.println("u have not created an instance");
	}
	}
}
