interface pet
{
    public void run();
}
interface pet1
{
   public  void eat();
}
class Animal implements pet,pet1
{
      public  void run()
        {
           System.out.println("Run method overridden");
        }

       public  void eat()
        {
        System.out.println("Eat method overridden");
        }

}
class MultipleInheritanceTest
 {
     public static void main(String args[])
     {
      Animal a=new Animal();
      a.run();
      a.eat();
     }
 }
