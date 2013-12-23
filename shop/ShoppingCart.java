package shop;

import java.util.ArrayList;


public class ShoppingCart {
	
	private static ArrayList<Item> shoppingList = new ArrayList<Item>();
	
	//if there already is an instance of the item on the shopping list
	//the quantity of that instance is increased, else the item is 
	//added to the shopping list.
	
	public static void addToList( Item itemName)
	{ 
		boolean isUnique = true;
		for(Object i : shoppingList )
		{
			if (((Item)i).returnName().equals(itemName.returnName()))
			{
				((Item)i).increaseQuantity();
			    isUnique = false;
			}
			
		}
		if (isUnique == true)    
			shoppingList.add(itemName);
	}

	//decreases the quantity of item that is to be removed by one
	public static void removeFromList(int i)
	{
		shoppingList.get(i).decreaseQuantity();
		if (shoppingList.get(i).returnQuantity() == 0)
			shoppingList.remove(i);
	}
	
	//loops through the shopping list and prints out each item with the quantity of each other
	public static void printList()
	{
		System.out.println("your cart contains: ");
		for(Object i : shoppingList )
		{
			System.out.println(((Item) i).returnQuantity() + " " + ((Item) i).returnName() + "(s), Costing" + ((Item) i).returnPrice() + "each" );
		}
		
	}
	
	//prints a numeratized list
		public static void printList(int i)
		{
			System.out.println("type");
			int n = 1;
			for(Object o : shoppingList )
			{
				System.out.println( n  + " to remove a single " + ((Item) o).returnName() );
				n++;
			}
			
		}
	
	public static void search(int i)
	{
		int count = 0;
		for(Object o : shoppingList )
		{
		if (Inventory.getItem(i).returnName().equals(((Item) o).returnName()))
			{
			System.out.println("You have "+ ((Item)o).returnQuantity() + " " + ((Item)o).returnName() + "(s) in your cart");
			count ++;
			}
		}
		if (count ==0)
		{
			System.out.println("You do not have any " + Inventory.getItem(i).returnName() + "s in your cart" );
		}
		
	}
		
	//returns the shopping list 
	public static ArrayList<Item> returnList()
	{
		return shoppingList;
	}
	
	
}
