
import java.io.*;

class filepractice{
    public static void main(String[] args) {
        File f= new File("./file1.txt");
        try{
            f.createNewFile();
        }catch(Exception e){}
        FileWriter writer;
        try{
            writer= new FileWriter(f,true);
            writer.write("Hello\r\n");
            writer.write("Manish\r\n");
            writer.close();
        }catch(Exception e){}

        
        BufferedReader br;
        String line;
        try{
            br= new BufferedReader(new FileReader(f));
            if((line=br.readLine())!=null){
                System.out.println(line);
            }
            
            br.close();
        }catch(Exception e){}
      

        
    }
}