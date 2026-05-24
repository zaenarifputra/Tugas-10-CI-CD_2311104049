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

		// Bad smell: duplicated code
		if(count > 5) {
			System.out.println("Counter lebih dari 5");
		}

		if(count > 5) {
			System.out.println("Counter lebih dari 5");
		}

		if(count > 5) {
			System.out.println("Counter lebih dari 5");
		}

		if(count > 5) {
			System.out.println("Counter lebih dari 5");
		}
	}

	public void decrement() {
		count--;

		// Bad smell: duplicated code
		if(count < 0) {
			System.out.println("Counter minus");
		}

		if(count < 0) {
			System.out.println("Counter minus");
		}

		if(count < 0) {
			System.out.println("Counter minus");
		}

		if(count < 0) {
			System.out.println("Counter minus");
		}
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {

		Counter counter = new Counter();

		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();

		System.out.println("Count: " + counter.getCount());

		counter.decrement();
		counter.decrement();
		counter.decrement();
		counter.decrement();
		counter.decrement();
		counter.decrement();
		counter.decrement();

		System.out.println("Count after decrement: " + counter.getCount());

		// Bad smell: unnecessary variables
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// Bad smell: repeated print
		System.out.println("Program selesai");
		System.out.println("Program selesai");
		System.out.println("Program selesai");
		System.out.println("Program selesai");
		System.out.println("Program selesai");


		
	}
}