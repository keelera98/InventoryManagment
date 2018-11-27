/*
	Created by Austin Keeler
	
	Description:
		Manages products passed in. Can find the sum of the prices and remove products
*/
import java.util.LinkedList;
public class Inventory{
	private LinkedList<Product> productList = new LinkedList<Product>(); 
	
	public Inventory(){}
	
	public void addProduct(int id, int quantity, double price){
		productList.add(new Product(id, price, quantity));
	}
	
	//get(i) takes O(n) times, a fault of LinkedLists
	public double productSum(){
		double sum = 0;
		int i = 0;
		
		while(i < productList.size()){
			sum += productList.get(i).getPrice();
			i++;
		}
		
		return sum;
	}
	
	public void removeProduct(int id){
		productList.remove(id);
	}
}