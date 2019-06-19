package fassade;

import java.util.ArrayList;
import java.util.List;

public class Jodel {

    private static List<String> antworten = new ArrayList<>() {
        {
           add("42");
           add("Existieren und nicht zu sterben.");
            add("Die Zeit zwischen Geburt und Tod gut zu nutzen");
            add("Rothi-Lebe dein Leben (Die 1. Minute)");
            add("Auf Youtube");
        }
    };

    public static void nenneMirDenSinnDesLebens(){
        for(String antwort : antworten) {
            System.out.println(antwort);
        }

    }
}
