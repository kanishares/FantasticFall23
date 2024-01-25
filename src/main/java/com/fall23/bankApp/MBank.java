package com.fall23.bankApp;

public class MBank extends BankBase {

    private double balance = 1000;

    public MBank(long accountNumber) throws Exception {
        super(accountNumber);
        addToAllBankRecords(this);
    }
    public MBank(){
        super();
    };

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 20000) {
            System.err.println("Invalid amount, can not be deposited");
        } else {
            balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount > 15000) {
            System.err.println("Invalid amount, can not be withdrawn");
        } else {
            if (balance < amount){
                System.err.println("Insufficient funds");
            }
            else {
                balance -= amount;
            }

        }
    }

}
