package Actividad3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    public static String concatenarPalabrasSLargo(List<String> palabras, int largo){
        return palabras.stream().filter(palabra->palabra.length()>largo).collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("mundo");
        lista.add("cruel");
        lista.add("que se yo");
        lista.add("hoy");

        System.out.println(concatenarPalabrasSLargo(lista,4));

    }
}
