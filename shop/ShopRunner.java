package shop;
import java.util.*;

public class ShopRunner {

	//constructs and prints out the inventory
	//loop-> gets input
	//if input asks to see cart or checkout or search, does that
			//if asks to remove item (after seeing cart) does that
	//else adds item to cart
	public static void main (String[]args)
	{
		Inventory inven = new Inventory();
		Scanner input = new Scanner(System.in);
		boolean notExit = true;
		while (notExit)
		{
			System.out.println("which item would you like to add to your cart?");
			int i = input.nextInt();
			if (i == 666)
			{
				ShoppingCart.printList(); 
				System.out.println("Whould you like to remove any items from your cart? (yes/no)");
				String c = input.next();
				if (c.equals("yes"))
				{
					System.out.println("Which items would you like to remove?");
					ShoppingCart.printList(1);
					int in = input.nextInt();
					ShoppingCart.removeFromList(in-1);
				}
				
			}
				
			else if (i == 777)
			{
				System.out.println("You're total is $" + determineTotal(ShoppingCart.returnList()));
				System.out.println("Thank You for shopping at ''Perezazon.com''");
				notExit = false;
			}
			else if (i ==888)
			{
				System.out.println("Which Inventory # would you like to search for?");
				int in = input.nextInt();
				ShoppingCart.search(in);
			}
			else
				ShoppingCart.addToList(Inventory.getItem(i));
		}
	}
	
	//loops through every item in the list and adds the price of that item 
	//(times the quantity of that item) to the total price, then returns 
	// the total price 
	public static double determineTotal(ArrayList<Item> arrayHolder)
	{
		double t = 0;
		for(Object k : arrayHolder )
		{
			t += (((Item)k).returnQuantity() * ((Item)k).returnPrice());
		}
		return t;
	}
	
	
	
}
