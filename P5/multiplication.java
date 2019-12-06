import java.util.Scanner;
class sumultiarray
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows and columns for matricies A and B");
		int i,j,k;
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		int p= sc.nextInt();
		System.out.println("For Addition write A and For Multiplication write m");
		char y= sc.next().charAt(0);
		if(y=='A')
		{ 
		   if(x==z && y==p)
		   {
			int a[][];
			int b[][];
			int c[][];
			a= new int[x][y]; 
			b= new int[z][p];
			c= new int[x][y];
			System.out.println("Sum is possible. So,Enter the element of matrix A first and then B");
			for(i=0;i<x;i++)
			{
				for(j=0;j<y;j++)
				{
					a[i][j]= sc.nextInt();
				}
			}
			for(i=0;i<x;i++)
			{
				for(j=0;j<y;j++)
				{
					b[i][j]= sc.nextInt();
				}
			}
			for(i=0;i<x;i++)
			{
				for(j=0;j<y;j++)
				{
					c[i][j]= a[i][j]+b[i][j];
					System.out.print(c[i][j] +" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Sum is not possible");
		}
	        }

		else
		 {
		    if(n==o)
		    {
			int a[][];
			int b[][];
			int d[][];
			a= new int[x][y]; 
			b= new int[z][p];
			d= new int[x][p];
			System.out.println("Multiplication is possible. So,Enter the elements of matrix A first and then B");
			for(i=0;i<x;i++)
			{
				for(j=0;j<y;j++)
				{
					a[i][j]= sc.nextInt();
				}
			}
			
			for(i=0;i<z;i++)
			{
				for(j=0;j<p;j++)
				{
					b[i][j]= sc.nextInt();
				}
			}
		
			for(i=0;i<x;i++)
			{
				for(j=0;j<p;j++)
				{
					for(k=0;k<y;k++)
					{
						d[i][j]+=a[i][k]*b[k][j];
						
					}
					System.out.print(d[i][j] +" ");
				}
					System.out.println();
				
			}
			
		
			 
		}
		else
		{
			System.out.println("Multiplication is not possible");
		}

		
		}
	}
}			