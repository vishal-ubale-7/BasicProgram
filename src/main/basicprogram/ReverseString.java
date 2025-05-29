package main.basicprogram;

public class ReverseString
{
    public static void main(String[] args)
    {
        String name= "ABCDEFGHIJKLMNOPQURSTWXYZ";  // create string
        int lang = name.length();   // use the length method 
        String rev ="";
        for(int i = lang-1;i>=0;i--)
        {
            rev= rev + name.charAt(i);     // use the charAt method
        } 
        System.out.println( "Reverse String "+rev);
    }
}


