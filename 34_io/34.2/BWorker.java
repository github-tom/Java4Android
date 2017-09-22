class BWorker implements Worker {
	private Worker worker;
	
	public BWorker(Worker worker) {
		this.worker = worker; 
	}
	public void doSomeWork() {
		System.out.println("BBBBBBBB");
		worker.doSomeWork();
	}
}
