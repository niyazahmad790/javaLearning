public class bankSystem {

        int accountNumber;
        String holderName;
        int balance;
        String accountType;

      static   void checkbalace(int balance){
           System.out.println("Your Balance is " + balance);
        }

        static void holerName(String holderName){
            System.out.println("Holder Name " + holderName);
        }

  public static void main(String[] args){
           bankSystem user1 = new bankSystem();
           bankSystem user2 = new bankSystem();

           user1.accountNumber = 7587;
           user1.holderName = "Rahul";
           user1.accountType = "Saving";
           user1.balance = 500000;

           user2.accountNumber = 1234;
           user2.holderName = "Ayan";
           user2.accountType = "Current";
           user2.balance = 600000;

      holerName(user1.holderName);

       System.out.println("Account Number, " + user1.accountNumber + " Holder Name " + user1.holderName + " Account Type " + user1.accountType + " Balance" + user1.balance);

      checkbalace(user1.balance);

      holerName(user2.holderName);

       System.out.println("Account Number " + user2.accountNumber + " Holder Name " + user2.holderName + " Account Type " + user2.accountType + " Balance" + user2.balance);

       checkbalace(user2.balance);



   }

}
