class Test {
	public static void main(String args []) {
		B b = new B();


//		AImp ai = new AImp();
//		//A a = ai;
//		b.fun((A)ai);


		b.fun(new A() {
			public void doSomething() {
				System.out.println("匿名内部类");
			}
		});



	}
}
