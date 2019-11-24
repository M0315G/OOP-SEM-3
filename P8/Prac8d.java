import java.util.Scanner;

public class Prac8d {
    public static void main(String[] args) {
        Medicine list[] = new Medicine[10];

        for (int i = 0; i < list.length; i++) {
 
            int range = 4; 
            int rand = (int)(Math.random() * range);
            
            if(rand == 1){
                list[i] = new Syrup();
                
            }else if(rand == 2){
                list[i] = new Ointment();
                
            }else if(rand == 3){
                list[i] = new Tablet();
                
            }
        }

        for (Medicine x : list) {
            x.displayLabel();
        }
    }
    
}

class Medicine{
    String name;
    String address;

    Medicine(){
        setName();
        setAddress();
    }

    Medicine(String Name, String Addr){
        setName(Name);
        setAddress(Addr);
    }

    void setName(String Name){
        name = Name;
    }

    void setAddress(String Address){
        address = Address;
    }

    void setName(){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Pharma Name: ");
        name = S.nextLine();
    }

    void setAddress(){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Address: ");
        address = S.nextLine();
    }

    void displayLabel(){
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
    }
}

class Syrup extends Medicine{

    void displayLabel(){
        super.displayLabel();
        System.out.println("Shake well before use\n");
    }
}

class Ointment extends Medicine{

    void displayLabel(){
        super.displayLabel();
        System.out.println("For External use only\n");
    }
}

class Tablet extends Medicine{

    void displayLabel(){
        super.displayLabel();
        System.out.println("Store in a cool dry place\n");
    }
}
