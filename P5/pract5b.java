import java.util.*;
import java.lang.*;


class pract5b{
	 public static void main(String args[]){
		int temp;
	  int A[]= new int[10];
	  System.out.println("Enter 10 nos one by one:");
	  Scanner src= new Scanner(System.in);
	  for(int i=0;i<10;i++){
		A[i]=src.nextInt();
	  }
	  
	  for(int i=0;i<9;i++){
		  for(int j=0;j<9;j++){
			  if(A[j]>=A[j+1]){
				  temp=A[j];
				  A[j]=A[j+1];
				  A[j+1]=temp;
			  }
		  }
	  }
	  System.out.println("");
	  for(int i=0;i<10;i++){
		  System.out.println(A[i]);
	  }
	  
	 }
	 
}	 