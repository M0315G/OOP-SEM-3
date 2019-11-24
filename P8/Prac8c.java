import java.util.Scanner;

public class Prac8c {
    public static void main(String[] args) {
        Result student1 = new Result();
        student1.Display();
    }
}

class Student{

    String name;
    int RollNo;
    Scanner S = new Scanner(System.in);

    Student(){
       setName();
        setRollNo();        
    }

    void setName(){
        System.out.println("Enter Student Name: ");
        name = S.nextLine();
    }

    void setRollNo(){
        System.out.println("Enter Student RollNo: ");
        RollNo = S.nextInt();
    }
}

class Exam extends Student{
    int DSA,OOP,DM,DE,DC,PE;
    Scanner S = new Scanner(System.in);
    Exam(){
        setMarks();        
    }

    void setMarks(){
        System.out.println("Enter the marks in Order of DSA, OOP, DM, DE, DC, PE: ");
        DSA =  S.nextInt();
        OOP =  S.nextInt();
        DM =  S.nextInt();
        DE =  S.nextInt();
        DC =  S.nextInt();
        PE = S.nextInt();
    }
}

class Result extends Exam{
    int total_marks;
    double average_marks;

    Result(){
        total_marks = DSA + OOP + DM +DE + DC + PE;
        average_marks = (double)total_marks/6.0;
    }

    void Display(){
        System.out.println("Average is " + average_marks);
        System.out.println("Total is " + total_marks);
    }
}