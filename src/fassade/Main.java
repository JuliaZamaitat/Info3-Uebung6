package fassade;

public class Main {
    public static void main(String[] args){
        Fassade fassade = new Fassade();

        Hund hund = new Hund();
        StudentIn studentIn = new StudentIn();
        Kind kind = new Kind();
        RentnerIn rentnerIn = new RentnerIn();
        InformatikerIn informatikerIn = new InformatikerIn();


        System.out.println("Ein Hund fragt nach dem Sinn des Lebens.");
        fassade.nenneMirDenSinnDesLebens(hund);

        System.out.println("... und ein Studierender.");
        fassade.nenneMirDenSinnDesLebens(studentIn);

        System.out.println("... und ein Kind.");
        fassade.nenneMirDenSinnDesLebens(kind);

        System.out.println("... sowie ein Rentner.");
        fassade.nenneMirDenSinnDesLebens(rentnerIn);

        System.out.println(" und zuletzt ein Informatiker.");
        fassade.nenneMirDenSinnDesLebens(informatikerIn);

    }
}
