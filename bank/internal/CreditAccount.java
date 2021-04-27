package bank.internal;

import java.math.BigDecimal;

public class CreditAccount extends Account{
    private final BigDecimal creditLimit;

    public CreditAccount(String accountNumber, BigDecimal creditLimit) {
        super(accountNumber);
        this.creditLimit = creditLimit;
    }

    @Override
    void settingPercents(double per) {
        super.settingPercents(per);
    }

    @Override
    void topUp(BigDecimal amount) {
        super.topUp(amount);
    }

    @Override
    void withDraw(BigDecimal amount) {
        if(super.getBalance().compareTo(creditLimit) == -1){
            throw new IllegalArgumentException("Balance can not be less than credit limit!");
        } else{
            super.withDraw(amount);
        }
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }

    @Override
    void recalculatePercents() {

    }
}
