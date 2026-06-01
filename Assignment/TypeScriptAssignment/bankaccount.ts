class BankAccount {
  private balance: number;

  constructor(initialBalance: number) {
    this.balance = initialBalance;
  }

  deposit(amount: number): void {
    this.balance += amount;
    console.log(`Deposited: ${amount}`);
  }

  withdraw(amount: number): void {
    if (amount > this.balance) {
      console.log("Insufficient funds");
      return;
    }
    this.balance -= amount;
    console.log(`Withdrawn: ${amount}`);
  }

  getBalance(): number {
    return this.balance;
  }
}

// Example
const account = new BankAccount(1000);
account.deposit(500);
account.withdraw(300);
console.log(account.getBalance());