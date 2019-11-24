
class OperString
{
     
  public static void main(String argv[])
  {
      String reverse=new String();
      String str="Nirma University";
      System. out. print("String is:");
        System. out. println(str);

      for(int i = str. length() - 1; i >= 0; i--)
      {
        reverse = reverse + str. charAt(i);
      }
        System. out. print("Reversed string is:");
        System. out. println(reverse);

        System.out.print("Replaced String : ");
        System.out.println("ab" + str.substring(1,16));

        System.out.println("Contains Sequence 'Uni' : " + str.contains("Uni"));
        System.out.println("Contains Sequence 'rma' : " + str.contains("rma"));

        StringBuffer S = new StringBuffer(str);
        System.out.println("Reverse String : "+(S.reverse().toString()));
        
  }
  
}