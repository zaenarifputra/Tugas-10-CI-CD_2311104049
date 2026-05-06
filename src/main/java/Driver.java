public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Countersss();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
