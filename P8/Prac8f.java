import java.util.Scanner;

public class Prac8f {
    public static void main(String[] args) {
        Rank class1 = new Rank();
        class1.readValues();        
        class1.highest();
        class1.display();
    }
    
}

class Record{
    Scanner S = new Scanner(System.in);
    String name[] = new String[5];
    int rank[] = new int[5];

    Record(){
        for (int i = 0; i < name.length; i++) {
            //name[i] = new String();
            name[i] = "\0";
            rank[i] = 0;
        }
    }

    void readValues(){
        for (int i = 0; i < name.length; i++) {
            name[i] = new String();
            System.out.println("Enter the name of Student "+ (i+1) + ": ");
            name[i] = S.next();
            System.out.println("Enter the rank of Student "+ (i+1) + ": ");
            rank[i] = S.nextInt();
        }
    }

    void display(){
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name: "+ name[i] +" \tRank: "+ rank[i]);
        }
    }
}

class Rank extends Record{
    int index;

    Rank(){
        super();
        index = 0;
    }

    void highest(){
        int max = rank[0];

        for (int i = 0; i < rank.length; i++) {
            if(max < rank[i]){
                max = rank[i];
                index = i;
            }
        }
        
    }

    void display(){
        super.display();
        System.out.println("Highesr rank is " + rank[index] + " & Name is " + name[index]);
    }
}