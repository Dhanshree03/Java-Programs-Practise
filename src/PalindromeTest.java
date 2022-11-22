import java.util.Scanner;
public class PalindromeTest
{
    public static void main(String args[])
    {
        int num,rev=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
       num=sc.nextInt();

        temp=num;

        while(temp>0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        if(num==rev)
        {
            System.out.println(num+  " is Palindrome Number");
        }
        else
        {
            System.out.println( num + " is not a Palindrome Number");
        }
    }

}
