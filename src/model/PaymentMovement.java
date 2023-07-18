package model;

import java.math.BigDecimal;

public class PaymentMovement {

    private BankAccount bankAccount;
    private String description;
    private MovementType movementType;
    private BigDecimal amount;

    public PaymentMovement() {
    }

    public PaymentMovement(BankAccount bankAccount, String description, MovementType movementType, BigDecimal amount) {
        this.bankAccount = bankAccount;
        this.description = description;
        this.movementType = movementType;
        this.amount = amount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


}
