package com.fall23.bankApp;

public class DemirBank extends BankBase  {

    private double balance = 5000 ;

    public DemirBank(long accountNumber) {
        super(accountNumber);
    }

    @Override
    public double getBalance() {
        return balance;
    }


    public void setBalance(double newBalance) {
        this.balance = newBalance;
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
            if (balance < amount) {
                System.err.println("Insufficient funds");
            } else {
                balance -= amount;
            }

        }
    }
    static void transferFunds(Bank sender, Bank recipient, double transferAmount) {
        if ( sender.getBalance() >= transferAmount){
            double commission = 0.1 *transferAmount;

            sender.withDraw(transferAmount + commission);
            recipient.deposit(transferAmount);

            System.out.println("The transfer in amount of  " + transferAmount +"  soms was successful. Commission: " + commission +" soms");
        } else {

            System.err.println("Error: Insufficient funds in the sender's account.");
        }
    }
    }

