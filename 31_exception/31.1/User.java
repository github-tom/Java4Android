class User {
	private int age;

	public void setAge(int age) throws Exception {
		if (age < 0) {
			Exception e = new Exception("年龄不能为负数");
			throw e;
		}
		this.age = age;
	}
}


