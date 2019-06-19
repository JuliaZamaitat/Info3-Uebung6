package fassade;

public class Jodel {

    private List<String> antworten;

    public Jodel() {
        antworten = new ArrayList<>();
        antworten.add("42");
        antworten.add("Existieren und nicht zu sterben.");
    }

    public static void nenneMirDenSinnDesLebens(){

        for(String antwort : antworten) {
            System.out.println(antwort);
        }
    }
}
