package OOAD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingGround {

    List<ParkingSlot> parkingSlots;
    List<ParkedCar> parkedCars;

    Map<Integer,ParkedCar> mapOfCarsandSlot;

    //considering we have 100 parking slots
    ParkingGround(){
        parkingSlots = new ArrayList<>(100);
        mapOfCarsandSlot = new HashMap<>(100);
    }

    public List<ParkingSlot> getAllAvailableParkingSlots(){

        return parkingSlots.stream().filter((parkingSlot -> parkingSlot.availability==true)).collect(Collectors.toList());
    }

    public int scanCar(ParkedCar incomingCar){
        List<ParkingSlot> slots = getAllAvailableParkingSlots();
        if(!slots.isEmpty()){
            // turn the status of availability as false for list 0th index
            ParkingSlot chosenSlot = slots.get(0);
            int slotid = chosenSlot.getParkingId();
            chosenSlot.setAvailability(false);
            mapOfCarsandSlot.put(slotid,incomingCar);
             return slotid;
        }else{
            return 0;
        }
    }

    public List<String> registrationNumbers(String color){

        return parkedCars.stream()
                .filter(parkedCar -> parkedCar.getColor().equals(color))
                .map(ParkedCar::getCarRegistrationNo)
                .collect(Collectors.toList());

    }

    public Integer slotNo(String registrationNo){
        //returning the key of a map with a condition match from value object
        Integer slot=0;
        for(Map.Entry<Integer,ParkedCar> entryObj :mapOfCarsandSlot.entrySet()){
            ParkedCar parkedCar = entryObj.getValue();
            if(parkedCar.getCarRegistrationNo().equals(registrationNo)){
                 slot = entryObj.getKey();
            }
        }
        return slot;

    }

    public List<Integer> listOfAllSlots(String color){
       return null;

    }




}
