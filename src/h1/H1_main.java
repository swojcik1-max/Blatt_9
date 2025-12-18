package h1;

public class H1_main {
    public static void main( String [] args){

        PrioListe list = new PrioListe();
        Patient A = new Patient("A", 100);
        Patient B = new Patient("B", 10);
        Patient C = new Patient("C", 5);
        Patient D = new Patient("D", 7);

        list.addPatient(A);
        list.addPatient(B);
        list.addPatient(C);
        System.out.println(list.getPosition(B));
        list.addPatient(D);
        list.listToString();
    }
}
