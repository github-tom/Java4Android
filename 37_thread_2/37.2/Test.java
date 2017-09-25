//线程的简单控制方法
//  中断线程
//    -- Thread.sleep();
//    -- Thread.yield();
//  设置线程的优先级
//    -- getPriority();
//    -- setPriority();

class Test {
	public static void main(String args []) {
		int i = 0;

		RunnableImpl ri = new RunnableImpl();
		Thread t = new Thread(ri);

		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		t.start();

		for (i=0; i<100; i++) {
			System.out.println("main-->" + i);
		}
	}
}
