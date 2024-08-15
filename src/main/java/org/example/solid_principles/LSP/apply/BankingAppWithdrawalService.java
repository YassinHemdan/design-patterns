package org.example.solid_principles.LSP.apply;

// https://www.baeldung.com/java-liskov-substitution-principle
public class BankingAppWithdrawalService {
    private WithdrawalAccount account;
    public BankingAppWithdrawalService(WithdrawalAccount account){
        this.account = account;
    }
    public void withDraw(){
        account.withdraw();
    }
}
