package service;

import model.Insurance;
import model.InsuranceTypeEnum;

public class InsuranceService {
    public Insurance createInsurance(InsuranceTypeEnum insuranceTypeEnum, String name){
        Insurance ınsurance=new Insurance();
        ınsurance.setName(name);
        ınsurance.setInsuranceTypeEnum(insuranceTypeEnum);
        return ınsurance;

    }
}
