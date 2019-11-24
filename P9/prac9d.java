import java.util.Scanner;

class NegativeAmountException extends Exception{
    NegativeAmountException(String S){
        super(S);
    }
}

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String S){
        super(S);
    }
}

class LowBalanceException extends Exception{
    LowBalanceException(String S){
        super(S);
    }
}
class BankAccount {

    int accNo;
    String custName;
    String accType;
    float balance;
    
    BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmountException{
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;

        if(accType.equals("Savings") && balance<= 1000){
            throw new LowBalanceException("VeryLow Balance!");
        }
        if(accType.equals("Current") && balance <= 5000){
            throw new LowBalanceException("Very Low Balance!");
        }
        if(balance <=0) {
            this.balance = 0;
            throw new NegativeAmountException("Not valid amount!\nEnter Positive Value!");
        } 
        this.balance = balance;
    }

    void deposit(float amt) throws NegativeAmountException{
        if (amt <= 0){
            throw new NegativeAmountException("Not valid amount.Enter Positive Value!");
        }
        balance += amt;
    }

    void withDraw(float amt)throws InsufficientFundsException, NegativeAmountException{     
        if(amt <=0) {
            throw new NegativeAmountException("Not valid amount.\nEnter Positive Amount!");
        }        
        if(accType.equals("Savings") && ((balance - amt) <= 1000)){
            throw new InsufficientFundsException("Withdraw action cancled because of insufficient funds.\nMinimum 1000 should be there !");
        }
        if(accType.equals("Current") && ((balance - amt) <= 5000)){
            throw new InsufficientFundsException("Withdraw action cancled because of insufficient funds.\nMinimum 5000 should be there !");
        }
        balance -= amt;
    }

    float getBalance() throws LowBalanceException{
        if(accType.equals("Savings") && balance<= 1000){
            throw new LowBalanceException("Low Balance!");
        }
        if(accType.equals("Current") && balance <= 5000){
            throw new LowBalanceException("Low Balance!");
        }
        return balance;
    }
}

public class prac9d {
    public static void main(String[] args) {
        String accType, Name;
        float balance;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter Name of the Account Holder: ");
        Name = S.nextLine();

        System.out.println("Enter Type of the Account: ");
        accType = S.nextLine();

        BankAccount b;

        
        while(true){
        try {
            System.out.println("Enter Initial Balance: ");
            balance = S.nextFloat();
            b = new BankAccount(1, Name, accType, balance);
            break;
        }catch (LowBalanceException | NegativeAmountException e) {
                System.out.println(e.getMessage());
            }
        }


        Exe:
        while(true){
        try { 
            System.out.println("\n-----------------------\n");
            System.out.println("Choices:\nEnter 1 to Deposit\nEnter 2 to Withdraw\nEnter 3 to  GetBalance\nEnter to 4 Exit");
            System.out.println("\n-----------------------\n");
            int choice;

            choice = S.nextInt();

            switch(choice){
                case 1:System.out.println("Enter Deposit Amount: ");
                    b.deposit(S.nextFloat());
                    break;
                case 2:System.out.println("Enter Withdrawl Amount: ");
                    b.withDraw(S.nextFloat());
                    break;

                case 3:System.out.println("Your Balance : ");
                    System.out.println(b.getBalance());
                    break;

                case 4:
                    break Exe;
            }
        }
        catch (LowBalanceException | NegativeAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
    
}