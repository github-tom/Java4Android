class Test {
	public static void main(String args []) {
		int i = 0;
		//生成一个Runnable接口实现类的对象 
		RunnableImpl ri = new RunnableImpl();
		//生成一个Thread对象，并将Runnable接口实现类的对象作为参数传递为该Thread对象
		Thread t = new Thread(ri);
		//通知Thread对象执行start()方法
		t.start();

		for (i=0; i<100; i++) {
			System.out.println("main-->" + i);
		}
	}
}
