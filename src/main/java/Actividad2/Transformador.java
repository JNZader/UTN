package Actividad2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TransformadorString {
    String transform(String entrada);
}

public class Transformador {
    public static List<String> transformStrings(List<String> inputList, TransformadorString transformer) {
        List<String> result = new ArrayList<>();
        for (String input : inputList) {
            String transformed = transformer.transform(input);
            result.add(transformed);
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("mundo");
        lista.add("cruel");

        // imprime lista original
        System.out.println("\nImprime lista original");
        for (String aux : lista) {
            System.out.print(aux+" ");
        }

        // instancia la interfaz funcional para transformar a mayusculas
        TransformadorString aMayuscula = str -> str.toUpperCase();

        // transforma la lista de strings
        List<String> listaMayuscula = transformStrings(lista, aMayuscula);

        // imprime el resultado
        System.out.println("\n\nImprime lista modificada");
        for (String aux : listaMayuscula) {
            System.out.print(aux+" ");
        }
    }
}
