import java.io.*;


class display_10f
{
    public static void main(String[] args) {
        String line;
        File f = new File("data.txt");
        try{
        BufferedReader br = new BufferedReader(new FileReader(f));
        line=br.readLine();
        while(line!=null){
        System.out.println(line);
        line=br.readLine();
        }
        br.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}