import java.util.Scanner;
public class n
{
    public static void main(String[] args) 
    {
        int n,summ=0;
        Scanner s = new Scanner(System.in);
       
        n= s.nextInt();
       for(int i=0;i<=n;i++)
       {
        summ=summ+i;
        }
        
        System.out.println("Sum of No="+summ);
    }
}

