import java.util.*;
public class ArrayComputer
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String [] args)
  {
    System.out.println("How many integers are in this array?");
    int x = sc.nextInt();
    int[] array = new int[x];
    for (int i = 0; i<x; i++)
    {
      System.out.println("Please input your next integer");
      array[i] = sc.nextInt();
    }
    boolean isPos = true;
    int k = 0;
    for (int j = 0; j<x; j++)
    {
      if (isPos == true)
      { k = k + array[j];
        isPos = false; }
      else
      { k = k - array[j];
        isPos = true;}
      
    }
    System.out.println(k);
    
  }
  
  
  
  
}