import java.util.*;
public class duparray
{
    public static void main(String muru[])
{
    Scanner sc=new Scanner(System.in);
    int n,i,j;
    n=sc.nextInt();
    int []arr=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
      
      for(i=0;i<n;i++)
      {
           for(j=0;(j<n)&&(i!=j);j++)
           {
               if(arr[i]==arr[j])
               {
               System.out.println(arr[i]);  
               }
             
           } 
      }
     
     
}    
}

