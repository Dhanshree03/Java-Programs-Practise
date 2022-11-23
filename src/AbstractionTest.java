import java.util.Scanner;

abstract class Shape
{
    public void display()
    {
        System.out.println("I am from abstract class");
    }
    public abstract void area();//abstract method

}
class Square extends Shape
{
    public void area()
    {
        System.out.println("Enter side of a square");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Area of Square is:" +(s*s));
    }
}
class Circle extends Shape
{
    public void area()
    {
        System.out.println("Enter radius of circle");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Area of Circle is:" +(3.14*r*r));
    }
}
public class AbstractionTest
{
    public static void main(String[] args)
    {
      Shape s=new Square();
      s.display();
      s.area();


      Shape s1=new Circle();
      s1.area();

    }
}