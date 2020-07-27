class Prepost2 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=50;
		int ans =0;
		ans=a++ + --b + c--;
		System.out.println("tha ans is"+ ans);//79
		System.out.println("the ans is "+a)	;//11
		System.out.println("the ans is "+b);//19
		System.out.println("the ans is "+c);//49
	}
}
