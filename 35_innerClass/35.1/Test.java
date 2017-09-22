class Test {
	public static void main(String args[]) {
		A a = new A();
		A.B b = a.new B();

		a.i = 3;
		b.j = 1;
		int result = b.funB();
		System.out.println(result);
	}
}
