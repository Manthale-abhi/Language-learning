class Pune {
	static int covidActiveCases=40000;
	int totalCases=50000;
	static void noCorona() {
		System.out.println("there is no corona we are safe");
	}
	void lockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("the active cases are"+ covidActiveCases);
		System.out.println("total casesc are "+ totalCases);
	}
	void noLockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("active cases are "+ covidActiveCases);
		System.out.println("total cases are "+ totalCases);
	}
}
class Mumbai {
	static int covidActiveCases=60000;
	int totalCases=80000;
	static void noCorona() {
		System.out.println("there is no corona we are safe");
	}
	void lockdown(){
		covidActiveCases++;
		totalCases++;
		System.out.println("the active cases are"+ covidActiveCases);
		System.out.println("total casesc are "+ totalCases);
	}
	void noLockdown() {
		covidActiveCases++;
		totalCases++;
		System.out.println("active cases are "+ covidActiveCases);
		System.out.println("total cases are "+ totalCases);
	}
}
class Maharashtra {
	public static void main(String[] args) {	
		Pune p1=new Pune();
		p1.noCorona();
		p1.lockdown();
		p1.noLockdown();
		Pune p2=new Pune();
		p2.noCorona();
		p2.lockdown();
		p2.noLockdown();
		Mumbai m1 = new Mumbai();
		m1.noCorona();
		m1.lockdown();
		m1.noLockdown();
		Mumbai m2 = new Mumbai();
		m2.noCorona();
		m2.lockdown();
		m2.noLockdown();
}	}
		



