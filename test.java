import java.util.*;
public class test {

    public static void main(String[] args) {
       
     Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
  
    char [] temp = s.toCharArray();
    int length =temp.length; 
    for (int i=0;i<length;i++)
    {
        for (int j = i+1; j<length;j++)
        {
            if(temp[i]==temp[j])
            {
                int test =j;
                for(int k=j+1; k<length ; k++)
                {
                    temp[test] = temp[k];
                    test++;
                }
                length--;
                j--;
            }
        }
    }
    String a=String.copyValueOf(temp).substring(0,length);
   System.out.println(a);

       
    }

}
