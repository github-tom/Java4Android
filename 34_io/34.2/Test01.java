class Test01 {
    public static void main(String args []) {
        //生成一个A公司水管工对象
        Plumber plumber = new Plumber();
        AWorker aWorker = new AWorker(plumber);
        aWorker.doSomeWork();

        Carpenter carpenter = new Carpenter();
        AWorker aWorker2 = new AWorker(carpenter);
        aWorker2.doSomeWork();


        Plumber plu = new Plumber();
        BWorker bwk = new BWorker(plu);
        bwk.doSomeWork();

        Carpenter cap = new Carpenter();
        BWorker bwk2 = new BWorker(cap);
        bwk2.doSomeWork();
    }
}
