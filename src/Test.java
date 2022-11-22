import java.util.Scanner;
public class Test
{
    public static void main(String args[])
    {
        int num,rem,originalNum,res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Number");
        num=sc.nextInt();
        originalNum=num;
        while(originalNum>0)
        {
            rem=originalNum%10;
            //res += Math.pow(rem, 3);
            res=res+(rem*rem*rem);
            originalNum=originalNum/10;
        }
        if(num==res)
        {
            System.out.println("Entered Number is an armstrong number:" + num);
        }
        else
        {
            System.out.println("Entered Number is not an armstrong number:" + num);
        }
    }

}
