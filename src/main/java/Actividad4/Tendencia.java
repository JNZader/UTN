package Actividad4;

public class Tendencia extends Formato{
    @Override
    public String mostrarIcono() {
        return Icono.FIRE.texto();
    }

    @Override
    public String mostrarLeyenda(String nomArtista, String titulo, String nombreAlbum, int anioAlbum) {
        return nomArtista + " - " + titulo + " (" + nombreAlbum + " - " + anioAlbum + ")";
    }
}
