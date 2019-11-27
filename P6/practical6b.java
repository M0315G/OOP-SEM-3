import java.util.*;
class practical6b{
	public static void main(String args[]){
		Polynomial p= new Polynomial();
		int c,e;
		boolean b=false;
		while(b==false){
			System.out.println("Enter coefficient and exponent of a term of polynomial");
			Scanner src= new Scanner(System.in);
			c=src.nextInt();
			e=src.nextInt();
			b=p.setTerm(c,e);
		}
		
		System.out.println("The polynomial you entered is:");
		p.display();
		
	}
}