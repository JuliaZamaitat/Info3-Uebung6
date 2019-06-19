package dekorierer;

public class Kerzen extends Dekoration {
    public Kerzen(IKuchen kuchen){
        this.kuchen = kuchen;
    }

    @Override
    public void zeigeDetails() {
        kuchen.zeigeDetails();
        System.out.println("Es wurden Kerzen hinzugefügt");
    }

    @Override
    public void gibKalorien() {
       kuchen.gibKalorien();
       System.out.println("Es wurden keine kcal hinzugefügt, außer du isst die Kerzen.");
    }

    public void pusteAus(){
        System.out.println("Die Kerzen wurden ausgepustet");
    }
}
