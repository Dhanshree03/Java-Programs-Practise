class Base
{
    void show()
    {
        System.out.println("Base Class Called");
    }
}
class Derived extends Base
{
    void show()   //show() method overridden by Derived class.
    {
        System.out.println("Derived Class Called");

    }
}
class MethodOverridingTest
{
    public static void main(String[] args)
    {
        Derived d=new Derived();
        d.show();

    }
}
