import java.util.*;
public class fabonacci_series
{
    public static void main(String args[])
    {
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter number of terms: ");
         int n =sc.nextInt();
         int a= 1;
         int b=1;
         System.out.print(a + " " + b + " ");
         for (int i=1;i<=(n-2);i++)//for(int i=3;i<=n;i++)
         {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
         }
         
    }
    }

