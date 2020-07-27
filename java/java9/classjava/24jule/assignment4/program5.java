class Throwball {
	static int totalMatches=25;
	int years=5;
	static void display() {
		System.out.println("the total no of matches played are"+totalMatches);
	}
	void Experience() {
		System.out.println("total experience is"+ years);
	}
	public static void main(String[] args) {
		Throwball t =new Throwball();
		t.display();
		t.Experience();
	
	}
}
	
