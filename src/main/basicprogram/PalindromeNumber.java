package main.basicprogram;

public class PalindromeNumber
{
     public static void main (String []args)
     {
         int no = 121;
         int temp = no; //121
         int rev =0,rem;
         while(temp !=0)
         {
             rem = temp%10; //1
             rev = rev*10+rem;// 0*10+1
             temp=temp/10;  //212
         }
         if(no==rev)
         {
             System.out.println(no+" No is Palindrome");
         }
         else
         {
             System.out.println(no+" No no Palindrome");
         }

     }
}
