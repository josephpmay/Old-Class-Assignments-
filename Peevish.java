import java.util.ArrayList;

public class Peevish
{
  public static void main (String [] args)
  {
    ArrayList<Door> boxes = new ArrayList<Door>();
    boxes.add(null);
    for (int i = 1; i<=100; i++)
    {
      boxes.add(new Door());
    }
      
      for (int k = 1; k<100; k++)
      {
        for (int j = k; j<=100; j+=k)
        {
        // int f = ((k)*j);
         
         boxes.get(j).changeState();
       
        }
        for (int q = 1; q<100; q++)
        {
          if (boxes.get(q).retunOpen() == true)
           System.out.print("[] ");
         else
           System.out.print("X ");
        }
        System.out.println();
        System.out.println();
      }
      
    }
  
  
  
  
  }
  
  
  
  


 class Door 
{
   private boolean isOpen;
 //  private int number;
   //
  public Door()
  {
    isOpen = false;
   // number = aNumber;
  }
  
  public void changeState()
  {
    if (isOpen == false)
      isOpen = true;
    else 
      isOpen = false;
  }
  
  public boolean retunOpen()
  {
   return isOpen; 
  }
  
  //public int getNumber()
  //{
  //  return number;
 // }
  
  
  
  
  
  
  
  
  
  
  
  
  
}