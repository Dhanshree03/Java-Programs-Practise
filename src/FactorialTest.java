import java.util.Scanner;
public class FactorialTest
{
        public static void main(String args[])
        {
            int i=1,fact=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number");
            int num=sc.nextInt();
            while(i<=num)
            {
                fact=fact*i;
                i++;
            }
            System.out.println("Factorial of given "+num+" is: "+fact);
        }
    }


