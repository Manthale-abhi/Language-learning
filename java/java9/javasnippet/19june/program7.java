class India extends Object {
	India() {
		System.out.println("In india");
	}
}
class America extends Object {
	static {
		System.out.println("In static america");
	}
	America() {
		System.out.println("In india");
	}
}
class Run {
	public static void main(String[] args ) {
		India obj1 =new India();
		America obj2 = new America();
	}
}
