package fassade;

public class Fassade {

    public void nenneMirDenSinnDesLebens(Object obj){
        if (obj instanceof Hund) TierfluesterIn.nenneMirDenSinnDesLebens();
        else if (obj instanceof Kind) Mutter.nenneMirDenSinnDesLebens();
        else if (obj instanceof RentnerIn) AltenpflegerIn.nenneMirDenSinnDesLebens();
        else if (obj instanceof InformatikerIn) Computer.nenneMirDenSinnDesLebens();
        else if (obj instanceof StudentIn) Jodel.nenneMirDenSinnDesLebens();
        else PhilosophIn.nenneMirDenSinnDesLebens();
    }
}
