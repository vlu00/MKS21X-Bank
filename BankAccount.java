public class BankAccount {
  public double balance;
  public int accountID;
  public String password;

  public BankAccount(double b, int a, String p) {
    balance = b;
    accountID = a;
    password = p;
  }

  public String toString () {
    return "" + accountID + "\t" + balance;
  }

  public double getBalance () {
    return balance;
  }

  public int getAccountID () {
    return accountID;
  }

  public String getPassword () {
    return password;
  }

  public void setPassword (String newpass) {
    password = newpass;
  }

  public boolean deposit (double amount) {
    if (amount > 0) {
      balance = balance + amount;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean withdrawl (double amount) {
    if (balance - amount > 0) {
      balance = balance - amount;
      return true;
    }
    else {
      return false;
    }
  }

}
