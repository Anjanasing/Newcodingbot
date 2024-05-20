class Student {

	String name;
	String city;
	int age;
	int rollNumber;

	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.sleep();
		obj2.study();

	}

	public void eat() {
		System.out.println("every student eat food");
	}

	public void study() {
		System.out.println("every student do study");
	}

	public void sleep() {
		System.out.println("every student sleep in the night");
	}

	public void play() {
		System.out.println("every student play in evening");
	}

}
