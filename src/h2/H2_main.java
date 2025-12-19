package h2;

public class H2_main {
    public static void main( String [] args){
        Bus busA = new Bus();
        Bus busB = new Bus();

        Passenger anna = new Passenger("Anna", 2, true);
        Passenger ben = new Passenger("Ben", 2, true);
        Passenger clara = new Passenger("Clara", 3, true);
        Passenger tim = new Passenger("Tim", 3, true);
        Passenger carter = new Passenger("Carter", 3, true);
        Passenger bird = new Passenger("Bird", 3, true);



        Passenger [] b = {clara, tim, carter, bird};
        busA.enterBus(anna);
        busA.enterBus(ben);
        busA.nextStop(b);

        //busA.nextStop();
        //busA.nextStop();

        busA.findPassengersWithoutTickets();

        String[] transfer = {"Anna","Ben", "Tim", "Bird"};
        busA.transferPassengers(busB, transfer);
        busA.printING();
        busB.printING();


    }
}
