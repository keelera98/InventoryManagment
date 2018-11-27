//Created by Austin Keeler
public class Product{
	private int id, quantity;
	private double price;
	
	public Product(int id, double price, int quantity){
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Product(){
		id = 0;
		price = 0;
		quantity = 0;
	}
	
	public int getId(){
		return id;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
}