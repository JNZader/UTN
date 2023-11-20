/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4.ejer4;


/**
 *
 * @author Usuario
 */
public class Normal implements EstadoPopularidad {
    

   Cancion cancion;

    public Normal(Cancion cancion) {
        this.cancion = cancion;
        System.out.println("entra en normal");
    }
    
   

  

    @Override
    public void reproducir() {
       // cancion.setReproducciones(+1);
        if (cancion.getReproducciones() > 50000 && cancion.getDislikes()<=5000 && cancion.getLikes()>20000) {
            cancion.cambiarEstado(new EnTendencia(cancion));
        }else if(cancion.getReproducciones()>1000){
        cancion.cambiarEstado(new EnAuge(cancion));
        }
    }

    @Override
    public void darLike() {
        cancion.setLikes(cancion.getLikes()+1);
    }

    @Override
    public void darDislike() {
        //cancion.setDislikes(+1);
        if (cancion.getDislikes() >= 5000) {
            cancion.cambiarEstado(new Normal(cancion));
        }
    }

    @Override
    public String obtenerLeyenda() {
        return Icono.MUSICAL_NOTE.texto() + " - " + cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getTitulo();
    }
    
    
}
