package interfaces;

public class Honda implements TwoWheeler{

	@Override
	public void go() {
		System.out.println("Go Honda");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop Honda");
		
	}

}
