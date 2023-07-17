package service;

import model.BankAccount;
import model.Insurance;
import model.InsuranceCompany;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InsuranceCompanyService {
    public InsuranceCompany createInsuranceCompanyService(String name, String taxOffice, String taxNumber, String address, BigDecimal commission){
        InsuranceCompany ınsuranceCompany=new InsuranceCompany();
        ınsuranceCompany.setName(name);
        ınsuranceCompany.setTaxOffice(taxOffice);
        ınsuranceCompany.setTaxNumber(taxNumber);
        ınsuranceCompany.setAddress(address);
        ınsuranceCompany.setCommission(commission);
        return ınsuranceCompany;



    }

    public void addInsuranceToInsuranceCompany(InsuranceCompany ınsuranceCompany, Insurance ınsurance){
        if(ınsuranceCompany.getInsuranceList()!=null){
            ınsuranceCompany.getInsuranceList().add(ınsurance);
        }
        else{
            ArrayList<Insurance> ınsuranceList =new ArrayList<>();
            ınsuranceList.add(ınsurance);
            ınsuranceCompany.setInsuranceList(ınsuranceList);
        }

        }

        public void addBankAccountToInsuranceCompany(BankAccount bankAccount, InsuranceCompany ınsuranceCompany){
            if(ınsuranceCompany.getBankAccountList()!=null){
                ınsuranceCompany.getBankAccountList().add(bankAccount);

            }

            else{
                ArrayList<BankAccount> bankAccountList=new ArrayList<>();
                bankAccountList.add(bankAccount);
                ınsuranceCompany.setBankAccountList(bankAccountList);
            }
        }
}
