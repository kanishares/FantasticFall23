package com.fall23.bankApp;

public class BankerDemo {

    public static void main(String[] args) throws Exception {
        MBank aidarAcc = new MBank(1234567890);
        aidarAcc.deposit(15000);
        System.out.println(aidarAcc.getBalance());
        System.out.println("___________________");


        MBank bemAcc = new MBank(1234567891);
        System.out.println(bemAcc.getBalance());

        System.out.println("___________________");

        Bank.transferFunds(aidarAcc,bemAcc,5000);

        System.out.println("Aidar's account after: " +aidarAcc.getBalance());
        System.out.println("Bem's account after: " + bemAcc.getBalance());
        System.out.println();

        DemirBank kaniAcc = new DemirBank(1715496258);
        System.out.println("Initial Kani's balance is : " + kaniAcc.getBalance() +" soms");
        System.out.println("___________________");

        DemirBank.transferFunds(kaniAcc, bemAcc, 4200);
        System.out.println("___________________");
        System.out.println("Initial Kani's balance is : " + kaniAcc.getBalance()+ " soms");
        System.out.println("___________________");
        System.out.println("Initial Bema's balance is : " + bemAcc.getBalance()+ " soms");





    }
}
