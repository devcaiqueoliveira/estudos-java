package jcf;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Movimento");
        stringArrayList.add("Movimento");
        stringArrayList.add("Ciruclar");
        stringArrayList.add("Ondular");
        stringArrayList.add("Musculação");
        stringArrayList.add("Perpendicular");

        Set<String> stringsSet = new HashSet<>();
        stringsSet.add("Movimento");
        stringsSet.add("Circular");
        stringsSet.add("Ondular");
        stringsSet.add("Musculação");
        stringsSet.add("Perpendicular");

        Map<Long, String> identificadores = new HashMap<>();
        identificadores.put(1L, "Lahiri");
        identificadores.put(2L, "Lahiri");

    }
}