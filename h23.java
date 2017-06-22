import java.util.*;
public class h23
{
    public static void main(String[] muru)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int x=0;
        int a[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j]||a[i]!=a[j]&&(i!=j))
                {
                     x=a[i]+a[j];
                
                if(b==x)
                {
                    System.out.println(a[i]+" "+a[j]);
                
                    temp=1;
                }
                } 
            }
            
        }
        if(temp==0){
            System.out.println("No Possible");
        }
        //for(int i:a)
        //{
            //System.out.print(i+" ");
        //}
        
    }
}



