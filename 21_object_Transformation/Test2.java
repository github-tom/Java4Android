class Test2 {
	public static void main(String args []) {
		Person p = new Student();
		Student s = (Student)p;

		//错误的向下转型
		//Person p = new Person();
		//Student s = (Student)p;
	}
}
