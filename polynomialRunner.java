import java.util.*;
public class polynomialRunner {
	
	static int degree;
	static Scanner input = new Scanner(System.in);
	static LinkedList<Integer> polyList = new LinkedList<Integer>();
	static LinkedList<Integer> polyList2 = new LinkedList<Integer>();
	static int xValue;
	static int sum;
	
	public static void main (String[]Args)
	{
		System.out.println("#####     ENTER-POLY METHOD     #####");
		System.out.println();
		System.out.print("Enter the degree of the polynomial     ===>>    ");
		degree = input.nextInt();
		System.out.println();
		for (int i = degree;  i >=0; i--)
		{
			System.out.print("Enter coefficient for X^" + i + " If no term exists, enter 0 ===>>   ");
			polyList.addFirst(input.nextInt());
			
		}
		System.out.println();
		System.out.println();
		System.out.println("#####     ENTER-XVALUE METHOD     #####");
		System.out.println();
		System.out.print("Enter X value of the polynomial      ====>>     ");
		xValue = input.nextInt();
		System.out.println();
		System.out.println("#####     DISPLAY-POLY METHOD     #####");
		System.out.println();
		
		int thisIntDoesNothing;
		for (int i = polyList.size(); i>0; i--)
		{
			polyList2.addFirst(polyList.get(i-1));
		}
		//polyList2 = polyList;
		System.out.println(polyList2);
		
		System.out.print("Y = " + polyList.removeFirst());
		
		for (int i = 1; i<= degree; i++)
		{
			if (polyList.getFirst()==0)
				polyList.removeFirst();
			else if (i == 1)
				System.out.print(" + " + polyList.removeFirst() + "X");
			else if(polyList.getFirst()==1)
				System.out.print(" + " + "X^" + i);
			else
				System.out.print(" + " + polyList.removeFirst() + "X^" + i);
		}
		//System.out.println("cat" + polyList2);
		
			System.out.println();
			System.out.println("#####     COMPUTE-POLY METHOD     #####");
			System.out.println();
			System.out.println();
			sum = polyList2.removeFirst();
			for (int i = 1; i<= degree; i++)
			{
				sum+= (polyList2.removeFirst() * (Math.pow(xValue, i)));
			}
			
			System.out.println("#####     DISPLAY-VALUE METHOD     #####");
			System.out.println();
			System.out.println("Y(" + xValue + ") = " + sum);
	}

}
