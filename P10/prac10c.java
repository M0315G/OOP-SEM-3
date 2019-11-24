import java.util.*;
import java.io.*;

class prac10c
{
    public static void main(String[] args) {
        
        File f = new File("name.txt"); 
        for(int i=0;i<args.length;i++)
        {

            Thread t = new Thread(new search(f,args[i]));
            t.start();
        }
    }
}

class search implements Runnable
{
    File f;
    String name;
    String temp;
    public search(File f,String name)
    {
        this.f=f;
        this.name=name;

    }

    public void run() {
        Scanner input;
        try{
        input = new Scanner(f);
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
            return;
        }
        boolean flag = false;
        while(input.hasNextLine()) {
            flag = input.nextLine().toLowerCase().contains(name.toLowerCase());
            if (flag) {
                break;
            }
        }

        if(flag){
            System.out.println(name + " found in the file");
        }
        else{
            System.out.println(name + " not found in the file");
        }
    }
}