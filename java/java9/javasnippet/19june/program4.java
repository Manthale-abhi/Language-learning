class InstanceVarible {
	int age=21;
	String name="abhi";
	long pn = 80687896;
	float wt=58f;
	void DisplayInfo() {
		System.out.println("the age is "+ age);
		System.out.println("the name is "+ name);
		System.out.println("The pn is" + pn);
		System.out.println("The wt is"+ wt);
	}
}
class mainDemo {
	public static void main(String[] args) {
		InstanceVarible obj1 = new InstanceVarible();
		obj1.DisplayInfo();
	}
}

























