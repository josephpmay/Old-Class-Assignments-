package shop;

public class Item {
	
	
	private  double itemPrice;
	private  double bulkItemPrice;
	private  String itemName;
	private int itemQuantity = 1;
	
	//constructor 
	public Item (double price, String name, double bulkPrice)
	{
		itemPrice = price;
		bulkItemPrice = bulkPrice;
		itemName = name;
	}
	
	//increases the quantity of items
	public void increaseQuantity()
	{
		itemQuantity++;
	}
	
	//decreases the quantity of items
	public void decreaseQuantity()
	{
		itemQuantity--;
	}
	
	//returns the name of the item
	public String returnName()
	{
		return itemName;
	}
	
	//returns the number of the specific item
	public int returnQuantity()
	{
		return itemQuantity;
	}
	
	//returns the current set price of the item
	public double returnPrice()
	{
		if (itemQuantity == 1)
			return itemPrice;
		else
			return bulkItemPrice;
	}
}

