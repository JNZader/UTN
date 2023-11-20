
package Actividad4.ejer4;

import java.time.LocalDateTime;


public class Cancion {
     private String titulo;
    private String artista;
    private String album;
    private int anoAlbum;
    private EstadoPopularidad estado;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private LocalDateTime ultimaReproduccion;

    public Cancion(String titulo, String artista, String album, int anoAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anoAlbum = anoAlbum;
        this.estado = new Normal(this);
        this.reproducciones = 0;
        this.likes=0;
        this.dislikes=0;
        this.ultimaReproduccion=null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getAnoAlbum() {
        return anoAlbum;
    }

    public void setAnoAlbum(int anoAlbum) {
        this.anoAlbum = anoAlbum;
    }

    public EstadoPopularidad getEstado() {
        return estado;
    }

    public void setEstado(EstadoPopularidad estado) {
        this.estado = estado;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }
    
    
    
    public void reproducir(){
        estado.reproducir();
        ultimaReproduccion=LocalDateTime.now();
    }
    //al final se usaron los getter and setter de like y dislike para los test
    public void darLike(){
        estado.darLike();
    }
    public void darDisLike(){
        estado.darDislike();
    }
    
    public void cambiarEstado(EstadoPopularidad nuevoEstado){
    this.estado = nuevoEstado;
    }
    
     public String obtenerLeyenda() {
        return estado.obtenerLeyenda();
    }
    
}
