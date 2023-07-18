package service;

import model.Accident;

import java.math.BigDecimal;
import java.util.Date;

public class AccidentService {
    // We create a new object and return it after setting the required values.
    public Accident createaccident(Date accidentDate, String description, BigDecimal damagePrice, int failureRate){
        Accident accident=new Accident();
        accident.setAccidentDate(accidentDate);
        accident.setDescription(description);
        accident.setDamagePrice(damagePrice);
        accident.setFailureRate(failureRate);
        return accident;



    }
}
