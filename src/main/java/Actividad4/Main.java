package Actividad4;

public class Main {
    public static void main(String[] args) {

        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the Head", 2002);

        // Caso de prueba 1: "The Scientist" recién se lanza (tiene popularidad normal).
        theScientist.reproducir(500, 10000, 2000, true);
        System.out.println(theScientist.mostrarIcono() + " - " + theScientist.mostrarLeyenda());

        // Caso de prueba 2: "The Scientist" está en auge por superar el mínimo de reproducciones esperadas.
        theScientist.reproducir(2000, 30000, 1000, true);
        System.out.println(theScientist.mostrarIcono() + " - " + theScientist.mostrarLeyenda());

        // Caso de prueba 3: "The Scientist" baja del auge por tener muchos dislikes.
        theScientist.reproducir(2500, 20000, 5000, true);
        System.out.println(theScientist.mostrarIcono() + " - " + theScientist.mostrarLeyenda());

        // Caso de prueba 4: "The Scientist" es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema.
        theScientist.reproducir(70000, 30000, 5000, true);
        System.out.println(theScientist.mostrarIcono() + " - " + theScientist.mostrarLeyenda());

        // Caso de prueba 5: "The Scientist" era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas.
        theScientist.reproducir(0, 0, 0, false);
        System.out.println(theScientist.mostrarIcono() + " - " + theScientist.mostrarLeyenda());
    }
}
