import java.util.*;
class Prac7d {
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
 
  System.out.println("Enter your Paragraph:");
  String para=sc.nextLine();
  String[] sen=para.split("[?.!]");
  String temp;

  

  for(int i =0;i<sen.length-1;i++)
  {
    for(int j=0;j<sen.length-i-1;j++)
    {
      if(sen[j].split(" ").length > sen[j+1].split(" ").length)
      {
        temp=sen[j];
        sen[j]=sen[j+1];
        sen[j+1]=temp;
      }
    }
  }
  System.out.println("-----------------------------------------------");
  for(int i =0;i<=sen.length-1;i++)
  {
    System.out.println( "\n" + sen[i].trim() + " " + sen[i].trim().split(" ").length);
  }

  System.out.println("-----------------------------------------------");
 
 }
 
}

