import java.util.*;

class CalcAverage
{
	public static double average( int n)
	{
		double sum = 0;
        for(int i = 1; i <= n; i++) 
        sum += i;
		return sum/n;
	}
}

class prac9b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float i = 0;
		double avg = 0;
		int n = 0;
		System.out.println("Enter the number: ");
		do
		{
			i = sc.nextFloat();
			n = (int)i;
			try
			{
				if(n != i || n<=0)
					throw new IllegalArgumentException();
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Invalid data! Please enter again: ");
			}
		}while(n != i || n<=0);
		avg = CalcAverage.average(n);
		System.out.println("Average of first "+n+" number is "+avg);
	}
}