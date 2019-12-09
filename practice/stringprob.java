import java.util.InputMismatchException;
import java.util.Scanner;

class stringprob{
    public static void main(String[] args) {
        int size;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of strings:");
        while(true){
            try{
                size=sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("enter an integer!");
            }
        }
        sc.nextLine();

        String[] sen= new String[size];
        int i=0;
        while(i<size){
            System.out.println("Enter the String "+(i+1));
            sen[i]=sc.nextLine().toUpperCase();
            i++;
        }


        for(int j=0;j<sen.length;j++){
            if((j+1)%2==0){
                //System.out.println("Even");
                String[] splitted_string= sen[j].split("[. ]");
                sen[j]="";
                for(int k=(splitted_string.length)-1;k>0;k--){
                    sen[j]+=splitted_string[k]+" ";
                }
                sen[j]+=splitted_string[0]+".";
            }else{
                //System.out.println("Odd");
                char[] chararr= sen[j].toCharArray();
                for(int k=0;k<chararr.length;k++){
                    if(chararr[k]==' '||chararr[k]=='.'){
                        continue;
                    }else if(chararr[k]=='Y'){
                        chararr[k]='A';
                    }else if(chararr[k]=='Z'){
                        chararr[k]='B';
                    }
                    chararr[k]+=2;
                }
                String extra = new String(chararr);
                sen[j]=extra;
            }

        }

        i=0;
        while(i<size){
            System.out.println(sen[i]);
            i++;
        }
        
        
        
    }
}