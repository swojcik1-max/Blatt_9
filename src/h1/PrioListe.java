package h1;

import java.util.ArrayList;

public class PrioListe {
    ArrayList <Patient> myList = new ArrayList<>();

    public void addPatient(Patient p){
        Patient toCompare;
        if(myList.isEmpty()) {
            myList.add(p);
            return;
        }
        toCompare = myList.get(myList.size()-1);
        if(toCompare.prio < p.prio){
            myList.add(p);
            return;
            }
        for(int i = 0; i < myList.size(); i++){
            toCompare = myList.get(i);
            if(p.prio < toCompare.prio ){
                myList.add(i, p);
                return;
            }
        }
    }

    public Patient getNextPatient(){
        if(myList.isEmpty()){
            return null;
        }
        Patient first = myList.get(0);
        myList.remove(0);
        return first;

    }
    public int getPosition(Patient p){
        for(int i = 0; i < myList.size(); i++){
            if(myList.get(i).prio == p.prio){
                return i;
            }
        }
        return -1;
    }
    public void listToString(){
        String all = "These are all the patients, their names and their priority.";
        for(int i = 0; i<myList.size(); i++){
            System.out.println("Patient name: " + myList.get(i).name + ". Patient priority: " + myList.get(i).prio );
        }

    }
}
