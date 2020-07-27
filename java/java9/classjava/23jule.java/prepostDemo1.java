class PreDemo {
	public static void main(String [] args) {
		int a =10;
		int ans = 0;
		ans = ++a;
		System.out.println(a);//11
		System.out.println(ans);//11
		
		ans= ++a + ++a;
		System.out.println(a);//13
		System.out.println(ans);//25
	}
}
