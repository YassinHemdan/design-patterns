package org.example.solid_principles.LSP.violation;
public class BankingAppWithdrawalService {
    private Account account;
    public BankingAppWithdrawalService(Account account){
        this.account = account;
    }
    public void withDraw(){
        account.withdraw();
    }
}
