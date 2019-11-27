class Polynomial{
	
	Term t[]= new Term[5];
	 int j=-1;
	
	Polynomial(){
		for(int i=0;i<5;i++){
			t[i]= new Term();
		}
	}	
	
	
	boolean setTerm(int c, int e){
		int count=0;
		if(j==4){
			System.out.println("There is no space to insert terms in polynomial\n");
			return true;
		}else if(e<0){
			System.out.println("Negative exponent not allowed\n");
			return false;
		}else{
			for(int i=0;i<5;i++){
				if(t[i].exponent==e){
					count++;
				}
			}
			if(count!=0){
				System.out.println("This exponent term already exits.");
				return false;
			}else{
				j++;
				t[j].exponent=e;
				t[j].coefficient=c;
				
			}
			return false;
		}
	}
	
	void sort(){
		for(int k=0;k<5;k++){
			for(int l=k;l<5;l++){
				if(t[k].exponent<t[l].exponent){
					int swap1=t[k].exponent;
					int swap2=t[k].coefficient;
					t[k].exponent=t[l].exponent;
					t[k].coefficient=t[l].coefficient;
					t[l].exponent=swap1;
					t[l].coefficient=swap2;
				}
			}
		}
	}
	
	void display(){
		sort();
		for(int i=0;i<5;i++){
			System.out.print(t[i].coefficient+"x"+t[i].exponent+" ");
		}
	}
}