public class Driver{
    public static void main(String[]args){
   	 BankAccount a = new BankAccount(100.0, 1234, "HELLO");
     System.out.println(a);
     System.out.println("The current balance for account ID " + a.getAccountID() + " is "+ a.getBalance() + ".");
    }
}
