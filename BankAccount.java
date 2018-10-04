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

  public boolean withdraw (double amount) {
    if (balance - amount > 0) {
      balance = balance - amount;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean authenticate(String password) {
    return this.password.equals(password);
  }

  public boolean transferTo (BankAccount other, double amount, String password) {
    if (this.authenticate(password) && this.withdraw(amount)) {
      this.withdraw(amount);
      other.deposit(amount);
      return true;
    }
    else {
      return false;
    }
  }
}
