import java.util.*;

class operations{
	
	void add(int a[][],int b[][], int c[][]){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	
	void multiply(int a[][],int b[][],int d[][]){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					d[i][j]=a[i][k]+b[k][j];
				}
				
			}
		}
	}
}

class pract5c{
	
	public static void main(String args[]){
		int a[][]={{1,2,3},{1,2,3},{1,2,3}};
		int b[][]={{4,5,6},{4,5,6},{4,5,6}};
		int c[][] = new int[3][3];
		int d[][]=new int[3][3];
		
		operations obj= new operations();
		obj.add(a,b,c);
		obj.multiply(a,b,d);
		System.out.println("The result of addition is:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]);
			}System.out.println("");
		}
		System.out.println("The result of multiplication is:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(d[i][j]);
			}System.out.println("");
		}
	}
}