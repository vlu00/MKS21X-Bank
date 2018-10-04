public class Driver{
    public static void main(String[]args){
   	 BankAccount a = new BankAccount(1000.0, 1234, "HELLO");
     BankAccount b = new BankAccount(100.0, 1111, "HELLO");
     System.out.println(a);
     System.out.println("The current balance for account ID " + a.getAccountID() + " is "+ a.getBalance() + ".");
     a.setPassword("Puppies");
     System.out.println("Your password is " + a.getPassword() + ".");

     if (a.deposit(-50)) {
       System.out.println("Deposit is a success!");
     }
     else {
       System.out.println("Deposit is a failure.");
     }

    if (a.withdraw(50)) {
      System.out.println("Withdrawl is a success!");
      System.out.println("The current balance for account ID " + a.getAccountID() + " is "+ a.getBalance() + ".");
    }
    else {
      System.out.println("Withdrawl is a failure.");
    }

    System.out.println(a.authenticate("puppies"));
  }
}
