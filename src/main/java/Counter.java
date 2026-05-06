
public final class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.increment();
		counter.increment();
		System.out.println("Count: " + counter.getCount());
		counter.decrement();
		System.out.println("Count after decrement: " + counter.getCount());
	}
	
}
