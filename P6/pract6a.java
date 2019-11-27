import java.util.*;
class pract6a{
	public static void main(String args[]){
		float a,b;
		Rectangle r[]= new Rectangle[5];
		Scanner src= new Scanner(System.in);
		for(int i=0;i<5;i++){
			a=src.nextFloat();
			b=src.nextFloat();
			r[i]= new Rectangle(a,b);
		}
		
		for(int i=0;i<5;i++){
			r[i].display();
		}
	
	}

}