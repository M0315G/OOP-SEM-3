import java.util.*;

class Number
{
	int firstNumber,secondNumber;
	float result;
	Number(int x,int y)
	{
		firstNumber = x;
		secondNumber = y;
	}
	
	void add()
	{
		result = firstNumber+secondNumber;
	}
	
	void sub()
	{
		result = firstNumber-secondNumber;
	}
	
	void mul()
	{
		result = firstNumber*secondNumber;
	}
	
	void div()  throws ArithmeticException
	{
        if(secondNumber==0)
        {
            throw new ArithmeticException("Divident Can not be Zero!");
        }
        else
        result = (float)firstNumber/secondNumber;
	}
}

class prac9c
{
	public static void main(String args[]) throws ArithmeticException
	{
		Scanner g = new Scanner(System.in);
		int c,x,y;
		System.out.println("Enter two numbers: ");
		x = g.nextInt();
		y = g.nextInt();
		Number n = new Number(x,y);
		System.out.println("\nEnter \n\t1 for addiiton\n\t2 for subtraction\n\t3 for multipliccation\n\t4 for division");
		c = g.nextInt();
		
		switch(c)
		{
            case 1: n.add();
                    System.out.println(n.result);
					break;
            case 2: n.sub();
                    System.out.println(n.result);
					break;
            case 3: n.mul();
                    System.out.println(n.result);
					break;
			case 4: try{
                    n.div();
                    System.out.println(n.result);
                    }catch(ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
					break;
		}			
		
	}
}