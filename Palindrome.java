import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Palindrome
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();        
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.reverse();
        String r = sb.toString();
        System.out.println(r);
        if(a.equals(r))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }      
    }
}