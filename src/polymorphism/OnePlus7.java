package polymorphism;

public class OnePlus7 extends OnePlus{
	@Override
	void start() {
		System.out.println("OnePlus7 Start");
	}
	@Override
	void shutdown() {
		System.out.println("OnePlus7 Shutdown");
	}
}
