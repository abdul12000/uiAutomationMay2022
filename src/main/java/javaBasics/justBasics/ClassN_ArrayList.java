package javaBasics.justBasics;

import java.util.ArrayList;

public class ClassN_ArrayList {
    public static void main(String[] args) {


        ArrayList<String> countries = new ArrayList<>();
        countries.add("England");
        countries.add("Poland");
        countries.add("France");
        countries.add("Portugal");
        countries.forEach((n) -> {
            System.out.println(n);
        });

    }
}
