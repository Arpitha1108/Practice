package threads;

public class SingleThread {

	public static void main(String[] args) {
		SingleThread s = new SingleThread();
		s.Numbers();
	
		for(int j=1;j<100;j++) {
			System.out.print("j:"+ j +"\t");
		}
	}
		void Numbers() {
			for(int i=1;i<=100;i++) {
				System.out.print("i:"+ i +"\t");
		}
		
	}

}
