interface Pet
{
   public void eat();
}
class Animal1 implements Pet
{
   public void eat()
    {
        System.out.println("Eat Method Called From Animal1 Class");
    }
}
class Animal2 implements Pet {
    public void eat()
    {
        System.out.println("Eat Method Called From Animal2 Class");
    }
}
 class InterfaceTest1
 {
     public static void main(String args[])
     {
         Pet p=new Animal1();
         p.eat();

         Pet p1=new Animal2();
         p1.eat();
     }


}
