class IndianGovernment {
	int bannedProduct =59;
	static int approvedProduct=45;
	void Boycottproduct() {
		System.out.println("the no of banned product by indian gove are:"+bannedProduct);
	}
	static void Permission() {
		System.out.println("the no approved product are:"+ approvedProduct);
	}
	public static void main(String[] args) {
		IndianGovernment obj1 =new IndianGovernment();
		obj1.Boycottproduct();
		obj1.Permission();
	}

}
 
		
