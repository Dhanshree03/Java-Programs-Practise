
import java.util.Scanner;
class Shape1
{
    public void circlearea()
    {
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of Circle is:" + (3.14 * r * r));
    }
}

 class Square1 extends Shape1
{
    public void squarearea()
        {
        System.out.println("Enter side square");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Area of Square is:" +(s*s));
        }
}
class SingleInheritanceTest1
{
     public static void main(String args[])
     {
     Square1 s=new Square1();
     s.circlearea();
     s.squarearea();
     }
}
