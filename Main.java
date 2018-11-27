//Created by Austin Keeler
public class Main{
	public static void main(String args[]){
		Inventory inventory = new Inventory();
		
		inventory.addProduct(0, 20, 10.50);
		inventory.addProduct(1, 10, 1.50);
		inventory.addProduct(2, 5, 0.50);
		inventory.addProduct(3, 50, 20.00);
		inventory.addProduct(4, 25, 15.00);
		
		System.out.println("Sum: " + inventory.productSum());
		
		inventory.removeProduct(2);
		inventory.removeProduct(0);
		
		System.out.println("Sum: " + inventory.productSum());
	}
}