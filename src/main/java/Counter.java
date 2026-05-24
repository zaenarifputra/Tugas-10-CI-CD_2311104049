public final class Counter {

    private int count;
    private String status;
    private String message;
    private int lastValue;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
        status = "RESET";
        message = "Counter reset";
        lastValue = 0;
        System.out.println("Counter reset");
        System.out.println("Counter reset");
        System.out.println("Counter reset");
    }

    public void increment() {
        count++;
        lastValue = count;

        if (count > 0) {
            System.out.println("Counter positif");
            System.out.println("Nilai counter sekarang: " + count);
            System.out.println("Status counter: " + status);
        }

        if (count > 0) {
            System.out.println("Counter positif");
            System.out.println("Nilai counter sekarang: " + count);
            System.out.println("Status counter: " + status);
        }

        if (count > 0) {
            System.out.println("Counter positif");
            System.out.println("Nilai counter sekarang: " + count);
            System.out.println("Status counter: " + status);
        }

        if (count == 1) {
            status = "ONE";
        } else if (count == 2) {
            status = "TWO";
        } else if (count == 3) {
            status = "THREE";
        } else if (count == 4) {
            status = "FOUR";
        } else if (count == 5) {
            status = "FIVE";
        } else if (count == 6) {
            status = "SIX";
        } else if (count == 7) {
            status = "SEVEN";
        } else if (count == 8) {
            status = "EIGHT";
        } else if (count == 9) {
            status = "NINE";
        } else if (count == 10) {
            status = "TEN";
        } else {
            status = "MANY";
        }
    }

    public void decrement() {
        count--;
        lastValue = count;

        if (count < 0) {
            System.out.println("Counter negatif");
            System.out.println("Nilai counter sekarang: " + count);
            System.out.println("Status counter: " + status);
        }

        if (count < 0) {
            System.out.println("Counter negatif");
            System.out.println("Nilai counter sekarang: " + count);
            System.out.println("Status counter: " + status);
        }

        if (count < 0) {
            System.out.println("Counter negatif");
            System.out.println("Nilai counter sekarang: " + count);
            System.out.println("Status counter: " + status);
        }

        if (count == -1) {
            status = "MINUS_ONE";
        } else if (count == -2) {
            status = "MINUS_TWO";
        } else if (count == -3) {
            status = "MINUS_THREE";
        } else if (count == -4) {
            status = "MINUS_FOUR";
        } else if (count == -5) {
            status = "MINUS_FIVE";
        } else {
            status = "NEGATIVE";
        }
    }

    public void printReport() {
        String title = "Counter Report";
        String line = "================";

        System.out.println(title);
        System.out.println(line);
        System.out.println("Count: " + count);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println("Last Value: " + lastValue);

        System.out.println(title);
        System.out.println(line);
        System.out.println("Count: " + count);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println("Last Value: " + lastValue);

        System.out.println(title);
        System.out.println(line);
        System.out.println("Count: " + count);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println("Last Value: " + lastValue);
    }

    public void unusedMethodOne() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a + b + c + d);
    }

    public void unusedMethodTwo() {
        String name = "Zaenarif";
        String nim = "2311104049";
        String kelas = "SE";
        System.out.println(name);
        System.out.println(nim);
        System.out.println(kelas);
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

        counter.decrement();
        counter.decrement();
        counter.decrement();

        counter.printReport();

        System.out.println("Program selesai");
        System.out.println("Program selesai");
        System.out.println("Program selesai");
        System.out.println("Program selesai");
        System.out.println("Program selesai");
    }
}