import java.util.*;
public class ap
{
    public static void main(String muru[])
{
    Scanner sc=new Scanner(System.in);
      String a=sc.next();
      char ch=a.charAt(0);
      if(Character.isLetter(ch))
      {
          System.out.println("Given input is Letter");
      }
      else
      {
            System.out.println("Given input is Not Letter");
      }
     
}    
}
