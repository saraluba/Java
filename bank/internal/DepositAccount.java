package bank.internal;

import java.math.BigDecimal;

public class DepositAccount extends Account{

    public DepositAccount(String accountNumber) {
        super(accountNumber);
        if(super.getBalance().compareTo(BigDecimal.valueOf(0)) == -1){
            throw new IllegalArgumentException("Balance can not be a negative number!");
        }
    }

    @Override
    void topUp(BigDecimal amount) {
        super.topUp(amount);
    }

    @Override
    void recalculatePercents() {

    }
}
