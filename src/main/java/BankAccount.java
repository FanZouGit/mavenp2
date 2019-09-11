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
      if ( balance*3 < amount)
      {
        return -2;
      }
    }

    balance -= amount;
    return amount;
  }

}
