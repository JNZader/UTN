package Actividad4;

public class Cancion {
    private String nombre;
    private String artista;
    private String album;
    private int anio;
    private Estado estado = (Estado) new Normal();

    public Cancion(String nombre, String artista, String album, int anio) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Formato getEstado() {
        return (Formato) estado;
    }

    public void setEstado(Formato estado) {
        this.estado = (Estado) estado;
    }
    public void reproducir(int reproducciones, int likes, int dislikes, boolean ultimaReproduccion) {
        estado = estado.actualizarEstado(reproducciones, likes, dislikes, ultimaReproduccion);
    }

    public String mostrarIcono() {
        return estado.mostrarIcono();
    }

    public String mostrarLeyenda() {
        return estado.mostrarLeyenda();
    }
}
