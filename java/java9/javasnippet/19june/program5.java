class Statickeyword {
	int age =21;
	static String family="Core2web ";
	String batch="java9";
	void methodOne() {
		Statickeyword obj2 =new Statickeyword();
		System.out.println("the age is "+age);
		System.out.println("the family is "+ obj2.family);
		System.out.println("The batch is"+batch);
	}
	void methodTwo() {
		int age =26;
		String batch="pythopn";
		Statickeyword obj3 =new Statickeyword();
		System.out.println("The age is "+age);
		System.out.println("The batch is "+ batch);
		System.out.println("The family is "+ obj3.family);
	}
}
class Mainmethod {
	public static void main(String[] args) {
		Statickeyword obj1 =new Statickeyword();
		obj1.methodOne();
		obj1.methodTwo();
		obj1.age=33;
		obj1.batch="ppa";
		System.out.println("The age is"+obj1.age);
		System.out.println("The batch is "+ obj1.batch);
		System.out.println("The family is"+Statickeyword.family);
	}
}



	
	
