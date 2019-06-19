package dekorierer;

public class Käsekuchen implements IKuchen {

    @Override
    public void zeigeDetails() {
        System.out.println("Ich bin ein Käsekuchen");
    }

    @Override
    public void gibKalorien() {
        System.out.println("300 kcal");
    }
}
