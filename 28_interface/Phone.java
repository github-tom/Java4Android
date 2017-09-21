class Phone implements USB, Wifi {
	public void read() {
		System.out.println("usb read");
	}
	public void write() {
		System.out.println("usb write");
	}

	public void open() {
		System.out.println("wifi open");
	}
	public void close() {
		System.out.println("wifi close");
	}
}
