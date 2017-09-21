abstract class Printer {

	void open() {
		System.out.println("open");
	}

	void close() {
		System.out.println("close");
	}

	abstract void print();
}
