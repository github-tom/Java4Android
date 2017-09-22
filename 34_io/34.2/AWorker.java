class AWorker implements Worker {
	private Worker worker;
	
	public AWorker(Worker worker) {
		this.worker = worker; 
	}
	public void doSomeWork() {
		System.out.println("你好");
		worker.doSomeWork();
	}
}
