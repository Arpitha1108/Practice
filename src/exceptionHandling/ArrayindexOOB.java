package exceptionHandling;

public class ArrayindexOOB {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		try {
		System.out.println("array elements are:"+arr);
		for (int i = 0; i <= arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("no exception is thrown");
		}
	}
	void method() {
		System.out.println("method");
	
	}
}
