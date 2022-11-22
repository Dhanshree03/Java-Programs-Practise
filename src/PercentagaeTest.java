import java.util.Scanner;
public class PercentagaeTest
{
    public static void main(String[] args)
    {
        int m1,m2,m3,m4,m5;

        float total, Percentage, Average;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter the Five Subjects Marks : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        total = m1+m2+m3+m4+m5;
        Average = total / 5;
        Percentage = (total / 500) * 100;

        System.out.println(" Total Marks =  " + total);
        System.out.println(" Average Marks =  " + Average);
        System.out.println(" Percentage =  " + Percentage);
    }

}
