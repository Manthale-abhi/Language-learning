import java.util.Scanner;
class Program6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);		
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("the no is greater than zero"); 
		}
		else if(a<0) {
			System.out.println("the no is less than zero");
		}
		else {
			System.out.println("the no is equal to zero");
		}
	}
}
