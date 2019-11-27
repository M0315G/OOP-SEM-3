import java.util.*;
class Complex{
	float r1,r2,i1,i2;
	Complex(){
		r1=0;
		r2=0;
		i1=0;
		i2=0;
	}
	
	void addition(){
		display("Sum",r1+r2,i1+i2);
	}
	
	void subtraction(){
		display("Subtraction",r1-r2,i1-i2);
	}
	void display(String s,float a, float b){
		System.out.println(s+"of "+(int)r1+"+"+(int)i1+"i "+" & "+(int)r2+"+"+(int)i2+"i "+"is:"+(int)a+"+"+(int)b+"i ");
	}

}


class Practical6c{
	
	public static void main(String args[]){
		Complex c=new Complex();
		System.out.println("Enter the first complex no:");
		Scanner src= new Scanner(System.in);
		c.r1=src.nextFloat();
		c.i1=src.nextFloat();
		System.out.println("Enter the second complex no:");
		c.r2=src.nextFloat();
		c.i2=src.nextFloat();
		System.out.println("Enter 1 for addition.\n 2 for subtraction");
		int choice=src.nextInt();
		if(choice==1){
			c.addition();
		}else if(choice==2){
			c.subtraction();
		}else{
			System.out.println("Not a valid choice");
		}
	}

}