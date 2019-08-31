public class BankAccount {

  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
      if ( balance*2 < amount)
      {
        return -1;
      }
    }

    balance -= amount;
    return amount;
  }

}
