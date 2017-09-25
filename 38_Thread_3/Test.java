class Test {
	public static void main(String args []) {
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);

		t1.setName("Thread a");
		t2.setName("Thread b");

		t2.start();
		t1.start();
	}
}
