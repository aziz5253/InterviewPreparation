"use strict";
class BankAccount {
    balance;
    constructor(initialBalance) {
        this.balance = initialBalance;
    }
    deposit(amount) {
        this.balance += amount;
        console.log(`Deposited: ${amount}`);
    }
    withdraw(amount) {
        if (amount > this.balance) {
            console.log("Insufficient funds");
            return;
        }
        this.balance -= amount;
        console.log(`Withdrawn: ${amount}`);
    }
    getBalance() {
        return this.balance;
    }
}
// Example
const account = new BankAccount(1000);
account.deposit(500);
account.withdraw(300);
console.log(account.getBalance());
