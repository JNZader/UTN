package Actividad4;

public interface Estado {
    String mostrarIcono();
    String mostrarLeyenda();
    Estado actualizarEstado(int reproducciones, int likes, int dislikes, boolean ultimaReproduccion);
}
