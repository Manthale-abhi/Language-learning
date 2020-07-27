class PrepostDemo {
	public static void main(String[] args) {
		int a =20;
		int ans=0;;
		ans = a++ + a++;
		System.out.println("the value of a is " + a);//22
		System.out.println(ans);//41
		
		ans = ++a + a++;
		System.out.println(a);//24
		System.out.println(ans);//46
			
}
}


