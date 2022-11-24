
class Cone
{
   public void getcone()
    {
        System.out.println("Cone Class");
    }
}
class  Oval extends Cone
{
    public void getoval()
    {
        System.out.println("Oval Class");
    }
}
class Cuboid extends Cone
{
    public void getcuboid()
    {
        System.out.println("Cuboid Class");
    }
}
class HierarchicalInheritanceTest1
{
    public static void main(String args[])
    {
        Cuboid c=new Cuboid();
        c.getcone();
        c.getcuboid();
    }
}
