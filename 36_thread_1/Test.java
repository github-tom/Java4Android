class Test {
	public static void main(String args []) {
		FirstThread ft = new FirstThread();
		ft.start();

		for(int i=0; i<100; i++) {
			System.out.println("main->" + i);
		}
	}

}
