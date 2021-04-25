package bank.internal;

import java.math.BigDecimal;

abstract class Account {
    private final String accountNumber;
    private BigDecimal balance;
    private double percents;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = BigDecimal.ZERO;
        percents = 0.0;
    }

    abstract void recalculatePercents();

    void settingPercents(double per){
        percents = per;
    }

    void topUp(BigDecimal amount) {
        balance = balance.add(amount);
    }

    void withDraw(BigDecimal amount) {
        if(balance.compareTo(amount) == 1) {
            balance = balance.subtract(amount);
        } else{
            balance = balance.ZERO;
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
