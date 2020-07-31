import java.util.Scanner;
class program3{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char c1 =sc.next().charAt(0);
		switch(c1) {
			case 'c' :
				System.out.println("c");
				break;
			case 'j':
				System.out.println("java");
				break;
			case 'p':
				System.out.println("python");
				break;
		}
	}
}		
