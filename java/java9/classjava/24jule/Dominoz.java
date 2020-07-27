
class Dominoz{

	int price=0;
	int quantity=0;
	static int total = 0;

	static void bill(){
	
		System.out.println("Total Bill = " + total);
	}

	public static void main(String []args){
	
		Dominoz pizza = new Dominoz();
		pizza.price = 300;
		pizza.quantity = 8;
		Dominoz.total = total + pizza.price * pizza.quantity;

		Dominoz fries = new Dominoz();
		fries.price = 50;
		fries.quantity = 6;
		Dominoz.total = total + fries.price * fries.quantity;
		bill();
	
	}
}

