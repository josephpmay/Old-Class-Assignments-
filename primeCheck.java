import java.util.Scanner;

public class primeCheck
{
  public static int enter;
  public static void main (String [] args)
  {
    enterData();
    runPrime.primeRunner(enter);
     
  }
  
  public static void enterData()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number ->");
    enter = input.nextInt();
    
  }
}

class runPrime
{
  static boolean notPrime = false;
  
  public static void primeRunner(int ent)
  {
    while (ent>2)
    {
      ent--;
      checkNumber(ent);
      if (notPrime == false)
       System.out.println(ent);
      notPrime= false;
    
    }
  }
  
  //goes through each number less than entered number

  
  public static void checkNumber(int ent)
  {
    
    for (int i = (ent -1); i>=2; i--)
    {
      
      if (ent % i == 0)
        notPrime = true;
    }
    //loops remainer division, if not prime, sets bool not prime to true
  }
  
 
  
  
  
  
  
}