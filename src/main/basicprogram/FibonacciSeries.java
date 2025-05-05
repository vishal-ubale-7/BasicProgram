package main.basicprogram;

public class FibonacciSeries
{
   public static void main (String []args)
   {
         int a=0;
         int b=1;
         int c;
         for(int i=1;i<=5;i++)
         {
             c=a+b;
             System.out.print(c);
             a=b;
             b=c;
         }
   }
}
