import java.io.*;
import java.util.*;


class EmptyFieldException extends Exception {
    EmptyFieldException(String Message){
        super(Message);
    }
}

public class Writer_10f {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String Name;
        while (true) {
            System.out.print("Enter your Name: ");
            try {
                Name = s.nextLine();
                if(Name.equals("")) throw new EmptyFieldException("Name Can't be empty");
                break;
            } catch (EmptyFieldException E) {
                System.out.println(E.getMessage());
            }
        }

        System.out.print("Enter Roll No.");
        int rollNo;
        while (true) {
            try{
                rollNo = s.nextInt();
                break;
            }catch(Exception E){
                System.out.println(E.getMessage());
            }
        }
        System.out.print("Enter Age:");
        int age;
        while (true) {
            try{
                age = s.nextInt();
                break;
            }catch(Exception E){
                System.out.println(E.getMessage());
            }
        }

        String Address;
        while (true) {
            System.out.print("Enter your Address: ");
            try {
                s.nextLine();
                Address = s.nextLine();
                if(Address.equals("")) throw new EmptyFieldException("Address Can't be empty");
                break;
            } catch (EmptyFieldException E) {
                System.out.println(E.getMessage());
            }
        }

        System.out.println("Want to write to a file? YES/NO");
        String choice;
        while (true) {
            System.out.println("Enter the Choice: ");
            try {
                choice = s.nextLine();
                if(choice.equals("")) throw new EmptyFieldException("choice Can't be empty");
                
                if (choice.toLowerCase().contains("yes")) {
                    File f = new File("data.txt");
                    try{
                    BufferedWriter writer =new BufferedWriter(new FileWriter(f,true));
                    writer.write("Name : " + Name + "\n" );
                    writer.write("Rol No. : " + rollNo+ "\n" );
                    writer.write("Age : " + age+ "\n");
                    writer.write("Address : "+ Address+ "\n");
                    writer.close();
                   
                }catch(Exception E){
                    System.out.println(E);
                }
                }
                else if (choice.toLowerCase().contains("no")) {
                    return;
                }
                
                break;
            } catch (EmptyFieldException E) {
                System.out.println(E.getMessage());
            }
        }

    }    
}