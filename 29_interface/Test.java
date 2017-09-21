class Test {
	public static void main(String args []) {
		int flag = 1;

		Printer printer = PrinterFactory.getPrinter(flag);
		printer.open();
		printer.print("test");
		printer.close();
	}
}
