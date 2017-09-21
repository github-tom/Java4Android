class Test {
	public static void main(String args []) {
		Student s = new Student();
		Person p = s;

		p.name = "zhangsan";
		p.age = 20;
		//p.address = "huang tu gao po";
		p.introduce();
		//p.study();
	}
}
