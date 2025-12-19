package h2;

import java.util.ArrayList;

public class Bus {

    ArrayList <Passenger> passengers = new ArrayList<>();
    public Bus(){

    }
    public void enterBus(Passenger p){
        passengers.add(p);
    }
    public void exitBus(){
        for(int i = 0; i < passengers.size(); i++){
            if (passengers.get(i).visited == passengers.get(i).planned) {
                passengers.remove(i);

            }
        }
    }
    public void nextStop(Passenger [] boarding){
        for(int i = 0; i < passengers.size(); i++){
            passengers.get(i).visited ++;
        }
        exitBus();
        for(int x = 0; x < boarding.length; x++){
            passengers.add(boarding[x]);

        }
    }
    public void nextStop(){
        for(int i = 0; i < passengers.size(); i++){
            passengers.get(i).visited ++;
        }
        exitBus();
    }
    public ArrayList<Passenger> findPassengersWithoutTickets(){
        ArrayList <Passenger> removedPassengers = new ArrayList<>();
        for(int i = 0; i < passengers.size(); i++){
            if(!passengers.get(i).ticket){
                removedPassengers.add(passengers.get(i));
                passengers.remove(i);

            }
        }
        return removedPassengers;
    }
    public void transferPassengers(Bus otherBus, String [] passengerNames) {

        for (int i = 0; i < passengers.size(); i++) {
            for (int x = 0; x < passengerNames.length; x++) {
                if (passengers.get(i).name.equals(passengerNames[x])) {
                    otherBus.passengers.add(this.passengers.get(i));
                    this.passengers.remove(i);

                }
            }
        }
    }

    public void printING(){
        String forReturn = "this bus has these Passengers:";
        for(int i = 0; i < passengers.size(); i++){
            forReturn += "   " + passengers.get(i).name;
        }
        System.out.println(forReturn);
    }
}