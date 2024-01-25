package com.fall23.bankApp;

import java.awt.image.BandedSampleModel;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class BankBase implements Bank {

    private long accountNumber;

    public static Set<BankBase> allBankRecords = new HashSet<>();

    public BankBase(long accountNumber) {
        if (Long.toString(accountNumber).length() != 10) {
            throw new IllegalArgumentException("Account number must be 10 digits");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public BankBase() {
    }

    public static void addToAllBankRecords(BankBase bank) throws Exception {
        if (!allBankRecords.isEmpty()) {
            for (BankBase base : allBankRecords) {
                if (base.accountNumber == bank.accountNumber) {
                    throw new Exception("This account number " + bank.accountNumber+ " is already exists, please try to enter another numbers" );
                } else {
                    allBankRecords.add(bank);
                }

            }

        } else {
            allBankRecords.add(bank);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankBase base = (BankBase) o;
        return accountNumber == base.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public long getAccountNumber () {
            return accountNumber;
        }

        public void setAccountNumber ( long accountNumber){
            this.accountNumber = accountNumber;
        }


    }

