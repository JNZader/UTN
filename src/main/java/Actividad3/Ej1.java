package Actividad3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ej1 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("mundo");
        lista.add("cruel");

        // imprime lista original agregando un espacio entre cada string
        System.out.println("\nImprime lista original");

        System.out.println(lista.stream().collect(Collectors.joining(" ")));


        // transforma e imprime la lista
        System.out.println("\n\nImprime lista modificada");

        System.out.println(lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" ")));
    }
}
