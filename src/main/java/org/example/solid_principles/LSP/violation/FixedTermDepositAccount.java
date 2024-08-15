package org.example.solid_principles.LSP.violation;

public class FixedTermDepositAccount implements Account{
    // FixedTermDepositAccount violates the LSP
    // because the definition of the current class does not support withdrawals
    // so, it is not substitutable of the s Account

    // - the behavior of the superClass (Account) is to withdraw and deposit
    //   , there are the two main properties here.so, for all the subtypes must behave like
    //   its baseClass. but, the FixedTermDepositAccount doesn't achieve this.
    @Override
    public void withdraw() {
        // throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }

    @Override
    public void deposit() {

    }
}
