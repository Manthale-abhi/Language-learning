class IndianNeavy {
	static int totalcandidate=200000;
	int salary=70000;
	static void count() {
		System.out.println("the total candidates"+ totalcandidate);
	}
	void Income() {
		System.out.println("the annual income is "+ salary);
	}
}
class IndianArmy {
	static int totalcandidate =150000;
	int salary=80000;
	static void count() {
		System.out.println("totalcandidate are"+ totalcandidate);
	}
	void Income() {
		System.out.println("total income is "+ salary);
	}
}
class IndianAirforce {
	static int totalcandidate=100000;
	int salary=100000;
	static void count() {
		System.out.println("the total candidates are"+ totalcandidate);
	}
	void Income() {
		System.out.println("the income is"+ salary);
	}
}
class IndianServices {
	public static void main(String [] args) {
		IndianNeavy obj1 = new IndianNeavy();
		obj1.count();
		obj1.Income();
		IndianArmy obj2=new IndianArmy();
		obj2.count();
		obj2.Income();
		IndianAirforce obj3=new IndianAirforce();
		obj3.count();
		obj3.Income();
	}
}




		
	
