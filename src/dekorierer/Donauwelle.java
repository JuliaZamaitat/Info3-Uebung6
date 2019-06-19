package dekorierer;

public class Donauwelle implements IKuchen {
    @Override
    public void zeigeDetails() {
        System.out.println("Ich bin eine Donauwelle");
    }

    @Override
    public void gibKalorien() {
        System.out.println("500 kcal");
    }
}
