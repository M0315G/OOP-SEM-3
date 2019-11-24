import java.lang.Exception;
import java.util.*;

class LowSaleException extends Exception
{
    public LowSaleException( String s)
    {
        super(s);
    }
}
class emp
{
    int empId;
    String empName, desig;
    double basic,hra;

    emp(int i,String n, String d, double b)
    {
        empId = i;
        empName = n;
        desig = d;
        basic = b;
    }
    void printDet()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("ID: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Designation: "+desig);
        System.out.println("Salary: "+hra);
        System.out.println("\n-------------------------------\n");
    }
    boolean calcHra()
    {
        if(desig.equals("Manager"))
            hra = basic + (basic*0.1);
        else if(desig.equals("Officer"))
            hra = basic + (basic*0.15);
        else 
            hra = basic + (basic*0.05);
        if(basic < 500)
        {
            try 
            {
                throw new LowSaleException("");
            }
            catch(LowSaleException e)
            {
                System.out.println("Low salary....");
                return false;
            }
        }
        return true;
    }
}

class prac9e
{
    public static void main(String args[])
    {
        Scanner g = new Scanner(System.in);
        System.out.println("Enetr the ID: ");
        int i = g.nextInt();
        g.nextLine();
        System.out.println("Enter name: ");
        String n = g.nextLine();
        System.out.println("Enter the designation: ");
        String d = g.nextLine();
        emp e;
        boolean check = true;
        do
        {
            System.out.println("Enter basic salary: ");
            double s = g.nextDouble();
            e = new emp(i,n,d,s);
            check = e.calcHra();
        }while(check != true);
        e.printDet();
    }
}