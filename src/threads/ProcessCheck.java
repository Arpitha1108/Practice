package threads;

public class ProcessCheck implements Runnable{

	public static void main(String[] args) {
		ProcessCheck p = new ProcessCheck();
		Thread t = new Thread(p);
		t.start();
		
		
	}

	@Override
	public void run() {
		System.out.println("Checks are processed accordingly");
	}

}
