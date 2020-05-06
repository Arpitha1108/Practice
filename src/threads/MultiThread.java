package threads;

public class MultiThread extends Thread {
	public static void main(String[] args) {
		MultiThread m = new MultiThread();
		m.start();
		for(int j=1;j<100;j++) {
			System.out.print("j:"+ j +"\t");
		}
	}
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.print("i:"+ i +"\t");
	}
	}
}
