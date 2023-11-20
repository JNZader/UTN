/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Actividad4.ejer4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {
       
        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);


         String separador = "\n" + "-".repeat(60) + "\n\n";

        
        System.out.println("");
        System.out.println("Popularidad Normal");
        theScientist.setLikes(1000);
        theScientist.setDislikes(100);
       
        theScientist.reproducir();
        System.out.print(separador + theScientist.obtenerLeyenda() + separador);
        System.out.println("Popularidad en Auge");
        theScientist.setLikes(1001);
        theScientist.setDislikes(100);
        theScientist.setReproducciones(1001);
        theScientist.reproducir();
        System.out.print(separador + theScientist.obtenerLeyenda() + separador);
        System.out.println("Popularidad baja de Auge por muchos dislikes");
        theScientist.setReproducciones(2000);
        theScientist.setLikes(25000);
        theScientist.setDislikes(6000);
        theScientist.reproducir();
        System.out.print(separador + theScientist.obtenerLeyenda() + separador);
        System.out.println("Popularidad es Tendencia por record");
        theScientist.setReproducciones(55000);
        theScientist.setLikes(28000);
        theScientist.setDislikes(1);
        theScientist.reproducir();
        System.out.print(separador + theScientist.obtenerLeyenda() + separador);
        System.out.println("Popularidad era Tendencia");
        theScientist.setLikes(1000);
        theScientist.setDislikes(100);
        theScientist.setUltimaReproduccion(LocalDateTime.now().minus(25,ChronoUnit.HOURS));
        theScientist.reproducir();
        System.out.print(separador + theScientist.obtenerLeyenda() + separador);
    }
}
