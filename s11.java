import java.util.*;
public class s11
{
    public static void main(String muru[])
    {
         Scanner sc=new Scanner(System.in);
        int a,b,p=1,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        {
            p=p*a;
        }
        System.out.println("Power="+p);
    
    }
    
}


