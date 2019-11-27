class Rectangle{
	
	float length,breadth;
	
	Rectangle(){
		length=0;
		breadth=0;
	}
	Rectangle(float a,float b){
		setlength(a);
		setbreadth(b);
	}
	void setlength(float len){
		length=len;
	}
	void setbreadth(float br){
		breadth=br;
	}
	float getlenth(){
		return length;
	}
	float getbreadth(){
		return breadth;
	}
	
	float area(){
		return length*breadth;
	}
	
	void display(){
		System.out.println("Length of Rectangle is:"+getlenth());
		System.out.println("Breadth of Rectangle is:"+getbreadth());
		System.out.println("Area of Rectangle is:"+length*breadth);
	}
}