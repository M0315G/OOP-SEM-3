class prac7c {
    public static void main(String[] args) {
     
     
     String str="Welcome to Nirma";
     String[] a=str.split(" ");
     for(int i=0;i<a.length;i++)
     {
       String reverse=new String();
       for(int j=a[i].length()-1;j>=0;j--)
       {
         reverse=reverse+a[i].charAt(j);
       }
      //  a[i]=reverse;
       System.out.print(reverse+" ");
     }
    
    }
   }
   
   