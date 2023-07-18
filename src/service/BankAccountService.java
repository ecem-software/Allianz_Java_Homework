package service;

import model.Agency;
import model.BankAccount;
import java.math.BigDecimal;

public class BankAccountService {
    public BankAccount createBankAccount(String bankName, String iban, BigDecimal amount) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName(bankName);
        bankAccount.setIban(iban);
        bankAccount.setAmount(amount);
        return bankAccount;
    }

    public BankAccount getAgencyBankAccountWithEnoughMoney(Agency Agency, BigDecimal amount) {
        for (BankAccount bankAccount : Agency.getBankAccountList()) {
            if (bankAccount.getAmount().compareTo(amount) >= 0) {
                return bankAccount;
            }
        }
        return null;
    }
}