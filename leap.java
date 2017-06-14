import java.util.Scanner;
public class leap
{
    public static void main(String[] args) 
    {
        int a;
        Scanner s = new Scanner(System.in);
       
        a = s.nextInt();
        if(a%4==0)
        {
          System.out.println("given year is leap year");  
        }
        else
        {
        System.out.println("Given year is not leap year");
        }
    }
}
