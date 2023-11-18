package Actividad4;

public class Normal extends Formato{
    @Override
    public String mostrarIcono() {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    public String mostrarLeyenda(String nomArtista, String titulo, String nombreAlbum, int anioAlbum) {
        return nomArtista + " - " + nombreAlbum + " - " + titulo;
    }
}
