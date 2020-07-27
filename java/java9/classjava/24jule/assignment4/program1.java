class opertor3 {
	int x=5;
	int y=3;
	float fx=5.1f;
	float fy=5.5f;
	char cx='a';
	char cy='c';
	double dx=23;
	double dy=78;
	void Bitwiseopertor() {
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		//System.out.println(fx&fy); (bad opertors)
		//System.out.println(fx|fy);
		//System.out.println(fx^fy);
		System.out.println(cx&cy);
		System.out.println(cx|cy);
		System.out.println(cx^cy);
		//System.out.println(dx&dy);{
		//System.out.println(dx|dy);	bad opertor
		//System.out.println(dx^dy);}
	}
	public static void main(String[] args) {
		opertor3 o1=new opertor3();
		o1.Bitwiseopertor();
	}
}
