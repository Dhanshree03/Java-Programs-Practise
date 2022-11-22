import java.util.Scanner;
public class AdditionTest
{
    public static void main(String args[])
    {
        int num,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers:");
        num=sc.nextInt();

        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Addition is:" + sum);
    }

}
