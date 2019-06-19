package dekorierer;

public class Main {

    public static void main(String[] args) {
        IKuchen donauwelle = new Streusel(new Donauwelle());
        donauwelle.zeigeDetails();
        donauwelle.gibKalorien();

        IKuchen käsekuchen = new Kerzen(new Käsekuchen());
        käsekuchen.zeigeDetails();
        käsekuchen.gibKalorien();

        käsekuchen = new Streusel(käsekuchen);
        käsekuchen.zeigeDetails();
        käsekuchen.gibKalorien();
    }
}
