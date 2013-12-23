import java.util.*;
public class Substring {

	public static void main (String []args)
	{
		Scanner input = new Scanner(System.in);
		String originalText= new String();
		originalText = input.nextLine();
		int counter1 = originalText.length();
		int i = 0;
		sub(originalText,counter1, i);
	}
	
	public static void sub(String text, int counter1, int i)
	{
		int counter2 = counter1;
		
			for (int n = 0; n<counter2; n++)
			{
				System.out.println(text.substring(i, ((counter2 + i)-n))); 
			}
		i++;
		counter2--;
		if (i<text.length())
			sub(text, counter2, i);
	}
	
}
