package exceptionHandling;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

public class Throwskeyword
{
	void read() throws FileNotFoundException{
		FileInputStream f = new FileInputStream("");

		System.out.println("File cannot be found");
	
}

	public static void main(String[] args) {
			Throwskeyword t = new Throwskeyword();
			try{
				t.read();
			}catch(FileNotFoundException e) {
				System.out.println("i catch");
			}
		}

	}



