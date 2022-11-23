public class MethodOverloadingTest
{
    void area(int l,int b)
    {
        System.out.println("Area of Rectangle is:" +(l*b));
    }

    void area(float r)
    {
        System.out.println("Area of Circle is:" +(3.14*r*r));
    }


    public static void main(String args[])
    {
        MethodOverloadingTest d=new MethodOverloadingTest();


     d.area(5,5);
     d.area(2);




    }

}

