class opertors2 {
	public static void main(String[] args) {
		int i=5;
		int j=4;
		boolean ans;
		ans = (i++ >= j++)  && (--j < i++);
		System.out.println(ans);//true
		System.out.println(i+" "+j);
		System.out.println((--i < j--) || (j++ >= ++i));//false
		System.out.println(7 +""+4);
	}
}
