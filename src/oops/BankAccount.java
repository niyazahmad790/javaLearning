package oops;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String ownerName;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int  getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(int balance){
        if(balance < 0){
            System.out.println("Invalid Amount");
        }
        else {
            this.balance = balance;
        }

    }
    public int  getBalance(){
        return balance;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
        acc1.setAccountNumber(12345);
        acc1.setOwnerName("Vikram");
        acc1.setBalance(50000);

        BankAccount acc2 = new BankAccount();
        acc2.setAccountNumber(67890);
        acc2.setOwnerName("Leo");
        acc2.setBalance(-100);


        System.out.println("Account number of first person: " + acc1.getAccountNumber());
        System.out.println("Owner Name  of first person: " + acc1.getOwnerName());
        System.out.println("Balance of first person: " + acc1.getBalance());

        System.out.println("Account number of second person: " + acc2.getAccountNumber());
        System.out.println("Owner Name  of second person: " + acc2.getOwnerName());
        System.out.println("Balance of second person: " + acc2.getBalance());


    }


}

//