class MyThread implements Runnable {
    int i = 20;
    public void run() {
        synchronized(this) {
            while(true) {
                //Thread.currentThread() 取得当前线程对象
                System.out.println(Thread.currentThread().getName() + i);
                i--;
                Thread.yield();
                if (i < 0) {
                    //break; 
                }
            }
        }
    }
}
