class Program1 {
	public static void main(String[] args) {
		int opr=3;
		System.out.println("1:'+',2:'-'3:'*',4:'/',5:'%'");
		int a=10;
		int b=20;
		switch(opr) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			case 5:
				System.out.println(a%b);
				break;
	}
}
}
