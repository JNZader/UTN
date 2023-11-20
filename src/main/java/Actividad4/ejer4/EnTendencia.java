
package Actividad4.ejer4;

import java.time.Duration;
import java.time.LocalDateTime;


public class EnTendencia implements EstadoPopularidad {

   Cancion cancion;

    public EnTendencia(Cancion cancion) {
        this.cancion = cancion;
        System.out.println("entra en tendencia");
    }
    
   

  

    @Override
    public void reproducir() {
        if (!ultimaReproduccion24Hora()) {
            cancion.cambiarEstado(new Normal(cancion));
        }
    }

    @Override
    public void darLike() {
        cancion.setLikes(+1);
    }

    @Override
    public void darDislike() {
        cancion.setDislikes(+1);
        if (cancion.getDislikes() >= 5000) {
            cancion.cambiarEstado(new Normal(cancion));
        }
    }

    @Override
    public String obtenerLeyenda() {
        return Icono.FIRE.texto() + " - " + cancion.getTitulo() + " - "+cancion.getArtista()+"("+cancion.getAlbum()+" - "+cancion.getAnoAlbum()+")";
    }
    
    private boolean ultimaReproduccion24Hora(){
        if (cancion.getUltimaReproduccion() != null ) {
            LocalDateTime ahora = LocalDateTime.now();
            Duration duracionDesdeUltimaReproduccion = Duration.between(cancion.getUltimaReproduccion(), ahora);
            
            return duracionDesdeUltimaReproduccion.toHours()<24;
        }
        return false;
    }

}
