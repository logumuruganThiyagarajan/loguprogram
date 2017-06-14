import java.util.Scanner;
public class sum
{
    public static void main(String[] args) 
    {
        int n,summ=0;
        Scanner s = new Scanner(System.in);
       
        n= s.nextInt();
       for(int i=1;i<=n;i++)
       {
        summ=summ+i;
        }
        
        System.out.println("Sum of No="+summ);
    }
}
