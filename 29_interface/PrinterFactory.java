class PrinterFactory {
    public static Printer getPrinter(int flag) {
        Printer printer = null;
        
        if (flag == 0) {
            printer = new HPPrinter(); 
        }
        else if(flag == 1) {
            printer = new CanonPrinter(); 
        }
        return printer;
    }
}
