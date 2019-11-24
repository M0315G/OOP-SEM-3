import java.lang.Exception;
import java.util.*;

class IllegalvalueException extends Exception
{
    public IllegalvalueException(String s)
    {
        super(s);
    }
}

class check
{
    int n1,n2;
    check(int a,int b)
    {
        n1 = a;
        n2 = b;
    }
    boolean show()
    {
        if(n1 < 0 || n2 < 0)
        {
            try
            {
                throw new IllegalvalueException("");
            }
            catch(IllegalvalueException e)
            {
                System.out.println("Enter valid positive numbers!");
                return false;
            }
        }
        else
        {
            System.out.println("Numbers are "+n1+" & "+n2);
        }
        return true;
    }
}

class prac9f
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean check =true;
        do
        {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            check u =new check(a,b);
            check = u.show();
        }while(check != true);

    }
}