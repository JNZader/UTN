package Actividad4;

public class Auge extends Formato{
    @Override
    public String mostrarIcono() {
        return Icono.ROCKET.texto();
    }

    @Override
    public String mostrarLeyenda(String nomArtista, String titulo, String nombreAlbum, int anioAlbum) {
        return nomArtista + " - " + titulo + " (" + nombreAlbum + " - " + anioAlbum + ")";
    }
}
