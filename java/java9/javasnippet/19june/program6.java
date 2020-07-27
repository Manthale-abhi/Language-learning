class staticmethod {
	int rn=40;
	static String family ="core2web";
	String batch ="java";
	static void smethod() {
		System.out.println("welcome in static method");
	}
	void methodOne() {
		staticmethod obj2 =new staticmethod();
		System.out.println("the age is "+ rn );
		System.out.println("the family is "+ obj2.family);
		System.out.println("The batch is"+batch);
	}
	void methodTwo() {
		Statickeyword obj3 =new Statickeyword();
		System.out.println("The age is "+rn);
		System.out.println("The batch is "+ batch);
		System.out.println("The family is "+ obj3.family);
	}
}
class Mainmethod {
	public static void main(String[] args) {
		staticmethod obj1 =new staticmethod();
		obj1.methodOne();
		obj1.methodTwo();
		staticmethod.smethod();
		obj1.rn=45;
		obj1.batch="ppa";
		System.out.println("The age is"+ obj1.rn);
		System.out.println("The batch is "+ obj1.batch);
		System.out.println("The family is"+Statickeyword.family);
	}
}



	
