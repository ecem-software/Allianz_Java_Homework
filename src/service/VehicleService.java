package service;

import model.Accident;
import model.ColorTypeEnum;
import model.Vehicle;

import java.util.ArrayList;

public class VehicleService {
    public Vehicle CreateVehicle(String brand, String model, String plate, String chassisNumber, int modelYear, ArrayList<Accident> accidentList, ColorTypeEnum color){
        Vehicle vehicle =new Vehicle();
        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setPlate(plate);
        vehicle.setChassisNumber(chassisNumber);
        vehicle.setModelYear(modelYear);
        vehicle.setAccidentList(accidentList);

        return vehicle;
    }

    public void addAccidentListToVehicle(Vehicle vehicle,Accident accident ){
        if(vehicle.getAccidentList()!=null){
            vehicle.getAccidentList().add(accident);
        }else{
            ArrayList<Accident> accidentList=new ArrayList<>();
            accidentList.add(accident);
            vehicle.setAccidentList(accidentList);
            
        }
    }
}
