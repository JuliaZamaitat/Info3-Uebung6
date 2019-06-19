package dekorierer;

public class Streusel extends Dekoration {
    public Streusel(IKuchen kuchen){
        this.kuchen = kuchen;
    }

    @Override
    public void zeigeDetails() {
        kuchen.zeigeDetails();
        System.out.println("Streusel wurden hinzugefügt.");
    }

    @Override
    public void gibKalorien() {
        kuchen.gibKalorien();
        System.out.println("Durch die Streusel kommen 50 kcal hinzu.");
    }

    public void bewundern(){
        System.out.println("Die Streusel wurden bewundert.");
    }
}
