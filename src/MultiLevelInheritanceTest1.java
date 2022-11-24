
class SBIBank
{
    void createSBIaccount()
    {
        System.out.println("Account Created in SBI Bank");
    }
}
class HDFCBank extends SBIBank
{
    void createHDFCaccount()
    {
        System.out.println("Account Created in HDFC Bank");
    }
}
class AxisBank extends HDFCBank
{

        void createAxisaccount()
        {
            System.out.println("Account Created in Axis Bank");
        }

}

class MultiLevelInheritanceTest1
 {
     public static void main(String args[])
     {
         AxisBank a=new AxisBank();
         a.createSBIaccount();
         a.createHDFCaccount();
         a.createAxisaccount();
     }
}
