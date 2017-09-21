class Test {
	public static void main (String args []) {
		Phone phone = new Phone();
		USB usbdevice = phone;
		usbdevice.read();
		usbdevice.write();

		Wifi wifidevice = phone;
		wifidevice.open();
		wifidevice.close();
	} 
}

