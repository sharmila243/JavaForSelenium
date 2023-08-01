package OOPSConcept_6;

public class Audi extends Car{

	@Override
	public void start() {
		System.out.println("Audi -- Start");
	}
	
	public void threadSafety() {
		System.out.println("Audi -- threadsafety");
	}
}
