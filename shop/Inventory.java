package shop;

import java.util.ArrayList;

public class Inventory {

	//builds the inventory item by item
	private static Item littleJava = new Item(30,"Little Java", 28);
	private static Item cookie = new Item(.50, "Cookie", .48);
	private static Item schram = new Item(350.49, "Schram's Java AP", 330.38);
	private static Item iPhone4 = new Item(550, "iPhone 4", 549.99);
	private static Item iPhone4s = new Item(650, "iPhone 4s", 649.99);
	private static Item iPhone5 = new Item(750, "iPhone 5", 749.99);
	private static Item hernandez = new Item(90.01, "Hernandez", 27.9);
	private static Item macbook = new Item(71, "Macbook Pro", 54);
	private static ArrayList <Item> inventoryHolder = new ArrayList<Item>();
	
	//adds each item of the inventory to an array list (see above) and then prints it
	public Inventory()
	{
	inventoryHolder.clear();
	inventoryHolder.add(littleJava);
	inventoryHolder.add(cookie);
	inventoryHolder.add(schram);
	inventoryHolder.add(iPhone4);
	inventoryHolder.add(iPhone4s);
	inventoryHolder.add(iPhone5);
	inventoryHolder.add(hernandez);
	inventoryHolder.add(macbook);
	
	printInventory(inventoryHolder);
	}
	
	//if a call number is called, the corresponding inventory member is returned
	public static Item getItem( int input)
	{
		return inventoryHolder.get(input-1);
		
	}
	
	//prints the inventory with an call number
	public void printInventory(ArrayList<Item> arrayHolder)
	{
		
		int c = 1;
		for(Object i : arrayHolder )
		{
			System.out.println("To add a " +  ((Item) i).returnName() + " to your cart, type "+ c);
			c++;
		}
		
		System.out.println("To view what is in your cart, type 666");
		System.out.println("To check-out, type 777");
		System.out.println("To search for an item in your cart, type 888");
	}
	
}

